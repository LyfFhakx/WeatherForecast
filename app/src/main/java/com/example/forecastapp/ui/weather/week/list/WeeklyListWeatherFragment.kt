package com.example.forecastapp.ui.weather.week.list

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.forecastapp.R

class WeeklyListWeatherFragment : Fragment(R.layout.weekly_list_weather_fragment) {

    private lateinit var viewModel: WeeklyListWeatherViewModel

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WeeklyListWeatherViewModel::class.java)
        // TODO: Use the ViewModel
    }

}