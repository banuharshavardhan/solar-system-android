package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.banuharshavardhan.SolarSystemApp.core.data.PlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

@Composable
fun HeroSection(
    resources: PlanetSceneResources,
    planet: Planet
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        PlanetScene(
            resources,
            planet,
            modifier = Modifier.size(360.dp)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = planet.name,
            color = Color.White,
            fontSize = 32.sp
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = planet.description,
            color = Color.LightGray,
            fontSize = 16.sp
        )
    }
}