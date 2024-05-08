package com.example.payoo.retrofit


import com.example.payoo.response.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServices {
    @GET("user/{idUser}")
    fun getUserProfile(@Path("idUser") userId: String): Call<UserResponse>
}
