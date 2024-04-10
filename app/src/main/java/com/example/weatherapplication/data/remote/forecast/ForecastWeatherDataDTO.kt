package com.example.weatherapplication.data.remote.forecast

data class ForecastWeatherDataDTO(
    val cod: String = "",
    val message: Int = 0,
    val cnt: Int = 0,
    val list: List<ForecastItem> = emptyList(),
    val city: City = City()
) {
    data class ForecastItem(
        val dt: Long = 0,
        val main: Main = Main(),
        val weather: List<Weather> = emptyList(),
        val clouds: Clouds = Clouds(),
        val wind: Wind = Wind(),
        val visibility: Int = 0,
        val pop: Double = 0.0,
        val sys: Sys = Sys(),
        val dtTxt: String = ""
    ) {
        data class Main(
            val temp: Double = 0.0,
            val feelsLike: Double = 0.0,
            val tempMin: Double = 0.0,
            val tempMax: Double = 0.0,
            val pressure: Int = 0,
            val seaLevel: Int = 0,
            val grndLevel: Int = 0,
            val humidity: Int = 0,
            val tempKf: Double = 0.0
        )

        data class Weather(
            val id: Int = 0,
            val main: String = "",
            val description: String = "",
            val icon: String = ""
        )

        data class Clouds(
            val all: Int = 0
        )

        data class Wind(
            val speed: Double = 0.0,
            val deg: Int = 0,
            val gust: Double = 0.0
        )

        data class Sys(
            val pod: String = ""
        )
    }

    data class City(
        val id: Int = 0,
        val name: String = "",
        val coord: Coord = Coord(),
        val country: String = "",
        val population: Int = 0,
        val timezone: Int = 0,
        val sunrise: Long = 0,
        val sunset: Long = 0
    ) {
        data class Coord(
            val lat: Double = 0.0,
            val lon: Double = 0.0
        )
    }
}
