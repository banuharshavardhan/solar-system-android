package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

@Composable
fun PhysicalPropertiesSection(
    planet: Planet
) {
    Column {

            SectionHeader(
                title = "Physical Properties"
            )

            InfoRow(
                label = "Mass",
                value = planet.mass
            )

            InfoRow(
                label = "Radius",
                value = "${planet.radiusKm} km"
            )

            InfoRow(
                label = "Gravity",
                value = "${planet.gravity}"
            )

            InfoRow(
                label = "Volume",
                value = planet.volume
            )

            InfoRow(
                label = "Surface Area",
                value = planet.surfaceArea
            )

        }
}