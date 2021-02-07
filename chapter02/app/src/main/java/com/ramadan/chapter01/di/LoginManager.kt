package com.ramadan.chapter01.di

//Bad Approach

//class LoginManager (username:String, password:String, token :String){
//    val localStore  = LocalStore(token)
//    val apiService = ApiService(username , password)
//}

//Good Design
class LoginManager (val localStore: LocalStore , val apiService: ApiService)
