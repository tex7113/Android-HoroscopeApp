package com.texdevs.myhoroscapp.domain

import com.texdevs.myhoroscapp.domain.model.PredictionModel

interface Repository {

    suspend fun getPrediction(sign:String): PredictionModel?

}