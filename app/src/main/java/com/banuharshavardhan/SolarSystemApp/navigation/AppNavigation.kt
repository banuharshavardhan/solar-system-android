package com.banuharshavardhan.SolarSystemApp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.banuharshavardhan.SolarSystemApp.HomeScreen
import com.banuharshavardhan.SolarSystemApp.features.planetdetail.PlanetDetailScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Destinations.HOME
    ) {
        composable(
        route = Destinations.HOME
        ) {
            HomeScreen(
                navController = navController
            )
        }
        composable(
            route = Destinations.PLANET_DETAILS
        ) { backStackEntry ->
            val planetName = backStackEntry.arguments?.getString("planetName") ?: ""
            PlanetDetailScreen(
                planetName,
                navController
            )
        }
    }
}