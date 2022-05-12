package com.ramadan.di.viewmodel

import androidx.lifecycle.ViewModelProvider
import com.ramadan.di.CustomViewModelFactory
import dagger.Binds
import dagger.Module

@Module
abstract class CustomViewModelFactoryModule{
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: CustomViewModelFactory): ViewModelProvider.Factory
}