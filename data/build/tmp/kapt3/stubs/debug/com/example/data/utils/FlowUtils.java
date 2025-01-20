package com.example.data.utils;

import com.example.domain.model.ErrorType;
import com.example.domain.model.Result;
import kotlinx.coroutines.flow.Flow;
import retrofit2.HttpException;
import java.io.IOException;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00060\u00050\u0004\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u0002H\u00060\u0004\u00a8\u0006\u0007"}, d2 = {"Lcom/example/data/utils/FlowUtils;", "", "()V", "asResult", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/domain/model/Result;", "T", "data_debug"})
public final class FlowUtils {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.data.utils.FlowUtils INSTANCE = null;
    
    private FlowUtils() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final <T extends java.lang.Object>kotlinx.coroutines.flow.Flow<com.example.domain.model.Result<T>> asResult(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.flow.Flow<? extends T> $this$asResult) {
        return null;
    }
}