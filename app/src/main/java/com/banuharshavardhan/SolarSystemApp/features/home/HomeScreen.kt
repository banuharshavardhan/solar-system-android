package com.banuharshavardhan.SolarSystemApp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.runtime.withFrameNanos
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.banuharshavardhan.SolarSystemApp.core.data.PlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.core.models.Planet
import com.banuharshavardhan.SolarSystemApp.features.home.components.SegmentedControl
import com.banuharshavardhan.SolarSystemApp.features.home.components.SpaceTitle
import com.banuharshavardhan.SolarSystemApp.features.home.enums.HomeSection
import com.banuharshavardhan.SolarSystemApp.features.home.screens.GridSection
import com.banuharshavardhan.SolarSystemApp.features.home.screens.ListSection
import com.banuharshavardhan.SolarSystemApp.features.home.screens.SpaceSection
import com.banuharshavardhan.SolarSystemApp.navigation.Destinations


@Composable
fun HomeScreen(
    navController: NavController,
    resources: PlanetSceneResources
) {
    var isNavigatingToDetail by remember {
        mutableStateOf(false)
    }
    var selectedSegment by rememberSaveable() {
        mutableStateOf(HomeSection.GRID)
    }
    var planetToNavigate by remember {
        mutableStateOf<Planet?>(null)
    }

    LaunchedEffect(planetToNavigate) {
        val planet = planetToNavigate ?: return@LaunchedEffect
        withFrameNanos {  }
        navController.navigate(
            Destinations.planetDetails(
                planet.name
            )
        )
    }

    Scaffold() { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black)
                .padding(innerPadding),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SpaceTitle(
                text = "Solar System App",
                color = Color.White,
                fontSize = 24.sp
            )
            SegmentedControl(
                selectedSegment
            ) {
                selectedSegment = it
            }
            when (selectedSegment) {
                HomeSection.GRID -> {
                    if (!isNavigatingToDetail) {
                        GridSection(
                            resources,
                            onClick = {
                                isNavigatingToDetail = true
                                planetToNavigate = it
                            }
                        )
                    }
                }

                HomeSection.SPACE -> SpaceSection()
                HomeSection.LIST -> {
                    if (!isNavigatingToDetail) {
                        ListSection(
                            resources,
                            onClick = {
                                isNavigatingToDetail = true
                                planetToNavigate = it
                            }
                        )
                    }
                }
            }
        }
    }
}