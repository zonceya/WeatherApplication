package com.example.weatherapplication.presentation.forecast

import com.example.weatherapplication.domain.weather.forecast.ForecastWeatherInfo

data class ForecastWeatherSate(
    val forecastWeatherInfo: ForecastWeatherInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
