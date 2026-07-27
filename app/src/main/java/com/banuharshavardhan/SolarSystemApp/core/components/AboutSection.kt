package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.banuharshavardhan.SolarSystemApp.core.models.Planet

@Composable
fun AboutSection(
    planet: Planet
) {
    Column {
        SectionHeader(
            title = "About"
        )
        Text(
            text = planet.description,
            color = Color.LightGray,
            fontSize = 16.sp,
            lineHeight = 28.sp,
            modifier = Modifier.padding(top = 12.dp)
        )
    }
}