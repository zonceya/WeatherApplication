package com.example.weatherapplication.presentation

import android.annotation.SuppressLint
import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import kotlinx.coroutines.launch
import com.example.weatherapplication.R

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun TopAppBaCard() {
    val context = LocalContext.current
    val iconFavorate = painterResource(id = R.drawable.ic_favorate)
    val iconSearch = painterResource(id = R.drawable.ic_search)
    val scaffoldState = rememberScaffoldState()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                contentColor = Color.White,
                title = { Text(text = "Top app bar") },
                navigationIcon = {
                    IconButton(onClick = {
                        coroutineScope.launch {
                            scaffoldState.drawerState.open() // Open the drawer when clicked
                        }
                    }) {
                        Icon(Icons.Default.Menu, contentDescription = null)
                    }
                },
                actions = {
                    IconButton(onClick = { makeToast(context, "Favourites") }) {
                        Icon(painter = iconFavorate, contentDescription = null)
                    }
                    IconButton(onClick = { makeToast(context, "Search") }) {
                        Icon(painter = iconSearch, contentDescription = null)
                    }
                    IconButton(onClick = { /* Handle More actions */ }) {
                        Icon(Icons.Default.MoreVert, contentDescription = null)
                    }
                }
            )
        },
        drawerContent = {
            // Drawer content goes here
            DrawerContent()
        },
        content = {
            Column {
                // Add your UI elements here
                Text(text = "Hello, World!")
                Button(onClick = { /* Handle button click */ }) {
                    Text(text = "Click me")
                }
            }
        }
    )
}

fun makeToast(context: Context, message: String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}

@Composable
fun DrawerContent() {
    Column {
        Text("Drawer Item 1")
        Text("Drawer Item 2")
        Text("Drawer Item 3")
        // Add more drawer items as needed
    }
}
