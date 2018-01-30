package com.realmoney.binance.dagger2.module

import android.app.Application
import android.content.Context
import com.realmoney.binance.data.api.BinanceApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by hanhanh.nguyen on 12/28/2017.
 */
@Module
class AppModule(private val application: Application) {
    @Singleton
    @Provides
    fun provideApplicationContext() : Context{
        return application;
    }


}