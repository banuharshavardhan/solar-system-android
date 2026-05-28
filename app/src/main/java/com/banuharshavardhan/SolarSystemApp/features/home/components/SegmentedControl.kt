package com.banuharshavardhan.SolarSystemApp.features.home.components

import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.banuharshavardhan.SolarSystemApp.features.home.enums.HomeSection
import java.nio.file.WatchEvent

@Composable
fun SegmentedControl(selectedSegment: HomeSection, onSegmentSelection: (HomeSection) -> Unit) {
    Row(
        modifier = Modifier
            .height(40.dp)
            .fillMaxWidth()
            .background(
                color = Color.DarkGray,
                shape = RoundedCornerShape(20.dp)
            ),
        horizontalArrangement = Arrangement.Absolute.SpaceEvenly
    ) {
        HomeSection.entries.forEach {
            Segment(
                it.title,
                selected = selectedSegment == it,
                modifier = Modifier.weight(1f)
            ) {
                onSegmentSelection(it)
            }
        }
    }
}