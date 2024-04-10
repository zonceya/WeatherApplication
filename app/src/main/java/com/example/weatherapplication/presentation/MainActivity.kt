package com.example.weatherapplication.presentation

import android.Manifest
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.viewModels
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.Text
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.weatherapplication.presentation.current.CurrentWeatherViewModel
import com.example.weatherapplication.presentation.forecast.ForecastWeatherViewModel
import com.example.weatherapplication.presentation.location.LocationWeatherViewModel
import com.example.weatherapplication.presentation.ui.theme.DarkBlue
import com.plcoding.weatherapp.presentation.ui.theme.WeatherAppTheme
import com.example.weatherapplication.presentation.ui.theme.current.WeatherCard
import com.example.weatherapplication.presentation.ui.theme.forecast.ForecastWeatherCard
import com.example.weatherapplication.presentation.ui.theme.location.LocationWeatherCard
import com.example.weatherapplication.R
import com.example.weatherapplication.data.navigationItemsList
import com.example.weatherapplication.presentation.ui.theme.current.WeatherDataRow
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val viewModel: CurrentWeatherViewModel by viewModels()
    private val forecastViewModel: ForecastWeatherViewModel by viewModels()
    private val locationWeatherViewModel: LocationWeatherViewModel by viewModels()
    private lateinit var permissionLauncher: ActivityResultLauncher<Array<String>>

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Register permission launcher


        permissionLauncher = registerForActivityResult(
            ActivityResultContracts.RequestMultiplePermissions()
        ) { permissions ->
            if (permissions.all { it.value }) {
                // All permissions granted, fetch weather data
                viewModel.getCurrentWeather()
                forecastViewModel.getWeatherForecast()
            } else {
                // Handle permission denial
                // For example, show a message or request again
            }
        }
        // Request location permissions
        permissionLauncher.launch(
            arrayOf(
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
        )

        // Set the content using Jetpack Compose
        setContent {
            WeatherAppTheme {
                MainContent()
            }
        }
    }

    @RequiresApi(Build.VERSION_CODES.O)
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    @Composable
    fun MainContent() {
        val scaffoldState = rememberScaffoldState()
        val coroutineScope = rememberCoroutineScope()
        val favoriteLocations by remember { locationWeatherViewModel.favoriteLocations }
        Scaffold(
            scaffoldState = scaffoldState,
            topBar = {
                AppToolbar(
                    toolbarTitle = "",
                    onSearchLocation = { location ->
                        locationWeatherViewModel.getLocationCurrentWeather(location)
                    },
                    onAddFavorite = { location ->
                        locationWeatherViewModel.addFavoriteLocation(location)
                    },
                    navigationIconClicked = {
                        coroutineScope.launch {
                            scaffoldState.drawerState.open()
                        }
                    }
                )
            },
            drawerGesturesEnabled = scaffoldState.drawerState.isOpen,
            drawerContent = {
                Column {
                    NavigationDrawerHeader(
                        navigationDrawerItems = navigationItemsList,
                        onNavigationItemClicked = { navigationItem ->
                            // Handle regular navigation item click
                            Log.d("ComingHere", "inside_NavigationItemClicked")
                            Log.d("ComingHere", "${navigationItem.itemId} ${navigationItem.title}")
                        },
                        onFavoriteClicked = {
                            // Handle favorite icon click
                            // No need to get favorite locations here since it's handled inside NavigationDrawerHeader
                            Log.d("ComingHere", "Favorite icon clicked")
                        },
                        locationWeatherViewModel = locationWeatherViewModel // Pass locationWeatherViewModel
                    )

                    NavigationDrawerBody(
                        favoriteLocations = favoriteLocations,
                        onNavigationItemClicked = {
                            Log.d("ComingHere", "inside_NavigationItemClicked")
                            Log.d("ComingHere", "${it.itemId} ${it.title}")
                        }
                    )
                }
            }


        ) {
            // Content of your screen
            // Add your UI elements here
            Column {
                Box(
                    modifier = Modifier.fillMaxSize()
                ) {
                    // Background image
                    val backgroundColor =
                        viewModel.state.currentWeatherInfo?.currentWeatherData?.description?.let {
                            getBackgroundColor(it)
                        }
                    backgroundColor?.let {
                        Modifier.fillMaxWidth()
                            .background(it)
                    }?.let {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .fillMaxWidth()
                                .background(backgroundColor)

                        ) {
                            Column {

                                Box(
                                    modifier = Modifier.fillMaxSize()
                                ) {
                                    Column(
                                        modifier = Modifier
                                            .fillMaxSize()
                                            .fillMaxSize()
                                    ) {
                                        // Conditional rendering based on locationWeatherInfo
                                        if (locationWeatherViewModel.state.locationWeatherInfo != null) {
                                            // Display LocationWeatherCard if locationWeatherInfo is not null
                                            LocationWeatherCard(state = locationWeatherViewModel.state)
                                        } else {
                                            // Display WeatherCard if locationWeatherInfo is null
                                            WeatherCard(state = viewModel.state)
                                            WeatherDataRow(state = viewModel.state)
                                        }

                                        Spacer(modifier = Modifier.height(13.dp))
                                        // Forecast card
                                        ForecastWeatherCard(state = forecastViewModel.state)
                                        Spacer(modifier = Modifier.height(16.dp))
                                    }
                                    // Loading indicator
                                    if (viewModel.state.isLoading) {
                                        CircularProgressIndicator(
                                            modifier = Modifier.align(Alignment.Center)
                                        )
                                    }
                                    // Error message
                                    viewModel.state.error?.let { error ->
                                        Text(
                                            text = error,
                                            color = Color.Red,
                                            modifier = Modifier.align(Alignment.Center)
                                        )
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

