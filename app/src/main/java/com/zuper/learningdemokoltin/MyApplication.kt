package com.zuper.learningdemokoltin

import android.app.Application
import com.zuper.learningdemokoltin.di.AppComponent
import com.zuper.learningdemokoltin.di.DaggerAppComponent

open class MyApplication: Application() {

    val appComponent:AppComponent by lazy{
        DaggerAppComponent.create()
    }
}