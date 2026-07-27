package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

@Composable
fun DiscoverySection(
    planet: Planet
) {
    Column {
        SectionHeader(
            title = "Discovery"
        )
        InfoRow(
            label = "Discovered By",
            value = planet.discoveredBy
        )
        InfoRow(
            label = "Discovery Year",
            value = planet.discoveryYear
        )
        InfoRow(
            label = "Planet Type",
            value = planet.planetType
        )
    }
}