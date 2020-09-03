package com.example.forecastapp.ui.weather.week.detail

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.forecastapp.R

class WeeklyDetailWeatherFragment : Fragment(R.layout.weekly_detail_weather_fragment) {


    private lateinit var viewModel: WeeklyDetailWeatherViewModel



    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WeeklyDetailWeatherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}