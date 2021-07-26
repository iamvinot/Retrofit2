package com.iamvinot.retrofit2.api

import retrofit2.http.GET

const val BASE_URL = "https://random.dog"

interface ApiRequest {

    @GET("woof.json")
    suspend fun getRandomDog(): ApiData
}