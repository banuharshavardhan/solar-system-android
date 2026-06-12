package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

@Composable
fun PlanetGridCell(
    planet: Planet,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        PlanetScene(
            planet = planet,
        )
        Text(
            text = planet.name,
            color = Color.White
        )
    }
}