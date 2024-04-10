package com.example.weatherapplication.presentation.forecast;

import androidx.lifecycle.ViewModel;
import com.example.weatherapplication.domain.location.LocationTracker;
import com.example.weatherapplication.domain.repository.WeatherRepository;
import com.example.weatherapplication.domain.util.Constants;
import com.example.weatherapplication.domain.util.Resource;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R+\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r\u00a8\u0006\u0012"}, d2 = {"Lcom/example/weatherapplication/presentation/forecast/ForecastWeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/weatherapplication/domain/repository/WeatherRepository;", "locationTracker", "Lcom/example/weatherapplication/domain/location/LocationTracker;", "(Lcom/example/weatherapplication/domain/repository/WeatherRepository;Lcom/example/weatherapplication/domain/location/LocationTracker;)V", "<set-?>", "Lcom/example/weatherapplication/presentation/forecast/ForecastWeatherSate;", "state", "getState", "()Lcom/example/weatherapplication/presentation/forecast/ForecastWeatherSate;", "setState", "(Lcom/example/weatherapplication/presentation/forecast/ForecastWeatherSate;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "getWeatherForecast", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ForecastWeatherViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.weatherapplication.domain.repository.WeatherRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.weatherapplication.domain.location.LocationTracker locationTracker = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState state$delegate = null;
    
    @javax.inject.Inject
    public ForecastWeatherViewModel(@org.jetbrains.annotations.NotNull
    com.example.weatherapplication.domain.repository.WeatherRepository repository, @org.jetbrains.annotations.NotNull
    com.example.weatherapplication.domain.location.LocationTracker locationTracker) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.weatherapplication.presentation.forecast.ForecastWeatherSate getState() {
        return null;
    }
    
    private final void setState(com.example.weatherapplication.presentation.forecast.ForecastWeatherSate p0) {
    }
    
    public final void getWeatherForecast() {
    }
}