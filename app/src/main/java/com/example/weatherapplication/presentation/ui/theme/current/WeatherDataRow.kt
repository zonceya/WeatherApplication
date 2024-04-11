package com.example.weatherapplication.presentation.ui.theme.current

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.example.weatherapplication.domain.util.displayTemperature
import com.example.weatherapplication.domain.util.kelvinToCelsius
import com.example.weatherapplication.presentation.WeatherDataDisplay
import com.example.weatherapplication.presentation.current.CurrentWeatherState
import com.example.weatherapplication.presentation.ui.theme.components.getBackgroundColor
@Composable
fun WeatherDataRow(state: CurrentWeatherState) {
    val backgroundColor =
        state.currentWeatherInfo?.currentWeatherData?.description?.let {
            getBackgroundColor(it)
        }

    backgroundColor?.let {
        Modifier.fillMaxWidth()
            .background(it)
    }?.let { it ->
        Box(
        modifier = it
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround

        ) {
            state.currentWeatherInfo?.currentWeatherData?.tempMin?.let {

                WeatherDataDisplay(
                    value = it.toInt()  ,
                    metrics=  "°",
                    unit = "min",
                    iconTint = Color.White,
                    textStyle = TextStyle(color = Color.White)
                )
            }
            state.currentWeatherInfo?.currentWeatherData?.temp?.let {
                val toCelsius = displayTemperature(it)
                WeatherDataDisplay(
                    value = toCelsius.toInt(),
                    metrics=  "°",
                    unit = "current",
                    iconTint = Color.White,
                    textStyle = TextStyle(color = Color.White)
                )
            }
            state.currentWeatherInfo?.currentWeatherData?.tempMax?.let {
                WeatherDataDisplay(
                    value = it.toInt()  ,
                    metrics=  "°",
                    unit = "max",
                    iconTint = Color.White,
                    textStyle = TextStyle(color = Color.White)
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp) // Height of the underline
                .background(Color.White)
                .align(Alignment.BottomCenter) // Align it to the bottom of the row
        )
    }
    }
}
