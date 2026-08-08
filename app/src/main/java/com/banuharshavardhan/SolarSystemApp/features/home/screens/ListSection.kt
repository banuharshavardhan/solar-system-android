package com.banuharshavardhan.SolarSystemApp.features.home.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.banuharshavardhan.SolarSystemApp.core.components.PlanetListCell
import com.banuharshavardhan.SolarSystemApp.core.data.PlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.core.data.Planets

@Composable
fun ListSection(
    navController: NavController,
    resources: PlanetSceneResources
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Planets.all.forEach { planet ->
            PlanetListCell(
                resources = resources,
                planet = planet,
                planetSize = 150.dp,
                navController = navController,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}