package com.example.binonline.di

import android.content.Context
import androidx.room.Room
import com.example.binonline.BuildConfig
import com.example.data.api.BinService
import com.example.data.db.AppDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object DataModule {
    private const val BASE_URL = BuildConfig.BASE_URL

    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit =
        Retrofit
            .Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()

    @Provides
    @Singleton
    fun provideService(retrofit: Retrofit): BinService = retrofit.create(BinService::class.java)

    @Provides
    @Singleton
    fun provideBd(
        @ApplicationContext context: Context,
    ): AppDb =
        Room
            .databaseBuilder(
                context,
                AppDb::class.java,
                "bin_db",
            ).build()

    @Provides
    @Singleton
    fun provideDao(appDb: AppDb) = appDb.dao()
}
