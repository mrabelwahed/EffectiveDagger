package com.ramadan.di.component

import com.ramadan.di.AppLogger
import com.ramadan.di.module.AppModule
import com.ramadan.di.scope.AppScope
import dagger.Component

@AppScope
@Component(modules = [AppModule::class])
interface AppComponent {
    fun getAppLogger():AppLogger
    fun getLoginComponent():LoginComponent
}