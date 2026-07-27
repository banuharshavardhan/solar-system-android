package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

@Composable
fun QuickStatSection(
    planet: Planet
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        userScrollEnabled = false
    ) {
        item {
            QuickStatCard(
                value = "${planet.orbitalSpeedKmPerSecond} km/s",
                label = "Speed"
            )
        }
        item {
            QuickStatCard(
                value = "${planet.distanceFromSunMillionKm} million km",
                label = "Distance"
            )
        }
        item {
            QuickStatCard(
                value = "${planet.gravity}",
                label = "Gravity"
            )
        }
        item {
            QuickStatCard(
                value = planet.moonCount.toString(),
                label = "Moons"
            )
        }
    }
}