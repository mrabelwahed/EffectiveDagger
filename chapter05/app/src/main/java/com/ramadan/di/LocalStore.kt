package com.ramadan.di

import android.util.Log
import com.ramadan.abstractions.CacheSource
import javax.inject.Inject

class LocalStore  {
    fun saveToken(token :String){
        Log.d("LocalStore","saveToken($token)")
    }
}