package com.ramadan

import android.app.Application
import android.util.Log
import com.ramadan.di.component.DaggerAppComponent
import com.ramadan.di.module.AppModule

class BaseApp  : Application(){
    override fun onCreate() {
        super.onCreate()
       val appComponent = DaggerAppComponent.builder().appModule(AppModule()).build()
        Log.d("App",appComponent.getAppLogger().value)
        Log.d("App",appComponent.getAppLogger().value)
        Log.d("App",appComponent.getAppLogger().value)
    }
}