package com.texdevs.myhoroscapp.data.network

import com.texdevs.myhoroscapp.data.network.response.PredictionResponse
import retrofit2.http.GET
import retrofit2.http.Path

interface HoroscopeApiService {

    @GET("/{sign}")
    suspend fun getHoroscope(@Path("sign") sing:String):PredictionResponse

}