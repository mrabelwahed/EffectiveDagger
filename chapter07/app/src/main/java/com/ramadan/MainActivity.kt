package com.ramadan

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.ramadan.MainActivity_MembersInjector.create
import com.ramadan.chapter01.R
import com.ramadan.di.Config
import com.ramadan.di.CustomViewModelFactory
import com.ramadan.di.LoginManager

import javax.inject.Inject


class MainActivity : AppCompatActivity() {
   @Inject lateinit var loginManager: LoginManager
   @Inject lateinit var config: Config
   @Inject lateinit var viewModelFactory: CustomViewModelFactory
   lateinit var viewModel:CustomViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        // using dagger component
        (application as BaseApp).appComponent.getLoginComponent().inject(this)
        loginManager.login("ramadan","12222")
        loginManager.enableCache(config)
        viewModel = ViewModelProviders.of(this, viewModelFactory)[CustomViewModel::class.java]
        viewModel.hello()

    }
}