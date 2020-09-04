package com.example.forecastapp.ui.weather.current

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.forecastapp.R
import com.example.forecastapp.data.net.ApiService
import kotlinx.android.synthetic.main.current_weather_fragment.*
import kotlinx.coroutines.*

class CurrentWeatherFragment : Fragment(R.layout.current_weather_fragment) {


    private lateinit var viewModel: CurrentWeatherViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(CurrentWeatherViewModel::class.java)

        val apiService = ApiService()
        GlobalScope.launch(Dispatchers.Main) {
            val currentWeatherResponse = apiService.getCurrentWeather("Tomsk")
            tvCurrent.text = currentWeatherResponse.body().toString()
        }

    }
}

