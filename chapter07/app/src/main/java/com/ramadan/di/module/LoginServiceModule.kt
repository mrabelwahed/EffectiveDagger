package com.ramadan.di.module

import com.ramadan.di.ApiService
import com.ramadan.di.LoginService
import dagger.Binds
import dagger.Module

@Module
abstract class LoginServiceModule {
    @Binds
    abstract fun  bindLoginService(loginService: LoginService) :ApiService
}