package com.ramadan.di

import android.util.Log
import com.ramadan.abstractions.CacheSource
import javax.inject.Inject


class LoginManager @Inject constructor (private val localStore: LocalStore , private val apiService: ApiService){

    fun login(username : String , pass:String){
        Log.d("LoginManager","login($username , $pass)")
        val token = apiService.authenticate(username,pass)
        localStore.saveToken(token)
    }

    @Inject
    fun enableCache(config: Config){
        Log.d("LoginManger","${config.isCacheEnabled}")
        config.enableCache(this)
    }
}
