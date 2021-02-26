package com.ramadan.di

import android.util.Log
import com.ramadan.abstractions.CacheSource

//Bad Approach

//class LoginManager (username:String, password:String, token :String){
//    val localStore  = LocalStore(token)
//    val apiService = ApiService(username , password)
//}

//Good Design
class LoginManager (val localStore: CacheSource, val apiService: ApiService){
    fun print(){
        Log.d("LoginManager" , "hello, ramadan")
    }
}
