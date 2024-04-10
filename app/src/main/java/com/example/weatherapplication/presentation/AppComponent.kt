package com.example.weatherapplication.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapplication.R
import com.example.weatherapplication.data.NavigationItem
import com.example.weatherapplication.presentation.location.LocationWeatherViewModel
import com.example.weatherapplication.presentation.ui.theme.Cloudy
import com.example.weatherapplication.presentation.ui.theme.Rainy
import com.example.weatherapplication.presentation.ui.theme.location.LocationInput
import kotlin.math.roundToInt


@Composable
fun AppToolbar(
    toolbarTitle: String,
    onSearchLocation: (String) -> Unit,
    onAddFavorite: (String) -> Unit,
    navigationIconClicked: () -> Unit,
) {
    val (isSearchEnabled, setSearchEnabled) = remember { mutableStateOf(false) }
    if (isSearchEnabled) {
        // Show the text box for location input
        LocationInput(
            onLocationChanged = { location ->
                // Perform search with the provided location
                onSearchLocation(location)
            },
            onSearchClicked = {
                // Hide the text box after the search is triggered
                setSearchEnabled(false)
            },
            onAddFavorite = { location ->
                onAddFavorite(location)
                // Handle adding to favorites
                // For example: locationWeatherViewModel.addFavoriteLocation(location)
                setSearchEnabled(false) // Hide search box
            }
        )
    } else {
        // Show the search icon
        TopAppBar(
            backgroundColor = Color.White, // Consider adjusting the background color
            title = {
                Text(
                    text = toolbarTitle,
                    color = Color.White, // Set text color to white for better contrast
                )
            },
            navigationIcon = {
                IconButton(onClick = navigationIconClicked) {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = Color.Black // Apply tint color to the menu icon
                    )
                }
            },
            actions = {
                IconButton(onClick = { setSearchEnabled(true) }) {
                    Icon(
                        painter = painterResource(id = R.drawable.icon_search),
                        contentDescription = "Search",

                    )
                }
            }
        )
    }
}

@Composable
fun NavigationDrawerHeader(
    navigationDrawerItems: List<NavigationItem>,
    onNavigationItemClicked: (NavigationItem) -> Unit,
    onFavoriteClicked: () -> Unit,
    locationWeatherViewModel: LocationWeatherViewModel
) {
    Box(
        modifier = Modifier
            .background(
                Brush.horizontalGradient(
                    listOf(Rainy, Cloudy)
                )
            )
            .fillMaxWidth()
            .height(180.dp)
            .padding(32.dp)
    ) {
        LazyColumn(modifier = Modifier.fillMaxWidth()) {
            items(navigationDrawerItems) { item ->
                NavigationItemRow(
                    item = item,
                    onNavigationItemClicked = onNavigationItemClicked,
                    onFavoriteClicked = onFavoriteClicked // Pass lambda to handle favorite action click
                )
            }
        }
    }
    val favoriteLocations = locationWeatherViewModel.getFavoriteLocations()
}


@Composable
fun NavigationDrawerBody(
    favoriteLocations: Set<String>,
    onNavigationItemClicked: (NavigationItem) -> Unit
) {
    LazyColumn(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White) // Set the background color to gray
    ) {
        items(favoriteLocations.toList()) { location ->
            NavigationDrawerText(
                title = location,
                color = Rainy
            )
        }
    }
}





@Composable
fun NavigationItemRow(
    item: NavigationItem,
    onNavigationItemClicked:(NavigationItem) -> Unit,
    onFavoriteClicked: () -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                if (item.isFavoriteAction) {
                    onFavoriteClicked() // Invoke lambda to handle favorite action click
                } else {
                    onNavigationItemClicked(item) // Invoke lambda to handle regular navigation item click
                }
            }
            .padding(all = 16.dp)
    ) {
        Icon(
            imageVector = item.icon,
            contentDescription = item.description,
        )

        Spacer(modifier = Modifier.width(18.dp))

        NavigationDrawerText(title = item.title, color = Rainy)
    }
}

@Composable
fun NavigationDrawerText(
    title: String,
    color: Color
) {
    Text(
        text = title,
        style = TextStyle(
            color = Color.Black,
            fontSize = 18.sp,
            fontStyle = FontStyle.Normal,
            fontWeight = FontWeight.Bold
        ),
        modifier = Modifier.padding(horizontal = 16.dp, vertical = 8.dp)
    )
}
