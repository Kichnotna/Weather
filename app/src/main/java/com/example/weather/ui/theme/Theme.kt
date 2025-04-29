package com.example.weather.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val AppColorTheme = darkColorScheme(
    primary = LightBlue,
    secondary = Blue,
    tertiary = DarkBlue
)

@Composable
fun AppTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        colorScheme = AppColorTheme,
        typography = Typography,
        content = content
    )
}