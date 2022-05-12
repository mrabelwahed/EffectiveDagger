package com.ramadan.di.viewmodel

import androidx.lifecycle.ViewModel
import com.ramadan.CustomViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class CustomViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(CustomViewModel::class)
    abstract fun bindMyViewModel(customViewModel:  CustomViewModel): ViewModel
}