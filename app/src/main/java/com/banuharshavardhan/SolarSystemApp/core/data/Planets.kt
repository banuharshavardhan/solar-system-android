package com.banuharshavardhan.SolarSystemApp.core.data

import com.banuharshavardhan.SolarSystemApp.core.models.Planet
import com.banuharshavardhan.SolarSystemApp.R

object Planets {
    val mercury = Planet(
        name = "Mercury",
        textureRes = R.drawable.mercury_surface_texture
    )
    val venus = Planet(
        name = "Venus",
        textureRes = R.drawable.venus_surface_texture
    )
    val earth = Planet(
        name = "Earth",
        textureRes = R.drawable.earth_surface_day_texture
    )
    val mars = Planet(
        name = "Mars",
        textureRes = R.drawable.mars_surface_texture
    )
    val jupiter = Planet(
        name = "Jupiter",
        textureRes = R.drawable.jupiter_surface_texture
    )
    val saturn = Planet(
        name = "Saturn",
        textureRes = R.drawable.saturn_surface_texture
    )
    val uranus = Planet(
        name = "Unranus",
        textureRes = R.drawable.uranus_surface_texture
    )
    val neptune = Planet(
        name = "Neptune",
        textureRes = R.drawable.neptune_surface_texture
    )
}