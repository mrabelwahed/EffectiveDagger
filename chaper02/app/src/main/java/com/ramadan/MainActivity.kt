package com.ramadan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ramadan.chapter01.R
import com.ramadan.di.ApiService
import com.ramadan.di.LocalStore
import com.ramadan.di.LoginManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //create dependencies manually
        val loginManager = (application as BaseApp).loginManager
        loginManager.print()

    }
}