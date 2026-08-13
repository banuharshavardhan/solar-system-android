package com.banuharshavardhan.SolarSystemApp.core.data

import com.banuharshavardhan.SolarSystemApp.R
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

object Planets {

    val mercury = Planet(
        name = "Mercury",
        description = "Mercury is the closest planet to the Sun and the smallest planet in the Solar System. It has a rocky surface covered with craters and experiences extreme temperature changes between day and night.",
        textureRes = R.drawable.mercury_surface_texture,
        selfRotationSpeed = 0.017f,
        orbitalSpeedKmPerSecond = 47.4,
        distanceFromSunMillionKm = 57.9,
        radiusKm = 2439.7,
        gravity = 3.7,
        mass = "3.301 × 10²³ kg",
        volume = "60.83 billion km³",
        surfaceArea = "74.8 million km²",
        dayLengthHours = 1407.6,
        yearLengthDays = 88.0,
        moonCount = 0,
        discoveredBy = "Known since ancient times",
        discoveryYear = "Prehistory",
        planetType = "Terrestrial Planet",
        atmosphere = "Thin exosphere of Oxygen, Sodium, Hydrogen, Helium and Potassium",
        spaceRadius = 0.18f,
        spaceOrbitRadius = 2.0f,
        spaceOrbitSpeed = 1.60f,
        spaceOrbitStartAngle = 20f
    )

    val venus = Planet(
        name = "Venus",
        description = "Venus is the second planet from the Sun and is often called Earth's sister planet because of its similar size. Its thick atmosphere traps heat, making it the hottest planet in the Solar System.",
        textureRes = R.drawable.venus_surface_texture,
        selfRotationSpeed = -0.004f,
        orbitalSpeedKmPerSecond = 35.0,
        distanceFromSunMillionKm = 108.2,
        radiusKm = 6051.8,
        gravity = 8.87,
        mass = "4.867 × 10²⁴ kg",
        volume = "928.4 billion km³",
        surfaceArea = "460.2 million km²",
        dayLengthHours = 5832.5,
        yearLengthDays = 224.7,
        moonCount = 0,
        discoveredBy = "Known since ancient times",
        discoveryYear = "Prehistory",
        planetType = "Terrestrial Planet",
        atmosphere = "Carbon Dioxide (96.5%), Nitrogen (3.5%)",
        spaceRadius = 0.30f,
        spaceOrbitRadius = 2.8f,
        spaceOrbitSpeed = 1.25f,
        spaceOrbitStartAngle = 145f
    )

    val earth = Planet(
        name = "Earth",
        description = "Earth is the third planet from the Sun and the only known world to support life. About 71% of its surface is covered by water, and its atmosphere provides the conditions necessary for living organisms.",
        textureRes = R.drawable.earth_surface_day_texture,
        selfRotationSpeed = 1.0f,
        orbitalSpeedKmPerSecond = 29.8,
        distanceFromSunMillionKm = 149.6,
        radiusKm = 6371.0,
        gravity = 9.81,
        mass = "5.972 × 10²⁴ kg",
        volume = "1.083 trillion km³",
        surfaceArea = "510.1 million km²",
        dayLengthHours = 24.0,
        yearLengthDays = 365.25,
        moonCount = 1,
        discoveredBy = "Known since ancient times",
        discoveryYear = "Prehistory",
        planetType = "Terrestrial Planet",
        atmosphere = "Nitrogen (78%), Oxygen (21%), Argon, Carbon Dioxide",
        spaceRadius = 0.32f,
        spaceOrbitRadius = 3.7f,
        spaceOrbitSpeed = 1.00f,
        spaceOrbitStartAngle = 260f
    )

    val mars = Planet(
        name = "Mars",
        description = "Mars is the fourth planet from the Sun and is known as the Red Planet due to iron-rich dust on its surface. It has the largest volcano and canyon in the Solar System and is a major target for future human exploration.",
        textureRes = R.drawable.mars_surface_texture,
        selfRotationSpeed = 0.97f,
        orbitalSpeedKmPerSecond = 24.1,
        distanceFromSunMillionKm = 227.9,
        radiusKm = 3389.5,
        gravity = 3.71,
        mass = "6.417 × 10²³ kg",
        volume = "163.2 billion km³",
        surfaceArea = "144.8 million km²",
        dayLengthHours = 24.6,
        yearLengthDays = 687.0,
        moonCount = 2,
        discoveredBy = "Known since ancient times",
        discoveryYear = "Prehistory",
        planetType = "Terrestrial Planet",
        atmosphere = "Carbon Dioxide (95%), Nitrogen, Argon",
        spaceRadius = 0.24f,
        spaceOrbitRadius = 4.6f,
        spaceOrbitSpeed = 0.80f,
        spaceOrbitStartAngle = 65f
    )

    val jupiter = Planet(
        name = "Jupiter",
        description = "Jupiter is the largest planet in the Solar System. This gas giant is famous for its Great Red Spot, a massive storm that has been raging for centuries, and it has dozens of known moons.",
        textureRes = R.drawable.jupiter_surface_texture,
        selfRotationSpeed = 2.41f,
        orbitalSpeedKmPerSecond = 13.1,
        distanceFromSunMillionKm = 778.6,
        radiusKm = 69911.0,
        gravity = 24.79,
        mass = "1.898 × 10²⁷ kg",
        volume = "1.431 quadrillion km³",
        surfaceArea = "61.42 billion km²",
        dayLengthHours = 9.9,
        yearLengthDays = 4332.6,
        moonCount = 95,
        discoveredBy = "Known since ancient times",
        discoveryYear = "Prehistory",
        planetType = "Gas Giant",
        atmosphere = "Hydrogen (90%), Helium (10%)",
        spaceRadius = 0.90f,
        spaceOrbitRadius = 6.0f,
        spaceOrbitSpeed = 0.45f,
        spaceOrbitStartAngle = 190f
    )

    val saturn = Planet(
        name = "Saturn",
        description = "Saturn is the sixth planet from the Sun and is best known for its spectacular ring system. It is a gas giant composed mainly of hydrogen and helium and has many fascinating moons.",
        textureRes = R.drawable.saturn_surface_texture,
        selfRotationSpeed = 2.24f,
        orbitalSpeedKmPerSecond = 9.7,
        distanceFromSunMillionKm = 1433.5,
        radiusKm = 58232.0,
        gravity = 10.44,
        mass = "5.683 × 10²⁶ kg",
        volume = "827.1 trillion km³",
        surfaceArea = "42.7 billion km²",
        dayLengthHours = 10.7,
        yearLengthDays = 10759.0,
        moonCount = 146,
        discoveredBy = "Known since ancient times",
        discoveryYear = "Prehistory",
        planetType = "Gas Giant",
        atmosphere = "Hydrogen (96%), Helium (3%)",
        spaceRadius = 0.75f,
        spaceOrbitRadius = 7.4f,
        spaceOrbitSpeed = 0.32f,
        spaceOrbitStartAngle = 330f
    )

    val uranus = Planet(
        name = "Uranus",
        description = "Uranus is an ice giant that rotates on its side, giving it one of the most unusual orientations of any planet. Its blue-green color comes from methane in its atmosphere.",
        textureRes = R.drawable.uranus_surface_texture,
        selfRotationSpeed = -1.39f,
        orbitalSpeedKmPerSecond = 6.8,
        distanceFromSunMillionKm = 2872.5,
        radiusKm = 25362.0,
        gravity = 8.69,
        mass = "8.681 × 10²⁵ kg",
        volume = "68.33 trillion km³",
        surfaceArea = "8.116 billion km²",
        dayLengthHours = 17.2,
        yearLengthDays = 30688.5,
        moonCount = 28,
        discoveredBy = "William Herschel",
        discoveryYear = "1781",
        planetType = "Ice Giant",
        atmosphere = "Hydrogen, Helium, Methane",
        spaceRadius = 0.55f,
        spaceOrbitRadius = 8.7f,
        spaceOrbitSpeed = 0.22f,
        spaceOrbitStartAngle = 105f
    )

    val neptune = Planet(
        name = "Neptune",
        description = "Neptune is the eighth and farthest known planet from the Sun. This deep-blue ice giant is famous for its powerful winds, which are among the fastest recorded in the Solar System.",
        textureRes = R.drawable.neptune_surface_texture,
        selfRotationSpeed = 1.49f,
        orbitalSpeedKmPerSecond = 5.4,
        distanceFromSunMillionKm = 4495.1,
        radiusKm = 24622.0,
        gravity = 11.15,
        mass = "1.024 × 10²⁶ kg",
        volume = "62.54 trillion km³",
        surfaceArea = "7.619 billion km²",
        dayLengthHours = 16.1,
        yearLengthDays = 60182.0,
        moonCount = 16,
        discoveredBy = "Johann Galle",
        discoveryYear = "1846",
        planetType = "Ice Giant",
        atmosphere = "Hydrogen, Helium, Methane",
        spaceRadius = 0.52f,
        spaceOrbitRadius = 10.0f,
        spaceOrbitSpeed = 0.16f,
        spaceOrbitStartAngle = 220f
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