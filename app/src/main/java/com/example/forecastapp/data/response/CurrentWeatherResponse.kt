package com.example.forecastapp.data.response

import com.example.forecastapp.data.models.CurrentWeatherEntry
import com.example.forecastapp.data.models.Location
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location
)