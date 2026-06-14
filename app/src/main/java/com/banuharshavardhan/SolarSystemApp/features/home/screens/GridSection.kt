package com.banuharshavardhan.SolarSystemApp.features.home.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.banuharshavardhan.SolarSystemApp.core.components.PlanetGridCell
import com.banuharshavardhan.SolarSystemApp.core.data.Planets

@Composable
fun GridSection() {
    BoxWithConstraints {

        val spacing = 16.dp
        val cellWidth = (maxWidth - spacing) / 2

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(spacing),
            horizontalArrangement = Arrangement.spacedBy(spacing)
        ) {
            items(Planets.all) { planet ->
                PlanetGridCell(
                    planet = planet,
                    planetSize = cellWidth,
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
    }
}