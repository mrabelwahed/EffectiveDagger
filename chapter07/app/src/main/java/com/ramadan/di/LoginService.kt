package com.ramadan.di

import android.util.Log
import javax.inject.Inject

class LoginService  @Inject constructor() : ApiService {
    override fun authenticate(username: String, password: String): String {
        Log.d("ApiService", "authenticate($username , $password)")
        return "Bearer wxydldklkd78dsnjuudiiudf"}
    }
