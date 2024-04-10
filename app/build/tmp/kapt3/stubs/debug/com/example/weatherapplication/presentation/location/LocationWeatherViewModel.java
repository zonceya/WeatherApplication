package com.example.weatherapplication.presentation.location;

import androidx.lifecycle.ViewModel;
import com.example.weatherapplication.domain.repository.WeatherRepository;
import com.example.weatherapplication.domain.util.Constants;
import com.example.weatherapplication.domain.util.SharedPreferencesManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nJ\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tJ\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nJ\u000e\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\nR\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lcom/example/weatherapplication/presentation/location/LocationWeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/weatherapplication/domain/repository/WeatherRepository;", "sharedPreferencesManager", "Lcom/example/weatherapplication/domain/util/SharedPreferencesManager;", "(Lcom/example/weatherapplication/domain/repository/WeatherRepository;Lcom/example/weatherapplication/domain/util/SharedPreferencesManager;)V", "favoriteLocations", "Landroidx/compose/runtime/MutableState;", "", "", "getFavoriteLocations", "()Landroidx/compose/runtime/MutableState;", "<set-?>", "Lcom/example/weatherapplication/presentation/location/LocationWeatherState;", "state", "getState", "()Lcom/example/weatherapplication/presentation/location/LocationWeatherState;", "setState", "(Lcom/example/weatherapplication/presentation/location/LocationWeatherState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "addFavoriteLocation", "", "location", "getLocationCurrentWeather", "removeFavoriteLocation", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LocationWeatherViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.weatherapplication.domain.repository.WeatherRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.weatherapplication.domain.util.SharedPreferencesManager sharedPreferencesManager = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.Set<java.lang.String>> favoriteLocations = null;
    
    @javax.inject.Inject
    public LocationWeatherViewModel(@org.jetbrains.annotations.NotNull
    com.example.weatherapplication.domain.repository.WeatherRepository repository, @org.jetbrains.annotations.NotNull
    com.example.weatherapplication.domain.util.SharedPreferencesManager sharedPreferencesManager) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.weatherapplication.presentation.location.LocationWeatherState getState() {
        return null;
    }
    
    private final void setState(com.example.weatherapplication.presentation.location.LocationWeatherState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.Set<java.lang.String>> getFavoriteLocations() {
        return null;
    }
    
    public final void addFavoriteLocation(@org.jetbrains.annotations.NotNull
    java.lang.String location) {
    }
    
    public final void removeFavoriteLocation(@org.jetbrains.annotations.NotNull
    java.lang.String location) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.Set<java.lang.String> getFavoriteLocations() {
        return null;
    }
    
    public final void getLocationCurrentWeather(@org.jetbrains.annotations.NotNull
    java.lang.String location) {
    }
}