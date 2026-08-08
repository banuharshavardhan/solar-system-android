package com.banuharshavardhan.SolarSystemApp.features.home.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.banuharshavardhan.SolarSystemApp.core.components.PlanetGridCell
import com.banuharshavardhan.SolarSystemApp.core.data.PlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.core.data.Planets
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

@Composable
fun GridSection(
    resources: PlanetSceneResources,
    onClick: (Planet) -> Unit
) {
    BoxWithConstraints {
        val spacing = 16.dp
        val cellWidth = (maxWidth - spacing) / 2
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(spacing)
        ) {
            Planets.all.chunked(2).forEach { row ->
                Row(
                    horizontalArrangement = Arrangement.spacedBy(spacing)
                ) {
                    row.forEach { planet ->
                        PlanetGridCell(
                            resources = resources,
                            planet = planet,
                            planetSize = cellWidth,
                            modifier = Modifier
                                .width(cellWidth)
                                .clickable {
                                    onClick(planet)
                                }
                        )
                    }
                }
            }
        }
    }
}