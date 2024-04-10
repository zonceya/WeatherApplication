package com.example.weatherapplication.presentation.location

import com.example.weatherapplication.domain.weather.location.LocationWeatherInfo

data class LocationWeatherState(
    val locationWeatherInfo: LocationWeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)