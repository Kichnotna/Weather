package com.example.weather.ui.screen.data

data class DailyForecastState(
    val forecast: String,
    val date: String,
    val degree: String
)

val DailyForecastData = DailyForecastState(
    forecast = "Солнечно",
    date = "Понедельник, 29 Апреля",
    degree = "11"
)