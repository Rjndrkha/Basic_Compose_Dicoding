package com.dicoding.rjndrkha.hellojetpackcompose.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = Navy,
    primaryVariant = Purple700,
    secondary = Teal200,
    onPrimary = Chartreuse
)

private val LightColorPalette = lightColors(
    primary = LightBlue,
    primaryVariant = Purple700,
    secondary = Teal200,
    onPrimary = Navy,

)

@Composable
fun HelloJetpackComposeTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}