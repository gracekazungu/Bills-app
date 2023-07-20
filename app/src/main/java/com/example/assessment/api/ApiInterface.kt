package com.example.assessment.api

import com.example.assessment.model.RegisterRequest
import com.example.assessment.model.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiInterface {
    @POST("/users/register")
   suspend fun registerUser(@Body registerRequest: RegisterRequest): Response<RegisterResponse>
}