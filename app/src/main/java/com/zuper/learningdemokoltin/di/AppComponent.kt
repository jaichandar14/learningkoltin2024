package com.zuper.learningdemokoltin.di

import com.zuper.learningdemokoltin.ui.MainActivity
import com.zuper.learningdemokoltin.viewmodelfactory.ViewModelFactory
import dagger.Component

@Component(modules = [NetworkModule::class])
interface AppComponent {

    fun inject(viewmodel: MainActivity)

    fun viewModelFactory():ViewModelFactory
}