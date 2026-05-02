#!/bin/bash

# Update system
echo "Updating system..."
sudo apt-get update

# Install Node.js if not installed
if ! command -v node &> /dev/null
then
    echo "Installing Node.js..."
    curl -fsSL https://deb.nodesource.com/setup_20.x | sudo -E bash -
    sudo apt-get install -y nodejs
fi

mkdir -p ~/webrtc-signaling
cd ~/webrtc-signaling

npm init -y
npm install ws

# Используем 'EOF' чтобы Bash не пытался интерпретировать символы внутри JS кода
cat <<'EOF' > server.js
const WebSocket = require('ws');
const http = require('http');
const fs = require('fs');

const server = http.createServer((req, res) => {
    res.writeHead(404);
    res.end();
});

const wss = new WebSocket.Server({ noServer: true });

const PASSWORDS_FILE = './passwords.json';
let tokenPasswords = {};
if (fs.existsSync(PASSWORDS_FILE)) {
    try { tokenPasswords = JSON.parse(fs.readFileSync(PASSWORDS_FILE)); } catch (e) { tokenPasswords = {}; }
}

function savePasswords() {
    fs.writeFileSync(PASSWORDS_FILE, JSON.stringify(tokenPasswords));
}

let apps = new Map();
let viewers = new Map();

function broadcastAppList() {
    viewers.forEach((subs, ws) => {
        if (ws.readyState === WebSocket.OPEN && ws.userToken) {
            const myApps = Array.from(apps.keys()).filter(id => id.startsWith(ws.userToken));
            ws.send(JSON.stringify({ type: 'app_list', apps: myApps }));
        }
    });
}

server.on('upgrade', (request, socket, head) => {
    const reqUrl = request.url.startsWith('/') ? request.url : '/' + request.url;
    const urlParams = new URLSearchParams(reqUrl.split('?')[1] || '');

    const token = (urlParams.get('token') || '').trim();
    const password = (urlParams.get('pwd') || '').trim();
    const role = (urlParams.get('role') || '').trim();

    console.log(`--- CONNECTION ATTEMPT ---`);
    console.log(`Parsed -> Role: ${role}, Token: ${token}, Pwd: ${password}`);

    if (!token || !role) {
        console.log("REJECTED: Missing parameters");
        socket.write('HTTP/1.1 401 Unauthorized\r\n\r\n');
        socket.destroy();
        return;
    }

    let authError = null;
    if (role === 'app') {
        tokenPasswords[token] = password;
        savePasswords();
        console.log(`SUCCESS: App linked to Token: ${token}`);
    } else if (role === 'viewer') {
        const storedPassword = tokenPasswords[token];
        if (!storedPassword) {
            authError = "Токен еще не зарегистрирован. Сначала запустите вещание на телефоне.";
            console.log(`REJECTED: Token ${token} not found`);
        } else if (storedPassword !== password) {
            authError = "Неверный пароль для этой камеры!";
            console.log(`REJECTED: Wrong password for ${token}`);
        } else {
            console.log(`SUCCESS: Viewer authorized for Token: ${token}`);
        }
    }

    wss.handleUpgrade(request, socket, head, (ws) => {
        ws.userToken = token;
        ws.userRole = role;
        ws.authError = authError;
        wss.emit('connection', ws, request);
    });
});

wss.on('connection', (ws, req) => {
    if (ws.authError) {
        ws.send(JSON.stringify({ type: 'error', message: ws.authError }));
        setTimeout(() => ws.close(), 500);
        return;
    }

    ws.on('message', (message) => {
        try {
            const data = JSON.parse(message.toString());
            if (data.type === 'register') {
                if (ws.userRole === 'app') {
                    ws.deviceId = data.deviceId;
                    apps.set(ws.deviceId, ws);
                    broadcastAppList();
                } else {
                    viewers.set(ws, new Set());
                    const myApps = Array.from(apps.keys()).filter(id => id.startsWith(ws.userToken));
                    ws.send(JSON.stringify({ type: 'app_list', apps: myApps }));
                }
            } else if (data.type === 'subscribe' && ws.userRole === 'viewer') {
                if (data.deviceId.startsWith(ws.userToken)) viewers.get(ws).add(data.deviceId);
            } else if (ws.deviceId) {
                const msg = JSON.stringify({ ...data, fromDeviceId: ws.deviceId });
                viewers.forEach((subs, vSocket) => {
                    if (subs.has(ws.deviceId) && vSocket.readyState === WebSocket.OPEN) vSocket.send(msg);
                });
            } else if (data.targetDeviceId && data.targetDeviceId.startsWith(ws.userToken)) {
                const appSocket = apps.get(data.targetDeviceId);
                if (appSocket && appSocket.readyState === WebSocket.OPEN) appSocket.send(JSON.stringify(data));
            }
        } catch (e) {}
    });

    ws.on('close', () => {
        if (ws.deviceId) { apps.delete(ws.deviceId); broadcastAppList(); }
        else viewers.delete(ws);
    });
});

server.listen(8081, () => {
    console.log('Server running on 8081.');
});
EOF

echo "Установка и настройка PM2..."
sudo npm install -g pm2

# Удаляем старый процесс если был и запускаем новый
pm2 delete server > /dev/null 2>&1 || true
pm2 start server.js --name "server"

# НАСТРОЙКА АВТОЗАПУСКА (чтобы работал после перезагрузки VPS)
# Генерируем команду для системы и сразу её выполняем
PM2_STARTUP_CMD=$(pm2 startup | grep "sudo env")
if [ ! -z "$PM2_STARTUP_CMD" ]; then
    echo "Выполнение команды автозагрузки: $PM2_STARTUP_CMD"
    eval "$PM2_STARTUP_CMD"
fi

# Сохраняем текущий список процессов, чтобы PM2 знал, что запускать
pm2 save

# Get IP address
IP_ADDR=$(curl -s https://ifconfig.me || curl -s https://api.ipify.org || hostname -I | awk '{print $1}')
echo "----------------------------------------------------------------"
echo "СЕРВЕР УСПЕШНО УСТАНОВЛЕН И ЗАПУЩЕН!"
echo ""
echo "Автозапуск после перезагрузки: НАСТРОЕН"
echo ""
echo "Для подключения в приложении (Свой сервер) используйте этот адрес:"
echo "ws://$IP_ADDR:8081"
echo ""
echo "ВАЖНО: Убедитесь, что порт 8081 (TCP) открыт в настройках вашего облака!"
echo "----------------------------------------------------------------"
