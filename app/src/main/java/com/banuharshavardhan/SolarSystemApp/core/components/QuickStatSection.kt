package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

@Composable
fun QuickStatSection(
    planet: Planet
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            QuickStatCard(
                modifier = Modifier.weight(1f),
                value = "${planet.orbitalSpeedKmPerSecond} km/s",
                label = "Speed"
            )
            QuickStatCard(
                modifier = Modifier.weight(1f),
                value = "${planet.distanceFromSunMillionKm} million km",
                label = "Distance"
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            QuickStatCard(
                modifier = Modifier.weight(1f),
                value = "${planet.gravity}",
                label = "Gravity"
            )
            QuickStatCard(
                modifier = Modifier.weight(1f),
                value = "${planet.moonCount}",
                label = "Moons"
            )
        }
    }
}