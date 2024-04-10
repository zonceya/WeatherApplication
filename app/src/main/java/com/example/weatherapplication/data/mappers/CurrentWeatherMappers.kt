package com.example.weatherapplication.data.mappers

import com.example.weatherapplication.R
import com.example.weatherapplication.data.remote.current.CurrentWeatherDataDto
import com.example.weatherapplication.data.remote.current.CurrentWeatherDto
import com.example.weatherapplication.domain.weather.current.CurrentWeatherData
import com.example.weatherapplication.domain.weather.WeatherType



fun CurrentWeatherDto.toCurrentWeatherData(): CurrentWeatherData {
    val firstWeatherData = this.currentWeatherDto
    return CurrentWeatherData(
        temp = firstWeatherData.main.temp ?: 0.0,
        tempMin = firstWeatherData.main.tempMin ?: 0.0,
        tempMax = firstWeatherData.main.tempMax ?: 0.0,
        description = firstWeatherData.weather.firstOrNull()?.description ?: "",
        icon = firstWeatherData.weather.firstOrNull()?.icon ?: ""
    )
}

fun CurrentWeatherDataDto.toCurrentWeatherDataDto(): CurrentWeatherDataDto {
    val main = this.main
    val weather = this.weather.map { weatherDto ->
        CurrentWeatherDataDto.Weather(
            id = weatherDto.id,
            main = weatherDto.main,
            description = weatherDto.description,
            icon = weatherDto.icon
        )
    }

    return CurrentWeatherDataDto(
        coord = this.coord,
        weather = weather,
        base = this.base,
        main = main,
        visibility = this.visibility,
        wind = this.wind,
        rain = this.rain,
        clouds = this.clouds,
        dt = this.dt,
        sys = this.sys,
        timezone = this.timezone,
        id = this.id,
        name = this.name,
        cod = this.cod
    )
}




fun WeatherType.getBackgroundImage(): Int {
    return when (this) {
        WeatherType.ClearSky -> R.drawable.background_forest_sunny
        WeatherType.MainlyClear -> R.drawable.background_forest_cloudy
        WeatherType.PartlyCloudy -> R.drawable.background_forest_rainy
        // Add more cases for other weather types
        else -> R.drawable.background_forest_cloudy // Default to cloudy background if the weather type is unknown
    }
}
