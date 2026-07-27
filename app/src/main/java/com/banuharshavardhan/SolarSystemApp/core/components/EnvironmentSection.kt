package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

@Composable
fun EnvironmentSection(
    planet: Planet
) {
    Column {
        SectionHeader(
            title = "Environment"
        )
        InfoRow(
            "Distance",
            "${planet.distanceFromSunMillionKm} Million km"
        )

        InfoRow(
            "Day Length",
            "${planet.dayLengthHours} Hours"
        )

        InfoRow(
            "Year Length",
            "${planet.yearLengthDays} Days"
        )
    }
}