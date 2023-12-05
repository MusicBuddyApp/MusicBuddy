package com.example.musicbuddy_1

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface APIinterface {

    @Headers("X-RapidAPI-Key: 4b20d85889msh71eb1fa9b75ab2ap145b86jsn942df8f69b58",
        "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query: String) : Call<MyData>

}