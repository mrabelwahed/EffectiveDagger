package com.ramadan.di

import android.content.Context
import javax.inject.Inject

class ConversionInit @Inject constructor() : AppInit {
    override fun init() {
        Conversion.init()
    }
}