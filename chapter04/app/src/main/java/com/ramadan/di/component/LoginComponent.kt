package com.ramadan.di.component
import com.ramadan.di.LoginManager
import com.ramadan.di.module.CacheModule
import dagger.Component

@Component(modules = [CacheModule::class])
interface LoginComponent {
    fun getLoginManager() : LoginManager
}