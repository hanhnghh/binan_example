package com.realmoney.binance.ui.activity

import android.graphics.drawable.Animatable
import android.os.Binder
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.realmoney.binance.BinanceApplication
import com.realmoney.binance.R
import com.realmoney.binance.data.api.BinanceApi
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var binanceApi : BinanceApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (applicationContext as BinanceApplication).initActivityComponent().inject(this);

        (animatedCheck.drawable as Animatable).start()
    }


}
