package com.example.weatherapplication.presentation;

import androidx.compose.material.icons.Icons;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.example.weatherapplication.R;
import com.example.weatherapplication.data.NavigationItem;
import com.example.weatherapplication.presentation.location.LocationWeatherViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aF\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u001a*\u0010\t\u001a\u00020\u00012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u0005H\u0007\u001a@\u0010\u000e\u001a\u00020\u00012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00102\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0007\u001a%\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0017H\u0007\u00f8\u0001\u0000\u00f8\u0001\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a2\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\bH\u0007\u0082\u0002\u000b\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"AppToolbar", "", "toolbarTitle", "", "onSearchLocation", "Lkotlin/Function1;", "onAddFavorite", "navigationIconClicked", "Lkotlin/Function0;", "NavigationDrawerBody", "favoriteLocations", "", "onNavigationItemClicked", "Lcom/example/weatherapplication/data/NavigationItem;", "NavigationDrawerHeader", "navigationDrawerItems", "", "onFavoriteClicked", "locationWeatherViewModel", "Lcom/example/weatherapplication/presentation/location/LocationWeatherViewModel;", "NavigationDrawerText", "title", "color", "Landroidx/compose/ui/graphics/Color;", "NavigationDrawerText-4WTKRHQ", "(Ljava/lang/String;J)V", "NavigationItemRow", "item", "app_debug"})
public final class AppComponentKt {
    
    @androidx.compose.runtime.Composable
    public static final void AppToolbar(@org.jetbrains.annotations.NotNull
    java.lang.String toolbarTitle, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onSearchLocation, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onAddFavorite, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> navigationIconClicked) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NavigationDrawerHeader(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.weatherapplication.data.NavigationItem> navigationDrawerItems, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.weatherapplication.data.NavigationItem, kotlin.Unit> onNavigationItemClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFavoriteClicked, @org.jetbrains.annotations.NotNull
    com.example.weatherapplication.presentation.location.LocationWeatherViewModel locationWeatherViewModel) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NavigationDrawerBody(@org.jetbrains.annotations.NotNull
    java.util.Set<java.lang.String> favoriteLocations, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.weatherapplication.data.NavigationItem, kotlin.Unit> onNavigationItemClicked) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NavigationItemRow(@org.jetbrains.annotations.NotNull
    com.example.weatherapplication.data.NavigationItem item, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.example.weatherapplication.data.NavigationItem, kotlin.Unit> onNavigationItemClicked, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> onFavoriteClicked) {
    }
}