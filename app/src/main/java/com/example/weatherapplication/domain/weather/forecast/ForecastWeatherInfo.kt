package com.example.weatherapplication.domain.weather.forecast


data class ForecastWeatherInfo(
    val forecastDataPerDay: Map<Int, List<ForecastWeatherData>>,
    val forecastWeatherData: ForecastWeatherData?

)