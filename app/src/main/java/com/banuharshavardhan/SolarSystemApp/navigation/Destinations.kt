package com.banuharshavardhan.SolarSystemApp.navigation

object Destinations {
    const val HOME = "home"
    const val PLANET_DETAILS = "planet_details/{planetName}"

    fun planetDetails(planetName: String): String {
        return "planet_details/$planetName"
    }
}