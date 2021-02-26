package com.ramadan

import android.app.Application
import com.ramadan.container.AppContainer
import com.ramadan.di.LoginManager

class BaseApp  : Application(){
    val loginManager : LoginManager by lazy {
        AppContainer().getLoginManager()
    }
}