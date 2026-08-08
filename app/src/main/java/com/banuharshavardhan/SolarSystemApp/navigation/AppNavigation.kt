package com.banuharshavardhan.SolarSystemApp.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.banuharshavardhan.SolarSystemApp.HomeScreen
import com.banuharshavardhan.SolarSystemApp.core.data.rememberPlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.features.planetdetail.PlanetDetailScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()
    val resources = rememberPlanetSceneResources()
    NavHost(
        navController = navController,
        startDestination = Destinations.HOME
    ) {
        composable(
            route = Destinations.HOME
        ) {
            HomeScreen(
                navController = navController,
                resources = resources
            )
        }
        composable(
            route = Destinations.PLANET_DETAILS,
            enterTransition = {
                EnterTransition.None
            },
            exitTransition = {
                ExitTransition.None
            },
            popEnterTransition = {
                EnterTransition.None
            },
            popExitTransition = {
                ExitTransition.None
            }
        ) { backStackEntry ->
            val planetName = backStackEntry.arguments?.getString("planetName") ?: ""
            PlanetDetailScreen(
                navController,
                resources,
                planetName
            )
        }
    }
}