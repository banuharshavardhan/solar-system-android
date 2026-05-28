package com.banuharshavardhan.SolarSystemApp.features.home.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Segment(title: String, selected: Boolean, modifier: Modifier, onSelection: () -> Unit) {
    Button(
        onClick = {
            onSelection()
        },
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            contentColor = if (selected) {
                Color.Black
            } else {
                Color.White
            },
            containerColor = if (selected) {
                Color.White
            } else {
                Color.Transparent
            }
        )
    ) {
        Text(title)
    }
}
