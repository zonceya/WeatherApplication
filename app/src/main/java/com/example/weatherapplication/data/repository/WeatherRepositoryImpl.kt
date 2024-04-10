package com.example.weatherapplication.data.repository


import android.os.Build
import androidx.annotation.RequiresApi
import com.example.weatherapplication.data.mappers.toCurrentWeatherDataDto
import com.example.weatherapplication.data.mappers.toForecastWeatherData
import com.example.weatherapplication.data.mappers.toLocationWeatherDataDto
import com.example.weatherapplication.data.remote.WeatherApi
import com.example.weatherapplication.domain.repository.WeatherRepository
import com.example.weatherapplication.domain.util.Resource
import com.example.weatherapplication.domain.weather.current.CurrentWeatherData
import com.example.weatherapplication.domain.weather.current.CurrentWeatherInfo
import com.example.weatherapplication.domain.weather.forecast.ForecastWeatherData
import com.example.weatherapplication.domain.weather.forecast.ForecastWeatherInfo
import com.example.weatherapplication.domain.weather.location.LocationWeatherData
import com.example.weatherapplication.domain.weather.location.LocationWeatherInfo
import java.time.Instant
import java.time.LocalDateTime
import java.time.ZoneOffset
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {

   /* override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch(e: Exception) {
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }*/

    override suspend fun getCurrentWeather(lat: Double, lon: Double, appid: String): Resource<CurrentWeatherInfo> {
        try {
            val currentWeatherDto = api.getCurrentWeather(lat, lon, appid).toCurrentWeatherDataDto()

            val currentWeatherData = currentWeatherDto.let { dto ->
                CurrentWeatherData(
                    temp = dto.main.temp,
                    tempMin = dto.main.tempMin,
                    tempMax = dto.main.tempMax,
                    description = dto.weather.firstOrNull()?.description ?: "",
                    icon = dto.weather.firstOrNull()?.icon ?: ""
                )
            }

            val mappedData = currentWeatherData.let { data ->
                CurrentWeatherInfo(
                    currentWeatherInfo = listOf(data),
                    currentWeatherData = data
                )
            }

            return Resource.Success(mappedData)
        } catch (e: Exception) {
            e.printStackTrace()
            return Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }


    @RequiresApi(Build.VERSION_CODES.O)
    override suspend fun getWeatherForecast(
        lat: Double,
        lon: Double,
        appid: String
    ): Resource<ForecastWeatherInfo> {
        try {
            val forecastWeatherDto = api.getWeatherForecast(lat, lon, appid).toForecastWeatherData()
            val forecastDataPerDay = forecastWeatherDto.list.groupBy { forecastDto ->
                // Convert Unix timestamp to LocalDateTime
                val dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(forecastDto.dt), ZoneOffset.UTC)
                // Extract the date part and convert it to an integer
                val dateInt = dateTime.toLocalDate().toString().replace("-", "").toInt()
                dateInt // Grouping by the date as an integer
            }.mapValues { (_, list) ->
                // Selecting one representative value for each group (per date)
                list.firstOrNull()?.let { forecastDto ->
                    ForecastWeatherData(
                        temp = forecastDto.main.temp,
                        description = forecastDto.weather.firstOrNull()?.description ?: "",
                        dt = forecastDto.dt,
                        icon = forecastDto.weather.firstOrNull()?.icon ?: ""
                    )
                }
            }

            val mappedData = ForecastWeatherInfo(
                forecastDataPerDay = forecastDataPerDay.mapValues { (_, value) ->
                    listOfNotNull(value) // Convert ForecastWeatherData? to List<ForecastWeatherData>
                },
                forecastWeatherData = forecastDataPerDay.values.firstOrNull { it != null } // Select the first non-null ForecastWeatherData
            )

            return Resource.Success(mappedData)
        } catch (e: Exception) {
            e.printStackTrace()
            return Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }

    override suspend fun getLocationCurrentWeather(
        location: String,
        appid: String
    ): Resource<LocationWeatherInfo> {
        try {
            val locationWeatherDto = api.getWeatherByLocation(location.toString(), appid).toLocationWeatherDataDto()

            val locationWeatherData = locationWeatherDto.let { dto ->
               LocationWeatherData(
                    temp = dto.main.temp,
                    tempMin = dto.main.tempMin,
                    tempMax = dto.main.tempMax,
                    description = dto.weather.firstOrNull()?.description ?: "",
                    icon = dto.weather.firstOrNull()?.icon ?: ""
                )
            }

            val mappedData = locationWeatherData.let { data ->
                LocationWeatherInfo(
                    locationWeatherInfo = listOf(data),
                    locationWeatherData = data
                )
            }

            return Resource.Success(mappedData)
        } catch (e: Exception) {
            e.printStackTrace()
            return Resource.Error(e.message ?: "An unknown error occurred.")
        }
    }


}