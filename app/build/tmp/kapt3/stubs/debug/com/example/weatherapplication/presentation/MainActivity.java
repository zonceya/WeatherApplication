package com.example.weatherapplication.presentation;

import android.Manifest;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.LocalOnBackPressedDispatcherOwner;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.*;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.example.weatherapplication.presentation.current.CurrentWeatherViewModel;
import com.example.weatherapplication.presentation.forecast.ForecastWeatherViewModel;
import com.example.weatherapplication.presentation.location.LocationWeatherViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0007J\u0012\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0015R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001c"}, d2 = {"Lcom/example/weatherapplication/presentation/MainActivity;", "Landroidx/activity/ComponentActivity;", "()V", "forecastViewModel", "Lcom/example/weatherapplication/presentation/forecast/ForecastWeatherViewModel;", "getForecastViewModel", "()Lcom/example/weatherapplication/presentation/forecast/ForecastWeatherViewModel;", "forecastViewModel$delegate", "Lkotlin/Lazy;", "locationWeatherViewModel", "Lcom/example/weatherapplication/presentation/location/LocationWeatherViewModel;", "getLocationWeatherViewModel", "()Lcom/example/weatherapplication/presentation/location/LocationWeatherViewModel;", "locationWeatherViewModel$delegate", "permissionLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "", "", "viewModel", "Lcom/example/weatherapplication/presentation/current/CurrentWeatherViewModel;", "getViewModel", "()Lcom/example/weatherapplication/presentation/current/CurrentWeatherViewModel;", "viewModel$delegate", "MainContent", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.activity.ComponentActivity {
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy forecastViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy locationWeatherViewModel$delegate = null;
    private androidx.activity.result.ActivityResultLauncher<java.lang.String[]> permissionLauncher;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.weatherapplication.presentation.current.CurrentWeatherViewModel getViewModel() {
        return null;
    }
    
    private final com.example.weatherapplication.presentation.forecast.ForecastWeatherViewModel getForecastViewModel() {
        return null;
    }
    
    private final com.example.weatherapplication.presentation.location.LocationWeatherViewModel getLocationWeatherViewModel() {
        return null;
    }
    
    @java.lang.Override
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.O)
    @android.annotation.SuppressLint(value = {"UnusedMaterialScaffoldPaddingParameter"})
    @androidx.compose.runtime.Composable
    public final void MainContent() {
    }
}