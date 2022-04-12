package com.ramadan.di.module

import com.ramadan.di.AppLogger
import com.ramadan.di.scope.AppScope
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    var index =0

    @AppScope
    @Provides
    fun getAppLogger() :AppLogger{
        index++
        return AppLogger("value: ${index}")
    }
}