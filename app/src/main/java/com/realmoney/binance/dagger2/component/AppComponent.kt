package com.realmoney.binance.dagger2.component

import com.realmoney.binance.dagger2.module.ActivityModule
import com.realmoney.binance.dagger2.module.AppModule
import com.realmoney.binance.dagger2.module.NetworkModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by hanhanh.nguyen on 12/28/2017.
 */
@Singleton
@Component(
        modules = arrayOf(AppModule::class, NetworkModule::class)
)
interface AppComponent {
    fun plus(activityModule: ActivityModule) : ActivityComponent
}