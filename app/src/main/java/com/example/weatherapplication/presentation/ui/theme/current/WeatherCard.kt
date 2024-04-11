package com.example.weatherapplication.presentation.ui.theme.current

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.layout.ContentScale
import com.example.weatherapplication.presentation.current.CurrentWeatherState
import com.example.weatherapplication.domain.util.displayTemperature
import com.example.weatherapplication.presentation.ui.theme.components.getBackgroundImageForWeatherDescription

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
                   text = "${displayTemperature(state.currentWeatherInfo.currentWeatherData.temp)}°",
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


