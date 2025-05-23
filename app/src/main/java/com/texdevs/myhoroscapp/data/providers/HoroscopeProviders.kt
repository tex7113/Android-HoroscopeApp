package com.texdevs.myhoroscapp.data.providers

import com.texdevs.myhoroscapp.domain.model.HoroscopeInfo
import com.texdevs.myhoroscapp.domain.model.HoroscopeInfo.*
import javax.inject.Inject

class HoroscopeProviders @Inject constructor(){
    fun getHoroscope(): List<HoroscopeInfo> {
        return listOf(
            Aries,
            Taurus,
            Gemini,
            Cancer,
            Leo,
            Virgo,
            Libra,
            Scorpio,
            Sagittarius,
            Capricorn,
            Aquarius,
            Pisces

        )
    }
}