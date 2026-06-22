package com.banuharshavardhan.SolarSystemApp.features.home.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.banuharshavardhan.SolarSystemApp.core.components.PlanetListCell
import com.banuharshavardhan.SolarSystemApp.core.data.Planets

@Composable
fun ListSection() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(16.dp)
    ) {
        items(
            items = Planets.all,
            key = { it.name }
        ) { planet ->
            PlanetListCell(
                planet = planet,
                planetSize = 150.dp,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}