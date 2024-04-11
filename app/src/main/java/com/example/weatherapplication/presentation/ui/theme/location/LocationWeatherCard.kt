package com.example.weatherapplication.presentation.ui.theme.location

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import com.example.weatherapplication.presentation.WeatherDataDisplay
import com.example.weatherapplication.presentation.location.LocationWeatherState
import com.example.weatherapplication.R
import com.example.weatherapplication.domain.util.displayTemperature
import com.example.weatherapplication.domain.weather.WeatherType
import com.example.weatherapplication.domain.weather.current.CurrentWeatherData
import com.example.weatherapplication.presentation.ui.theme.components.getBackgroundImageForWeatherDescription
import com.example.weatherapplication.presentation.ui.theme.Cloudy
import com.example.weatherapplication.presentation.ui.theme.Rainy
import com.example.weatherapplication.presentation.ui.theme.Sunny

@Composable
fun LocationWeatherCard(
    state: LocationWeatherState,
    modifier: Modifier = Modifier
) {
    state.locationWeatherInfo?.locationWeatherData?.let { data ->
        val backgroundImage = data.let {
            getBackgroundImageForWeatherDescription(it.description)
        }
        val backgroundColor = data.let {
            //getBackgroundColorForWeatherType(it)
        } ?: Color.Transparent

        Box(
            modifier = modifier
                .height(350.dp)
                .fillMaxWidth(),
        ) {
            // Background Image
            backgroundImage.let {
                Image(
                    painter = it,
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = Color.Gray)
                        .align(Alignment.TopCenter)
                        .height(200.dp)
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {


                Spacer(modifier = Modifier.height(150.dp))

                Text(
                    text = "${displayTemperature(state.locationWeatherInfo.locationWeatherData.temp)}°",
                    fontSize = 50.sp,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(16.dp))

                Text(
                    text = data.description,
                    fontSize = 20.sp,
                    color = Color.White
                )

                Spacer(modifier = Modifier.height(70.dp))
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp)
                        .background(color = Sunny)
                )

            }
        }
    }
}



