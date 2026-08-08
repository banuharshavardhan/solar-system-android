package com.banuharshavardhan.SolarSystemApp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.banuharshavardhan.SolarSystemApp.core.data.PlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.features.home.components.SegmentedControl
import com.banuharshavardhan.SolarSystemApp.features.home.components.SpaceTitle
import com.banuharshavardhan.SolarSystemApp.features.home.enums.HomeSection
import com.banuharshavardhan.SolarSystemApp.features.home.screens.GridSection
import com.banuharshavardhan.SolarSystemApp.features.home.screens.ListSection
import com.banuharshavardhan.SolarSystemApp.features.home.screens.SpaceSection


@Composable
fun HomeScreen(
    navController: NavController,
    resources: PlanetSceneResources
) {
    var selectedSegment by remember {
        mutableStateOf(HomeSection.GRID)
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
                    HomeSection.GRID -> GridSection(
                        navController,
                        resources
                    )
                    HomeSection.SPACE -> SpaceSection()
                    HomeSection.LIST -> ListSection(
                        navController,
                        resources
                    )
                }
        }
    }
}