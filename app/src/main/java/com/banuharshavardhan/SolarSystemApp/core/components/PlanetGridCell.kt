package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

@Composable
fun PlanetGridCell(
    planet: Planet,
    planetSize: Dp,
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White.copy(alpha = 0.05f))
    ) {
        Column(
            modifier = modifier
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            PlanetScene(
                planet = planet,
                modifier = Modifier
                    .size(planetSize)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = planet.name,
                    color = Color.White
                )
                Text(
                    text = "${planet.orbitalSpeedKmPerSecond} km/s",
                    color = Color.Gray
                )
                Text(
                    text = "${planet.distanceFromSunMillionKm} million km",
                    color = Color.Gray
                )
            }
        }
    }
}