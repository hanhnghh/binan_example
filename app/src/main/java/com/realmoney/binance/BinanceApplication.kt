package com.realmoney.binance

import android.app.Application
import com.realmoney.binance.dagger2.component.ActivityComponent
import com.realmoney.binance.dagger2.component.AppComponent
import com.realmoney.binance.dagger2.component.DaggerAppComponent
import com.realmoney.binance.dagger2.module.ActivityModule
import com.realmoney.binance.dagger2.module.AppModule
import com.realmoney.binance.dagger2.module.NetworkModule

/**
 * Created by hanhanh.nguyen on 1/3/2018.
 */
class BinanceApplication : Application() {
    lateinit var appComponent : AppComponent
    lateinit var activityComponent : ActivityComponent

    override fun onCreate() {
        super.onCreate()
        initAppComponent()
    }

    open fun initAppComponent(){
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(this))
                .networkModule(NetworkModule())
                .build()
    }

    fun initActivityComponent() : ActivityComponent{
        activityComponent = appComponent.plus(ActivityModule())
        return activityComponent;
    }
}