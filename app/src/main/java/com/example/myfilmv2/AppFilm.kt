package com.example.myfilmv2

import android.app.Application
import com.example.myfilmv2.koin_modules.viewModelModule
import org.koin.core.context.startKoin
import org.koin.android.ext.koin.androidContext

class AppFilm:Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(applicationContext)
            modules(listOf(retrofitModule,viewModelModule))
        }
    }
}