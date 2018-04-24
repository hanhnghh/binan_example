package com.realmoney.binance.dagger2.component

import com.realmoney.binance.dagger2.PerActivity
import com.realmoney.binance.dagger2.module.ActivityModule
import com.realmoney.binance.ui.activity.MainActivity
import dagger.Subcomponent

/**
 * Created by hanhanh.nguyen on 1/3/2018.
 */
@PerActivity
@Subcomponent(
        modules = arrayOf(ActivityModule::class)
)
interface ActivityComponent {
    fun inject(mainActivity : MainActivity)
}