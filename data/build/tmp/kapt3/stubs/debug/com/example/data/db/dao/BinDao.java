package com.example.data.db.dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import com.example.data.db.entities.CardInfoEntity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u00a7@\u00a2\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\tH\u00a7@\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/data/db/dao/BinDao;", "", "deleteCard", "", "date", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllCards", "", "Lcom/example/data/db/entities/CardInfoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveCard", "cardInfo", "(Lcom/example/data/db/entities/CardInfoEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
@androidx.room.Dao()
public abstract interface BinDao {
    
    @androidx.room.Insert()
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object saveCard(@org.jetbrains.annotations.NotNull()
    com.example.data.db.entities.CardInfoEntity cardInfo, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * FROM cardinfoentity order by date desc")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAllCards(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.example.data.db.entities.CardInfoEntity>> $completion);
    
    @androidx.room.Query(value = "DELETE FROM cardinfoentity WHERE date = :date")
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object deleteCard(long date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}