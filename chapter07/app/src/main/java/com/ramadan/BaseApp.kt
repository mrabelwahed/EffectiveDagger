package com.ramadan

import android.app.Application
import android.util.Log
import com.ramadan.di.component.AppComponent
import com.ramadan.di.component.DaggerAppComponent
import com.ramadan.di.module.AppModule

class BaseApp  : Application(){
    val appComponent: AppComponent by lazy{
        DaggerAppComponent.builder().context(this).appModule(AppModule()).build()
    }
    override fun onCreate() {
        super.onCreate()
        Log.d("App",appComponent.getAppLogger().value)
        Log.d("App",appComponent.getAppLogger().value)
        Log.d("App",appComponent.getAppLogger().value)
        appComponent.getAppInitHandler().init()
    }
}