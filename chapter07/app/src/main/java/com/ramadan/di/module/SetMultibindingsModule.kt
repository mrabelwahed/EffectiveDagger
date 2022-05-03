package com.ramadan.di.module

import dagger.Module
import dagger.Provides
import dagger.multibindings.ElementsIntoSet
import dagger.multibindings.IntoSet

@Module
class SetMultibindingsModule {
    @Provides
    fun providesSetOfStrings():Set<String>{
        return setOf("A","B","C")
    }

    @Provides
    @IntoSet
    fun providesUsingIntoSet() :String{
        return "D"
    }


    @Provides
    @ElementsIntoSet
    fun providesUsingElementsIntoSet():Set<String>{
        return setOf("F","G","H")
    }
}