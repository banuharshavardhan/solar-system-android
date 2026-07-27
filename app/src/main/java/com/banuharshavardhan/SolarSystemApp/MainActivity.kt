package com.banuharshavardhan.SolarSystemApp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.banuharshavardhan.SolarSystemApp.navigation.AppNavigation
import com.banuharshavardhan.SolarSystemApp.ui.theme.SolarSystemAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SolarSystemAppTheme {
                AppNavigation()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SolarSystemAppTheme {
        AppNavigation()
    }
}