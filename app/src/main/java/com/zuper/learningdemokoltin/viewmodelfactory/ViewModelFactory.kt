package com.zuper.learningdemokoltin.viewmodelfactory

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.zuper.learningdemokoltin.ui.MainRepos
import com.zuper.learningdemokoltin.ui.MainVIewModel
import javax.inject.Inject

class ViewModelFactory @Inject constructor(var respo:MainRepos): ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainVIewModel::class.java)){
            return MainVIewModel(respo) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}