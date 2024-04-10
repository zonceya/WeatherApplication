package com.example.weatherapplication.domain.weather.current

data class CurrentWeatherData(
    val temp: Double = 0.0,
    val tempMin: Double = 0.0,
    val tempMax: Double = 0.0,
    val description: String = "",
    val icon: String = ""
)
