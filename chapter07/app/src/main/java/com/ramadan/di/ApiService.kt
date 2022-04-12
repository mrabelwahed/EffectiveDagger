package com.ramadan.di
interface ApiService {
    fun authenticate(username:String , password:String)  : String
}