package com.ramadan.di.module

import com.ramadan.di.AppInit
import com.ramadan.di.ConversionInit
import com.ramadan.di.LoggerInit
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoSet

@Module
abstract class AppInitModule {
    @Binds
    @IntoSet
    abstract fun bindLoggerInit(loggerInit: LoggerInit): AppInit

    @Binds
    @IntoSet
    abstract fun bindConversionInit(conversionInit: ConversionInit): AppInit
}