package com.example.weatherapplication.presentation.ui.theme.location

import androidx.activity.OnBackPressedCallback
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
@Composable
fun LocationInput(
    onLocationChanged: (String) -> Unit,
    onSearchClicked: () -> Unit,
    onAddFavorite: (String) -> Unit,
    onBackClicked: () -> Unit,

) {
    var location by remember { mutableStateOf(TextFieldValue()) }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Enter Location")
        Spacer(modifier = Modifier.height(8.dp))
        OutlinedTextField(
            value = location,
            onValueChange = { location = it },
            label = { Text("Location") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            keyboardOptions = KeyboardOptions.Default.copy(imeAction = ImeAction.Done),
            keyboardActions = KeyboardActions(onDone = {
                onLocationChanged(location.text)
                onSearchClicked()
            }),
            leadingIcon = {
                IconButton(onClick = { onBackClicked() }) {
                    Icon(Icons.AutoMirrored.Filled.ArrowBack, contentDescription = "Back")
                }
            },
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                onAddFavorite(location.text) // Invoke the onAddFavorite callback
                onLocationChanged(location.text)
            },
            modifier = Modifier.padding(top = 8.dp)
        ) {
            Text("Add to Favorites")
        }

       // FavoritesList(favoriteLocations = favoriteLocations, onRemoveFavorite = onRemoveFavorite)
    }
}
