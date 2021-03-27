package com.ramadan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ramadan.chapter01.R
import com.ramadan.di.ApiService
import com.ramadan.di.LocalStore
import com.ramadan.di.LoginManager
import com.ramadan.di.component.DaggerLoginComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       // using dagger component
        val loginComponent = DaggerLoginComponent.create()
        loginComponent.getLoginManager().login("ramadan","12222")
    }
}