package com.banuharshavardhan.SolarSystemApp.features.home.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.banuharshavardhan.SolarSystemApp.features.home.models.Planet

@Composable
fun PlanetImage(
    planet: Planet,
    onClick: () -> Unit
) {
    Image(
        painter = painterResource(planet.imageRes),
        contentDescription = planet.name,
        modifier = Modifier
            .size(120.dp)
            .clip(CircleShape)
            .border(
                width = 2.dp,
                color = planet.borderColor,
                shape = CircleShape
            )
            .clickable {
                onClick()
            }
    )
}