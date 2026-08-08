package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.banuharshavardhan.SolarSystemApp.core.data.PlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.core.models.Planet
import com.banuharshavardhan.SolarSystemApp.navigation.Destinations

@Composable
fun PlanetListCell(
    resources: PlanetSceneResources,
    planet: Planet,
    planetSize: Dp,
    navController: NavController,
    modifier: Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(20.dp))
            .background(Color.White.copy(alpha = 0.05f))
            .padding(16.dp)
            .clickable {
                navController.navigate(
                    Destinations.planetDetails(planet.name)
                )
            },
        verticalAlignment = Alignment.CenterVertically
    ) {
        PlanetScene(
            resources = resources,
            planet = planet,
            modifier = Modifier.size(planetSize)
        )

        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = planet.name,
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(6.dp))

            Text(
                text = planet.description,
                color = Color.LightGray,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                fontSize = 14.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "${planet.orbitalSpeedKmPerSecond} km/s",
                color = Color.Gray,
                fontSize = 13.sp
            )

            Text(
                text = "${planet.distanceFromSunMillionKm} million km",
                color = Color.Gray,
                fontSize = 13.sp
            )

        }

        Spacer(modifier = Modifier.width(12.dp))

        Image(
            painter = painterResource(android.R.drawable.arrow_down_float),
            contentDescription = null
        )
    }
}