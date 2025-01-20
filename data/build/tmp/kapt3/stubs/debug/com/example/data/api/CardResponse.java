package com.example.data.api;

import com.example.domain.model.BankInfo;
import com.example.domain.model.CardInfo;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u00c6\u0003J9\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\t\u0010\u001f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r\u00a8\u0006 "}, d2 = {"Lcom/example/data/api/CardResponse;", "", "brand", "", "scheme", "country", "Lcom/example/data/api/CountryResponse;", "bank", "Lcom/example/data/api/BankResponse;", "(Ljava/lang/String;Ljava/lang/String;Lcom/example/data/api/CountryResponse;Lcom/example/data/api/BankResponse;)V", "getBank", "()Lcom/example/data/api/BankResponse;", "getBrand", "()Ljava/lang/String;", "getCountry", "()Lcom/example/data/api/CountryResponse;", "getScheme", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toModel", "Lcom/example/domain/model/CardInfo;", "bin", "", "toString", "data_debug"})
public final class CardResponse {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String brand = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String scheme = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.data.api.CountryResponse country = null;
    @org.jetbrains.annotations.Nullable()
    private final com.example.data.api.BankResponse bank = null;
    
    public CardResponse(@org.jetbrains.annotations.Nullable()
    java.lang.String brand, @org.jetbrains.annotations.Nullable()
    java.lang.String scheme, @org.jetbrains.annotations.Nullable()
    com.example.data.api.CountryResponse country, @org.jetbrains.annotations.Nullable()
    com.example.data.api.BankResponse bank) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBrand() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScheme() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.data.api.CountryResponse getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.data.api.BankResponse getBank() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.domain.model.CardInfo toModel(long bin) {
        return null;
    }
    
    public CardResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.data.api.CountryResponse component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.data.api.BankResponse component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.data.api.CardResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.String brand, @org.jetbrains.annotations.Nullable()
    java.lang.String scheme, @org.jetbrains.annotations.Nullable()
    com.example.data.api.CountryResponse country, @org.jetbrains.annotations.Nullable()
    com.example.data.api.BankResponse bank) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}