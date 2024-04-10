package com.example.weatherapplication.data.remote

import com.example.weatherapplication.data.remote.current.CurrentWeatherDataDto
import com.example.weatherapplication.data.remote.forecast.ForecastWeatherDataDTO
import com.example.weatherapplication.data.remote.location.LocationWeatherDataDto
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApi {

/*    @GET("v1/forecast?hourly=temperature_2m,weathercode,relativehumidity_2m,windspeed_10m,pressure_msl")
    suspend fun getWeatherData(
        @Query("latitude") lat: Double,
        @Query("longitude") long: Double
    ): WeatherDto*/

    @GET("weather?") // Add the appropriate path for the new endpoint
    suspend fun getCurrentWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") appid: String
    ): CurrentWeatherDataDto

    @GET("forecast?") // Add the appropriate path for the new endpoint
    suspend fun getWeatherForecast(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("appid") appid: String
    ): ForecastWeatherDataDTO
    @GET("weather?")
    suspend fun getWeatherByLocation(
        @Query("q") location: String,
        @Query("appid") appid: String
    ): LocationWeatherDataDto
}