package com.texdevs.myhoroscapp.ui.horoscope

import androidx.lifecycle.ViewModel
import com.texdevs.myhoroscapp.data.providers.HoroscopeProviders
import com.texdevs.myhoroscapp.domain.model.HoroscopeInfo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class HoroscopeViewModel @Inject constructor(horoscopeProviders: HoroscopeProviders) : ViewModel() {

    private var _horoscope = MutableStateFlow<List<HoroscopeInfo>>(emptyList())
    val horoscope: StateFlow<List<HoroscopeInfo>> = _horoscope

    init {
        _horoscope.value = horoscopeProviders.getHoroscope()
    }
}