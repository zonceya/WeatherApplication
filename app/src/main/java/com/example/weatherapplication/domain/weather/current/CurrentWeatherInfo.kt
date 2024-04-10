package com.example.weatherapplication.domain.weather.current



data class CurrentWeatherInfo(
    val currentWeatherInfo:  List<CurrentWeatherData>? = null,
    val currentWeatherData: CurrentWeatherData?
)
