package com.example.assessment.repository

import com.example.assessment.api.ApiClient
import com.example.assessment.api.ApiInterface
import com.example.assessment.model.RegisterRequest
import com.example.assessment.model.RegisterResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class UserRepository {
    val apiClient=ApiClient.buildApiClient(ApiInterface::class.java)

    suspend fun registerUser(registerRequest: RegisterRequest):Response<RegisterResponse>{
        return withContext(Dispatchers.IO){
            apiClient.registerUser(registerRequest)
        }
    }
}