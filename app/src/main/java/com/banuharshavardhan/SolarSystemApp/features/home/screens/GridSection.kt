package com.banuharshavardhan.SolarSystemApp.features.home.screens

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import com.banuharshavardhan.SolarSystemApp.core.components.PlanetGridCell
import com.banuharshavardhan.SolarSystemApp.core.data.Planets

@Composable
fun GridSection() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        items(Planets.all) { planet ->
            PlanetGridCell(
                planet
            )
        }
    }
}