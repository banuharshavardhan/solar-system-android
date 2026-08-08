package com.banuharshavardhan.SolarSystemApp.features.planetdetail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.banuharshavardhan.SolarSystemApp.core.components.AboutSection
import com.banuharshavardhan.SolarSystemApp.core.components.DiscoverySection
import com.banuharshavardhan.SolarSystemApp.core.components.EnvironmentSection
import com.banuharshavardhan.SolarSystemApp.core.components.HeroSection
import com.banuharshavardhan.SolarSystemApp.core.components.PhysicalPropertiesSection
import com.banuharshavardhan.SolarSystemApp.core.components.QuickStatSection
import com.banuharshavardhan.SolarSystemApp.core.data.PlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.core.data.Planets

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlanetDetailScreen(
    navController: NavController,
    resources: PlanetSceneResources,
    planetName: String,
) {
    val planet = Planets.all.first {
        it.name == planetName
    }
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        planetName,
                        color = Color.White
                    )
                },
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }
                    ) {
                        Icon(
                            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                            contentDescription = "Back",
                            tint = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Black,
                    titleContentColor = Color.White,
                    navigationIconContentColor = Color.White
                )
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .background(Color.Black),
            horizontalAlignment = Alignment.CenterHorizontally,
            contentPadding = PaddingValues(
                horizontal = 20.dp,
                vertical = 24.dp
            ),
            verticalArrangement = Arrangement.spacedBy(24.dp)
        ) {
            item {
                HeroSection(
                    resources,
                    planet
                )
            }
            item {
                QuickStatSection(planet)
            }
            item {
                PhysicalPropertiesSection(planet)
            }
            item {
                EnvironmentSection(planet)
            }
            item {
                DiscoverySection(planet)
            }
            item {
                AboutSection(planet)
            }
        }
    }
}