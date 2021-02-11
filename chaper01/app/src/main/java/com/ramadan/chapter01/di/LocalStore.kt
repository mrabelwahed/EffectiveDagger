package com.ramadan.chapter01.di

import com.ramadan.chapter01.abstractions.CacheSource

class LocalStore (val token : String)  : CacheSource{
}