package com.example.weatherapplication.domain.weather.location

data class LocationWeatherData(
    val temp: Double = 0.0,
    val tempMin: Double = 0.0,
    val tempMax: Double = 0.0,
    val description: String = "",
    val icon: String = ""
)