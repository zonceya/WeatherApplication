package com.example.weatherapplication.presentation.current

import com.example.weatherapplication.domain.weather.current.CurrentWeatherInfo


data class CurrentWeatherState(
    val currentWeatherInfo: CurrentWeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
