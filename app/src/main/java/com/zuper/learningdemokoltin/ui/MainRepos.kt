package com.zuper.learningdemokoltin.ui

import com.zuper.learningdemokoltin.apiservice.ApiService
import com.zuper.learningdemokoltin.ui.model.EmpDetails
import javax.inject.Inject

class MainRepos @Inject constructor(private val apiService: ApiService) {


    suspend fun getApicall(): ArrayList<EmpDetails> {
        return apiService.getapicall()
    }
}