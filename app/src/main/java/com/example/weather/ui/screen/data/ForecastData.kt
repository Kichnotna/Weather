package com.example.weather.ui.screen.data

import androidx.annotation.DrawableRes
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import com.example.weather.R

data class ForecastItem(
    @DrawableRes val image: Int,
    val dayOfWeek: String,
    val date: String,
    val temperature: String,
    val airQuality: String,
    val airQualityIndicatorColorHex: String,
    var isSelected: MutableState<Boolean> = mutableStateOf(false)
)

val ForecastData = listOf(
    ForecastItem(
        image = R.drawable.img_cloudy,
        dayOfWeek = "Пн",
        date = "28 Апр",
        temperature = "9°",
        airQuality = "180",
        airQualityIndicatorColorHex = "#ff7676"
    ),
    ForecastItem(
        image = R.drawable.img_moon_stars,
        dayOfWeek = "Вт",
        date = "29 Апр",
        temperature = "11°",
        airQuality = "142",
        airQualityIndicatorColorHex = "#ff7676",
        isSelected = mutableStateOf(true)
    ),
    ForecastItem(
        image = R.drawable.img_thunder,
        dayOfWeek = "Ср",
        date = "30 Апр",
        temperature = "15°",
        airQuality = "65",
        airQualityIndicatorColorHex = "#2dbe8d"
    ),
    ForecastItem(
        image = R.drawable.img_clouds,
        dayOfWeek = "Чт",
        date = "1 Мая",
        temperature = "20°",
        airQuality = "73",
        airQualityIndicatorColorHex = "#f9cf5f"
    ),
    ForecastItem(
        image = R.drawable.img_sun,
        dayOfWeek = "Пт",
        date = "2 Мая",
        temperature = "22°",
        airQuality = "111",
        airQualityIndicatorColorHex = "#ff7676"
    ),
    ForecastItem(
        image = R.drawable.img_rain,
        dayOfWeek = "Сб",
        date = "3 Мая",
        temperature = "18°",
        airQuality = "81",
        airQualityIndicatorColorHex = "#f9cf5f"
    ),
    ForecastItem(
        image = R.drawable.img_thunder,
        dayOfWeek = "Вс",
        date = "4 Мая",
        temperature = "21°",
        airQuality = "13",
        airQualityIndicatorColorHex = "#2dbe8d"
    )
)