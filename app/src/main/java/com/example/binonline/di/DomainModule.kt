package com.example.binonline.di

import com.example.data.repository.RepositoryImpl
import com.example.domain.repository.Repository
import com.example.domain.usecase.DeleteCardInfoUseCase
import com.example.domain.usecase.FetchAllCardsUseCase
import com.example.domain.usecase.GetCardInfoUseCase
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
abstract class DomainModule {
    @Singleton
    @Binds
    abstract fun bindRepositoryImpl(repositoryImpl: RepositoryImpl): Repository
}

@InstallIn(ViewModelComponent::class)
@Module
object UseCaseModule {
    @Provides
    @ViewModelScoped
    fun provideGetCardInfoUseCase(repository: Repository) = GetCardInfoUseCase(repository)

    @Provides
    @ViewModelScoped
    fun provideFetchAllCardsUseCase(repository: Repository) = FetchAllCardsUseCase(repository)

    @Provides
    @ViewModelScoped
    fun provideDeleteCardInfoUseCase(repository: Repository) = DeleteCardInfoUseCase(repository)
}
