package com.ramadan.di.module

import com.ramadan.abstractions.CacheSource
import com.ramadan.di.LocalStore
import dagger.Module
import dagger.Provides

@Module
class CacheModule {
    @Provides
    fun provideCacheSource(localStore: LocalStore) :CacheSource{
        return localStore
    }
}