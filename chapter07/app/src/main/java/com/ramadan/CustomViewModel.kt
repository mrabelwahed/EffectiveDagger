package com.ramadan

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class CustomViewModel @Inject constructor() : ViewModel() {
    fun hello(){
        println("Hi, I am a custom view model")
    }
}