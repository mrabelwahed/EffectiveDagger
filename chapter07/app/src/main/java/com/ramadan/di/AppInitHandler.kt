package com.ramadan.di

import javax.inject.Inject

class AppInitHandler @Inject constructor(val set: Set< @JvmSuppressWildcards AppInit>) :AppInit{
    override fun init() {
       set.forEach(AppInit::init)
    }
}