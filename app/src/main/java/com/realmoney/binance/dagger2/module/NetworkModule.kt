package com.realmoney.binance.dagger2.module

import com.realmoney.binance.data.api.BinanceApi
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by hanhanh.nguyen on 1/3/2018.
 */
@Module
class NetworkModule {
    @Singleton
    @Provides
    fun provideBinanceApi() : BinanceApi {
        return Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(BinanceApi::class.java)

    }
}