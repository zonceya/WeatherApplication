package com.example.weatherapplication.data.remote.location

data class LocationWeatherDataDto(
    val coord: Coord = Coord(0.0, 0.0),
    val weather: List<Weather> = emptyList(),
    val base: String = "",
    val main: Main = Main(),
    val visibility: Int = 0,
    val wind: Wind = Wind(),
    val rain: Rain? = null,
    val clouds: Clouds = Clouds(),
    val dt: Long = 0,
    val sys: Sys = Sys(),
    val timezone: Int = 0,
    val id: Int = 0,
    val name: String = "",
    val cod: Int = 0
) {
    data class Coord(
        val lon: Double = 0.0,
        val lat: Double = 0.0
    )

    data class Weather(
        val id: Int = 0,
        val main: String = "",
        val description: String = "",
        val icon: String = ""
    )

    data class Main(
        val temp: Double = 0.0,
        val feelsLike: Double = 0.0,
        val tempMin: Double = 0.0,
        val tempMax: Double = 0.0,
        val pressure: Int = 0,
        val humidity: Int = 0,
        val seaLevel: Int = 0,
        val groundLevel: Int = 0
    )

    data class Wind(
        val speed: Double = 0.0,
        val deg: Double = 0.0,
        val gust: Double = 0.0
    )

    data class Rain(
        val rain1h: Double = 0.0
    )

    data class Clouds(
        val all: Int = 0
    )

    data class Sys(
        val type: Int = 0,
        val id: Int = 0,
        val country: String = "",
        val sunrise: Long = 0,
        val sunset: Long = 0
    )
}
