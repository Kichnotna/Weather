package com.example.weather.ui.screen.data

import androidx.annotation.DrawableRes
import androidx.compose.runtime.MutableIntState
import androidx.compose.runtime.mutableIntStateOf
import com.example.weather.R

data class AirQualityItem(
    @DrawableRes val icon: Int,
    val title: String,
    val value: MutableIntState,
    val unit: String = ""
)

val AirQualityData = listOf(
    AirQualityItem(
        title = "Ощущается",
        value = mutableIntStateOf(9),
        icon = R.drawable.ic_real_feel
    ),
    AirQualityItem(
        title = "Ветер",
        value = mutableIntStateOf(12),
        unit = "км/ч",
        icon = R.drawable.ic_wind_qality,
    ),
    AirQualityItem(
        title = "Дождь",
        value = mutableIntStateOf(22),
        unit = "%",
        icon = R.drawable.ic_rain_chance
    ),
    AirQualityItem(
        title = "UV Индекс",
        value = mutableIntStateOf(5),
        icon = R.drawable.ic_uv_index
    )
)