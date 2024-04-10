package com.example.weatherapplication.domain.repository

import com.example.weatherapplication.domain.util.Resource
import com.example.weatherapplication.domain.weather.current.CurrentWeatherInfo
import com.example.weatherapplication.domain.weather.forecast.ForecastWeatherInfo
import com.example.weatherapplication.domain.weather.location.LocationWeatherInfo

interface WeatherRepository {
  //  suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
    suspend fun getCurrentWeather(lat: Double, long: Double,appid:String): Resource<CurrentWeatherInfo>
    suspend fun getWeatherForecast(lat: Double, long: Double,appid:String): Resource<ForecastWeatherInfo>
    suspend   fun  getLocationCurrentWeather(q: String, appid:String): Resource<LocationWeatherInfo>
}