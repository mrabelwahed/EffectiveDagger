package com.ramadan.di.component
import com.ramadan.MainActivity
import com.ramadan.di.module.LocalStoreModule
import com.ramadan.di.module.LoginServiceModule
import dagger.Component

@Component(modules = [LocalStoreModule::class , LoginServiceModule::class])
interface LoginComponent {
    fun inject(activity:MainActivity)
}