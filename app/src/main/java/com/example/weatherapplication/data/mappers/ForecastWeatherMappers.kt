package com.example.weatherapplication.data.mappers

import com.example.weatherapplication.data.remote.forecast.ForecastWeatherDataDTO

fun ForecastWeatherDataDTO.toForecastWeatherData(): ForecastWeatherDataDTO {
    val forecastItems = this.list.map { forecastItemDto ->
        ForecastWeatherDataDTO.ForecastItem(
            dt = forecastItemDto.dt,
            main = ForecastWeatherDataDTO.ForecastItem.Main(
                temp = forecastItemDto.main.temp,
                feelsLike = forecastItemDto.main.feelsLike,
                tempMin = forecastItemDto.main.tempMin,
                tempMax = forecastItemDto.main.tempMax,
                pressure = forecastItemDto.main.pressure,
                seaLevel = forecastItemDto.main.seaLevel,
                grndLevel = forecastItemDto.main.grndLevel,
                humidity = forecastItemDto.main.humidity,
                tempKf = forecastItemDto.main.tempKf
            ),
            weather = forecastItemDto.weather.map { weatherDto ->
                ForecastWeatherDataDTO.ForecastItem.Weather(
                    id = weatherDto.id,
                    main = weatherDto.main,
                    description = weatherDto.description,
                    icon = weatherDto.icon
                )
            },
            clouds = ForecastWeatherDataDTO.ForecastItem.Clouds(
                all = forecastItemDto.clouds.all
            ),
            wind = ForecastWeatherDataDTO.ForecastItem.Wind(
                speed = forecastItemDto.wind.speed,
                deg = forecastItemDto.wind.deg,
                gust = forecastItemDto.wind.gust
            ),
            visibility = forecastItemDto.visibility,
            pop = forecastItemDto.pop,
            sys = ForecastWeatherDataDTO.ForecastItem.Sys(
                pod = forecastItemDto.sys.pod
            ),
            dtTxt = forecastItemDto.dtTxt
        )
    }

    return ForecastWeatherDataDTO(
        cod = this.cod,
        message = this.message,
        cnt = this.cnt,
        list = forecastItems,
        city = ForecastWeatherDataDTO.City(
            id = this.city.id,
            name = this.city.name,
            coord = ForecastWeatherDataDTO.City.Coord(
                lat = this.city.coord.lat,
                lon = this.city.coord.lon
            ),
            country = this.city.country,
            population = this.city.population,
            timezone = this.city.timezone,
            sunrise = this.city.sunrise,
            sunset = this.city.sunset
        )
    )
}
