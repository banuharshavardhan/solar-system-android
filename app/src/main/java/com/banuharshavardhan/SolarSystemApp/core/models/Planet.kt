package com.banuharshavardhan.SolarSystemApp.core.models

import io.github.sceneview.math.Position

data class Planet(
    val name: String,
    val description: String,
    val textureRes: Int,
    val selfRotationSpeed: Float,

    val orbitalSpeedKmPerSecond: Double,
    val distanceFromSunMillionKm: Double,
    val radiusKm: Double,
    val gravity: Double,

    val mass: String,
    val volume: String,
    val surfaceArea: String,

    val dayLengthHours: Double,
    val yearLengthDays: Double,
    val moonCount: Int,

    val discoveredBy: String,
    val discoveryYear: String,

    val planetType: String,
    val atmosphere: String,

    val spaceRadius: Float,
    val spaceOrbitRadius: Float,
    val spaceOrbitSpeed: Float,
    val spaceOrbitStartAngle: Float,
)