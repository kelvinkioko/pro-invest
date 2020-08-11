package com.invest.proinvest.dependency

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class InvestApp : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@InvestApp)
            modules(
                InvestModule
            )
        }
    }
}
