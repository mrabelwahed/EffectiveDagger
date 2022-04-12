package com.ramadan.di.module

import com.ramadan.di.LocalStore
import dagger.Module
import dagger.Provides

@Module
class LocalStoreModule {
    @Provides
    fun provideLocalStore() = LocalStore()
}