package com.ramadan.di

import android.util.Log
import javax.inject.Inject

class Config @Inject constructor() {
    var isCacheEnabled = false
    fun enableCache(loginManager: LoginManager){
     isCacheEnabled = true
        Log.d("config","${this.isCacheEnabled}")
    }

}