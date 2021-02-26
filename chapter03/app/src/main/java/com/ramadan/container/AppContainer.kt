package com.ramadan.container

import com.ramadan.di.ApiService
import com.ramadan.di.LocalStore
import com.ramadan.di.LoginManager

class AppContainer {
    fun getLoginManager(): LoginManager {
        val cacheSource = LocalStore("Bearer khhdjhhudyucdjhd.....")
        val apiSource = ApiService("ramadan" ,"123")
        return LoginManager(cacheSource, apiSource)
    }
}