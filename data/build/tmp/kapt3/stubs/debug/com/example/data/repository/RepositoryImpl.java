package com.example.data.repository;

import com.example.data.api.BinService;
import com.example.data.db.dao.BinDao;
import com.example.domain.model.CardInfo;
import com.example.domain.model.Result;
import com.example.domain.repository.Repository;
import kotlinx.coroutines.flow.Flow;
import retrofit2.HttpException;
import javax.inject.Inject;
import javax.inject.Singleton;

@javax.inject.Singleton()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J(\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\bH\u0096@\u00a2\u0006\u0002\u0010\u0010J(\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\b2\u0006\u0010\u0012\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/data/repository/RepositoryImpl;", "Lcom/example/domain/repository/Repository;", "dao", "Lcom/example/data/db/dao/BinDao;", "service", "Lcom/example/data/api/BinService;", "(Lcom/example/data/db/dao/BinDao;Lcom/example/data/api/BinService;)V", "deleteCardInfo", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/domain/model/Result;", "", "Lcom/example/domain/model/CardInfo;", "date", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAllFromDb", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCardInfo", "bin", "data_debug"})
public final class RepositoryImpl implements com.example.domain.repository.Repository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.db.dao.BinDao dao = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.data.api.BinService service = null;
    
    @javax.inject.Inject()
    public RepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.data.db.dao.BinDao dao, @org.jetbrains.annotations.NotNull()
    com.example.data.api.BinService service) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCardInfo(long bin, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.domain.model.Result<? extends java.util.List<com.example.domain.model.CardInfo>>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object deleteCardInfo(long date, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.domain.model.Result<? extends java.util.List<com.example.domain.model.CardInfo>>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object fetchAllFromDb(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.example.domain.model.Result<? extends java.util.List<com.example.domain.model.CardInfo>>>> $completion) {
        return null;
    }
}