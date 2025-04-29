package com.example.weather.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.weather.ui.screen.components.ActionBar
import com.example.weather.ui.screen.components.AirQuality
import com.example.weather.ui.screen.components.DailyForecast
import com.example.weather.ui.screen.components.WeeklyForecast
import com.example.weather.ui.screen.data.AirQualityData
import com.example.weather.ui.screen.data.AirQualityItem
import com.example.weather.ui.screen.data.DailyForecastData
import com.example.weather.ui.screen.data.DailyForecastState
import com.example.weather.ui.screen.data.ForecastData
import com.example.weather.ui.screen.data.ForecastItem
import com.example.weather.ui.screen.data.LocationData
import com.example.weather.ui.screen.data.LocationState
import com.example.weather.ui.theme.ColorBackground

@Composable
fun WeatherScreen(
    locationState: LocationState = LocationData,
    dailyForecastState: DailyForecastState = DailyForecastData,
    airQualityState: List<AirQualityItem> = AirQualityData,
    forecastState: List<ForecastItem> = ForecastData
) {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        containerColor = ColorBackground
    ) { paddings ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(paddings)
                .padding(horizontal = 24.dp, vertical = 10.dp)
        ) {
            ActionBar(
                state = locationState
            )
            SpacerWithHeight(12)

            DailyForecast(
                state = dailyForecastState
            )
            SpacerWithHeight(24)

            AirQuality(
                state = airQualityState
            )
            SpacerWithHeight(24)

            WeeklyForecast(
                state = forecastState
            )
        }
    }
}

@Composable
private fun SpacerWithHeight(
    space: Int = 12
) {
    Spacer(
        modifier = Modifier.height(space.dp)
    )
}