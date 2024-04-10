package com.example.weatherapplication.data.location;

import android.Manifest;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationManager;
import androidx.core.content.ContextCompat;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.example.weatherapplication.domain.location.LocationTracker;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/example/weatherapplication/data/location/DefaultLocationTracker;", "Lcom/example/weatherapplication/domain/location/LocationTracker;", "locationClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "application", "Landroid/app/Application;", "(Lcom/google/android/gms/location/FusedLocationProviderClient;Landroid/app/Application;)V", "getCurrentLocation", "Landroid/location/Location;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@kotlinx.coroutines.ExperimentalCoroutinesApi
public final class DefaultLocationTracker implements com.example.weatherapplication.domain.location.LocationTracker {
    @org.jetbrains.annotations.NotNull
    private final com.google.android.gms.location.FusedLocationProviderClient locationClient = null;
    @org.jetbrains.annotations.NotNull
    private final android.app.Application application = null;
    
    @javax.inject.Inject
    public DefaultLocationTracker(@org.jetbrains.annotations.NotNull
    com.google.android.gms.location.FusedLocationProviderClient locationClient, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCurrentLocation(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super android.location.Location> $completion) {
        return null;
    }
}