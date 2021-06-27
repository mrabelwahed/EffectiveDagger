package com.ramadan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ramadan.chapter01.R
import com.ramadan.di.Config
import com.ramadan.di.LoginManager
import com.ramadan.di.component.DaggerLoginComponent
import javax.inject.Inject


class MainActivity : AppCompatActivity() {
   @Inject lateinit var loginManager: LoginManager
   @Inject lateinit var config: Config
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // using dagger component
        val loginComponent = DaggerLoginComponent.create()
         loginComponent.inject(this)
        loginManager.login("ramadan","12222")
        loginManager.enableCache(config)
    }
}