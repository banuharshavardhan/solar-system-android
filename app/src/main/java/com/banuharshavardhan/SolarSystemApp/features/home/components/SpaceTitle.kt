package com.banuharshavardhan.SolarSystemApp.features.home.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.TextUnit

@Composable
fun SpaceTitle(
    text: String,
    color: Color,
    fontSize: TextUnit
) {
    Text(
        text = text,
        color = color,
        fontSize = fontSize
    )
}