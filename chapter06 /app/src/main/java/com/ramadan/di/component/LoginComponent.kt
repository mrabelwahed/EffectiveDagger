package com.ramadan.di.component
import com.ramadan.MainActivity
import com.ramadan.di.module.LocalStoreModule
import com.ramadan.di.module.LoginServiceModule
import com.ramadan.di.scope.ActivityScope
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [LocalStoreModule::class , LoginServiceModule::class])
interface LoginComponent {
    fun inject(activity:MainActivity)
}