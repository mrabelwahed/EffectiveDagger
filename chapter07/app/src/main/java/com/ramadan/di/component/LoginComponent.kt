package com.ramadan.di.component
import com.ramadan.MainActivity
import com.ramadan.di.module.LocalStoreModule
import com.ramadan.di.module.LoginServiceModule
import com.ramadan.di.scope.ActivityScope
import com.ramadan.di.viewmodel.CustomViewModelFactoryModule
import com.ramadan.di.viewmodel.CustomViewModelModule
import dagger.Component
import dagger.Subcomponent

@ActivityScope
@Subcomponent(modules = [LocalStoreModule::class , LoginServiceModule::class, CustomViewModelFactoryModule::class, CustomViewModelModule::class])
interface LoginComponent {
    fun inject(activity:MainActivity)
}