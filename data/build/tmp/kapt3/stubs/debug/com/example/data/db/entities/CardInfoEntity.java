package com.example.data.db.entities;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.example.domain.model.BankInfo;
import com.example.domain.model.CardInfo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u000eJ\u0006\u0010\u001c\u001a\u00020\u001dR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014\u00a8\u0006\u001e"}, d2 = {"Lcom/example/data/db/entities/CardInfoEntity;", "", "bin", "", "country", "", "latitude", "", "longitude", "scheme", "brand", "bankInfo", "Lcom/example/domain/model/BankInfo;", "date", "(JLjava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;Lcom/example/domain/model/BankInfo;J)V", "getBankInfo", "()Lcom/example/domain/model/BankInfo;", "getBin", "()J", "getBrand", "()Ljava/lang/String;", "getCountry", "getDate", "getLatitude", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getLongitude", "getScheme", "toModel", "Lcom/example/domain/model/CardInfo;", "data_debug"})
@androidx.room.Entity()
public final class CardInfoEntity {
    private final long bin = 0L;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Float latitude = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Float longitude = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String scheme = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String brand = null;
    @androidx.room.Embedded()
    @org.jetbrains.annotations.Nullable()
    private final com.example.domain.model.BankInfo bankInfo = null;
    @androidx.room.PrimaryKey()
    private final long date = 0L;
    
    public CardInfoEntity(long bin, @org.jetbrains.annotations.Nullable()
    java.lang.String country, @org.jetbrains.annotations.Nullable()
    java.lang.Float latitude, @org.jetbrains.annotations.Nullable()
    java.lang.Float longitude, @org.jetbrains.annotations.Nullable()
    java.lang.String scheme, @org.jetbrains.annotations.Nullable()
    java.lang.String brand, @org.jetbrains.annotations.Nullable()
    com.example.domain.model.BankInfo bankInfo, long date) {
        super();
    }
    
    public final long getBin() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getLatitude() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Float getLongitude() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScheme() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrand() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.domain.model.BankInfo getBankInfo() {
        return null;
    }
    
    public final long getDate() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.model.CardInfo toModel() {
        return null;
    }
}