package com.example.forecastapp.data.net.response

import com.example.forecastapp.data.database.entity.CurrentWeatherEntry
import com.example.forecastapp.data.database.entity.Location
import com.google.gson.annotations.SerializedName


data class CurrentWeatherResponse(
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry,
    val location: Location
)