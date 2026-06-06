package com.banuharshavardhan.SolarSystemApp.features.home.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.banuharshavardhan.SolarSystemApp.core.components.PlanetEarth
import com.banuharshavardhan.SolarSystemApp.core.components.PlanetScene
import com.banuharshavardhan.SolarSystemApp.core.data.Planets

@Composable
fun GridSection() {
    Column {
        PlanetScene(
            planet = Planets.earth
        )
    }
}