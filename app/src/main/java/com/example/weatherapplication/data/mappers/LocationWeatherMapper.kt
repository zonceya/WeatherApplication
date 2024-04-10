package com.example.weatherapplication.data.mappers

import com.example.weatherapplication.data.remote.location.LocationWeatherDataDto


fun LocationWeatherDataDto.toLocationWeatherDataDto(): LocationWeatherDataDto {
    val main = this.main
    val weather = this.weather.map { weatherDto ->
        LocationWeatherDataDto.Weather(
            id = weatherDto.id,
            main = weatherDto.main,
            description = weatherDto.description,
            icon = weatherDto.icon
        )
    }

    return LocationWeatherDataDto(
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
