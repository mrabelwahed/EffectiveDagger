package com.ramadan.di.component

import android.content.Context
import com.ramadan.di.AppInitHandler
import com.ramadan.di.AppLogger
import com.ramadan.di.module.AppInitModule
import com.ramadan.di.module.AppModule
import com.ramadan.di.scope.AppScope
import dagger.BindsInstance
import dagger.Component
import dagger.Module

@AppScope
@Component(modules = [AppModule::class, AppInitModule::class])
interface AppComponent {
    fun getAppLogger():AppLogger
    fun getLoginComponent():LoginComponent
    fun getAppInitHandler():AppInitHandler

    @Component.Builder
    interface Builder{
        @BindsInstance
        fun context(context: Context):Builder
        fun appModule(appModule: AppModule):Builder
        fun build():AppComponent
    }
}