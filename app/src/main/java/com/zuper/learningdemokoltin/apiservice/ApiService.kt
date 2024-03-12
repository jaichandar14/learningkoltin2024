package com.zuper.learningdemokoltin.apiservice

import com.zuper.learningdemokoltin.ui.model.EmpDetails
import retrofit2.http.GET

interface ApiService {
    @GET("unicorns")
    suspend fun getapicall(): ArrayList<EmpDetails>
}