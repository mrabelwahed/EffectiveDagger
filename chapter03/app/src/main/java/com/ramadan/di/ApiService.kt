package com.ramadan.di

import android.util.Log
import javax.inject.Inject

class ApiService @Inject constructor() {
    fun authenticate(username:String , password:String) : String{
        Log.d("ApiService", "authenticate($username , $password)")
        return "Bearer hjdakhfhsgfhdgfhdjzhjfd"
    }
}