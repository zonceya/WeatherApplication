package com.example.weatherapplication.presentation.ui.theme.forecast

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapplication.presentation.forecast.ForecastWeatherSate
import com.example.weatherapplication.presentation.getBackgroundColor
import com.example.weatherapplication.presentation.ui.theme.forecast.ForecastWeatherDisplay
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun ForecastWeatherCard(
    state: ForecastWeatherSate,
    modifier: Modifier = Modifier
) {
    var backgroundColors: Color? = null
    state.forecastWeatherInfo?.forecastDataPerDay?.forEach { (date, forecastDataForDay) ->
        val dateParsed = LocalDate.parse(date.toString(), DateTimeFormatter.ofPattern("yyyyMMdd"))
        state.forecastWeatherInfo?.forecastDataPerDay?.let { data ->
            // Get the forecast data for the first day
            val firstDayForecastData = data.values.firstOrNull()

            // Check if forecast data for the first day exists
            if (firstDayForecastData != null) {
                backgroundColors = firstDayForecastData.firstOrNull()
                    ?.let { getBackgroundColor(it.description) }
                // Now you have the background image for the weather description of the first day
                // You can use this backgroundImage in your UI
            }
        }

            Box(

            ) {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 5.dp)
                ) {
                    item {
                        Text(
                            text = dateParsed.dayOfWeek.toString().padEnd(9), // Display the day of the week
                            fontSize = 15.sp,
                            color = Color.White,
                            modifier = Modifier.padding(vertical = 16.dp)
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                    }

                    items(forecastDataForDay) { forecastWeatherDataItem ->
                        ForecastWeatherDisplay(
                            forecastWeatherData = forecastWeatherDataItem,
                            modifier = Modifier
                                .padding(horizontal = 2.dp)
                                .padding(vertical =20.dp)
                        )
                    }
                }
            }
        }
    }

