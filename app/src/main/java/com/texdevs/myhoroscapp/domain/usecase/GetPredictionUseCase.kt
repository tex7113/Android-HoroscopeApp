package com.texdevs.myhoroscapp.domain.usecase

import com.texdevs.myhoroscapp.domain.Repository
import javax.inject.Inject

class GetPredictionUseCase @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke (sign: String) = repository.getPrediction(sign)


}