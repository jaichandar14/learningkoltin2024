package com.zuper.learningdemokoltin.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.zuper.learningdemokoltin.ui.model.EmpDetails
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainVIewModel @Inject constructor(var respo: MainRepos) :ViewModel() {
    val empName= MutableLiveData<ArrayList<EmpDetails>>()
    val _empName:LiveData<ArrayList<EmpDetails>> =empName
    fun getapicall() {
        viewModelScope.launch {
            empName.postValue(respo.getApicall())
            Log.d("TAG", "getapicall: $empName")
        }

    }

}