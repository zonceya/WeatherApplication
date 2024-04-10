package com.example.weatherapplication.presentation.ui.theme.forecast

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.weatherapplication.R
import com.example.weatherapplication.domain.util.DisplayTemperature
import com.example.weatherapplication.domain.weather.WeatherType
import com.example.weatherapplication.domain.weather.forecast.ForecastWeatherData
import com.example.weatherapplication.presentation.getBackgroundColor
import com.example.weatherapplication.presentation.getBackgroundIcon
import com.example.weatherapplication.presentation.getBackgroundImageForWeatherDescription
import com.example.weatherapplication.presentation.getWeatherIcon

@Composable
fun ForecastWeatherDisplay(
    forecastWeatherData: ForecastWeatherData,
    modifier: Modifier = Modifier,
    textColor: Color = Color.White
) {
    val backgroundIcon =
        getBackgroundIcon(forecastWeatherData.description)
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceAround
    ) {
        Spacer(modifier = Modifier.width(80.dp))
        Image(
            painter =  backgroundIcon,
            contentDescription = "Weather Icon",
            modifier = Modifier.size(24.dp)
        )
        Spacer(modifier = Modifier.width(100.dp))
        Text(
            text = "${DisplayTemperature(forecastWeatherData.temp)}°C",
            color = textColor,
            fontWeight = FontWeight.Bold

        )
    }
}
