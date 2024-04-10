package com.example.weatherapplication.domain.weather.forecast

data class ForecastWeatherData(
    val temp: Double = 0.0,
    val description: String = "",
    val dt: Long = 0,
    val icon: String = ""
)
