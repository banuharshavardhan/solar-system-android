package com.banuharshavardhan.SolarSystemApp.core.data

import com.banuharshavardhan.SolarSystemApp.core.models.Planet
import com.banuharshavardhan.SolarSystemApp.R

object Planets {
    val mercury = Planet(
        name = "Mercury",
        description =  "Mercury is the closest planet to the Sun and the smallest planet in the Solar System. It has a rocky surface covered with craters and experiences extreme temperature changes between day and night.",
        textureRes = R.drawable.mercury_surface_texture,
        selfRotationSpeed = 0.017f
    )
    val venus = Planet(
        name = "Venus",
        description = "Venus is the second planet from the Sun and is often called Earth's sister planet because of its similar size. Its thick atmosphere traps heat, making it the hottest planet in the Solar System.",
        textureRes = R.drawable.venus_surface_texture,
        selfRotationSpeed = -0.004f
    )
    val earth = Planet(
        name = "Earth",
        description = "Earth is the third planet from the Sun and the only known world to support life. About 71% of its surface is covered by water, and its atmosphere provides the conditions necessary for living organisms.",
        textureRes = R.drawable.earth_surface_day_texture,
        selfRotationSpeed = 1.0f
    )
    val mars = Planet(
        name = "Mars",
        description = "Mars is the fourth planet from the Sun and is known as the Red Planet due to iron-rich dust on its surface. It has the largest volcano and canyon in the Solar System and is a major target for future human exploration.",
        textureRes = R.drawable.mars_surface_texture,
        selfRotationSpeed = 0.97f
    )
    val jupiter = Planet(
        name = "Jupiter",
        description = "Jupiter is the largest planet in the Solar System. This gas giant is famous for its Great Red Spot, a massive storm that has been raging for centuries, and it has dozens of known moons.",
        textureRes = R.drawable.jupiter_surface_texture,
        selfRotationSpeed = 2.41f
    )
    val saturn = Planet(
        name = "Saturn",
        description = "Saturn is the sixth planet from the Sun and is best known for its spectacular ring system. It is a gas giant composed mainly of hydrogen and helium and has many fascinating moons.",
        textureRes = R.drawable.saturn_surface_texture,
        selfRotationSpeed = 2.24f
    )
    val uranus = Planet(
        name = "Uranus",
        description = "Uranus is an ice giant that rotates on its side, giving it one of the most unusual orientations of any planet. Its blue-green color comes from methane in its atmosphere.",
        textureRes = R.drawable.uranus_surface_texture,
        selfRotationSpeed = -1.39f
    )
    val neptune = Planet(
        name = "Neptune",
        description = "Neptune is the eighth and farthest known planet from the Sun. This deep-blue ice giant is famous for its powerful winds, which are among the fastest recorded in the Solar System.",
        textureRes = R.drawable.neptune_surface_texture,
        selfRotationSpeed = 1.49f
    )
    val all = listOf(
        mercury,
        venus,
        earth,
        mars,
        jupiter,
        saturn,
        uranus,
        neptune
    )
}