package com.ramadan.di

import android.content.Context
import javax.inject.Inject

class LoggerInit @Inject constructor(private val context: Context) : AppInit {
    override fun init() {
        Logger.init(context)
    }
}