package com.example.data.repository;

import com.example.data.api.BinService;
import com.example.data.db.dao.BinDao;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RepositoryImpl_Factory implements Factory<RepositoryImpl> {
  private final Provider<BinDao> daoProvider;

  private final Provider<BinService> serviceProvider;

  public RepositoryImpl_Factory(Provider<BinDao> daoProvider,
      Provider<BinService> serviceProvider) {
    this.daoProvider = daoProvider;
    this.serviceProvider = serviceProvider;
  }

  @Override
  public RepositoryImpl get() {
    return newInstance(daoProvider.get(), serviceProvider.get());
  }

  public static RepositoryImpl_Factory create(Provider<BinDao> daoProvider,
      Provider<BinService> serviceProvider) {
    return new RepositoryImpl_Factory(daoProvider, serviceProvider);
  }

  public static RepositoryImpl newInstance(BinDao dao, BinService service) {
    return new RepositoryImpl(dao, service);
  }
}
