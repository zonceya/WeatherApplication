package com.example.weatherapplication.domain.weather


data class WeatherInfo(
    val weatherDataPerDay: Map<Int, List<WeatherData>>,

    )
