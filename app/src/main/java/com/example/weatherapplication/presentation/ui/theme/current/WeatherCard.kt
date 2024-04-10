package com.example.weatherapplication.presentation.ui.theme.current

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import com.example.weatherapplication.domain.weather.WeatherType
import com.example.weatherapplication.domain.weather.current.CurrentWeatherData
import com.example.weatherapplication.presentation.WeatherDataDisplay
import com.example.weatherapplication.presentation.current.CurrentWeatherState
import com.example.weatherapplication.R
import com.example.weatherapplication.domain.util.DisplayTemperature
import com.example.weatherapplication.presentation.getBackgroundImageForWeatherDescription
import com.example.weatherapplication.presentation.getBackgroundWeatherImage
import com.example.weatherapplication.presentation.ui.theme.Cloudy
import com.example.weatherapplication.presentation.ui.theme.Rainy
import com.example.weatherapplication.presentation.ui.theme.Sunny
import kotlin.math.roundToInt

@Composable
fun WeatherCard(
    state: CurrentWeatherState,
    modifier: Modifier = Modifier
) {
    state.currentWeatherInfo?.currentWeatherData?.let { data ->
        val backgroundImage = data.let {
            getBackgroundImageForWeatherDescription(it.description)
        }
        Box(
            modifier = modifier
                .height(300.dp)
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
                Spacer(modifier = Modifier.height(80.dp))
               Text(
                   text = "${DisplayTemperature(state.currentWeatherInfo.currentWeatherData.temp)}°",
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


            }
        }
    }
}


