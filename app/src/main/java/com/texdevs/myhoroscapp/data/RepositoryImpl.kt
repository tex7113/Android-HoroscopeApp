package com.texdevs.myhoroscapp.data

import android.util.Log
import com.texdevs.myhoroscapp.data.network.HoroscopeApiService
import com.texdevs.myhoroscapp.domain.model.PredictionModel
import com.texdevs.myhoroscapp.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {

    override suspend fun getPrediction(sign: String): PredictionModel? {
        //PeticionRetrofit
        runCatching { apiService.getHoroscope(sign) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("tex", "Ha ocurrido un error ${it.message}") }
        return null
    }

}