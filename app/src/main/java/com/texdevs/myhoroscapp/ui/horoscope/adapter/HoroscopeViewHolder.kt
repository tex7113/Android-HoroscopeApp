package com.texdevs.myhoroscapp.ui.horoscope.adapter

import android.view.View
import android.view.animation.LinearInterpolator
import androidx.recyclerview.widget.RecyclerView
import com.texdevs.myhoroscapp.databinding.ItemHoroscopeBinding
import com.texdevs.myhoroscapp.domain.model.HoroscopeInfo

class HoroscopeViewHolder(view:View): RecyclerView.ViewHolder(view) {

    private val binding = ItemHoroscopeBinding.bind(view)

    fun render(horoscopeInfo: HoroscopeInfo, onItemSelected: (HoroscopeInfo) -> Unit){
        val context = binding.tvTittle.context

        binding.ivHoroscope.setImageResource(horoscopeInfo.img)
        binding.tvTittle.text = context.getString(horoscopeInfo.name)

        binding.parent.setOnClickListener {
            startRotationAnimation(binding.ivHoroscope, newLambda = {onItemSelected(horoscopeInfo)})
        //onItemSelected(horoscopeInfo)
        }
    }

    fun startRotationAnimation(view:View, newLambda:()-> Unit){

        view.animate().apply {
            duration = 500
            interpolator = LinearInterpolator()
            rotation(360f)
            withEndAction { newLambda() }
            start()
        }
    }
}