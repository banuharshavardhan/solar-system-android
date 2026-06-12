package com.banuharshavardhan.SolarSystemApp.core.data

import com.banuharshavardhan.SolarSystemApp.core.models.Planet
import com.banuharshavardhan.SolarSystemApp.R

object Planets {
    val mercury = Planet(
        name = "Mercury",
        textureRes = R.drawable.mercury_surface_texture,
        selfRotationSpeed = 0.017f
    )
    val venus = Planet(
        name = "Venus",
        textureRes = R.drawable.venus_surface_texture,
        selfRotationSpeed = -0.004f
    )
    val earth = Planet(
        name = "Earth",
        textureRes = R.drawable.earth_surface_day_texture,
        selfRotationSpeed = 1.0f
    )
    val mars = Planet(
        name = "Mars",
        textureRes = R.drawable.mars_surface_texture,
        selfRotationSpeed = 0.97f
    )
    val jupiter = Planet(
        name = "Jupiter",
        textureRes = R.drawable.jupiter_surface_texture,
        selfRotationSpeed = 2.41f
    )
    val saturn = Planet(
        name = "Saturn",
        textureRes = R.drawable.saturn_surface_texture,
        selfRotationSpeed = 2.24f
    )
    val uranus = Planet(
        name = "Unranus",
        textureRes = R.drawable.uranus_surface_texture,
        selfRotationSpeed = -1.39f
    )
    val neptune = Planet(
        name = "Neptune",
        textureRes = R.drawable.neptune_surface_texture,
        selfRotationSpeed = 1.49f
    )
}