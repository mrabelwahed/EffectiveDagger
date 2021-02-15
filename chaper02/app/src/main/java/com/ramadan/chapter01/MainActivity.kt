package com.ramadan.chapter01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ramadan.chapter01.di.ApiService
import com.ramadan.chapter01.di.LocalStore
import com.ramadan.chapter01.di.LoginManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create dependencies manually
        val cacheSource = LocalStore("Bearer khhdjhhudyucdjhd.....");
        val apiSource = ApiService("ramadan" ,"123");
        val loginManager =  LoginManager(cacheSource,apiSource)
    }
}