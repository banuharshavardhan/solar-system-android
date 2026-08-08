package com.banuharshavardhan.SolarSystemApp.core.data

import androidx.compose.runtime.Composable
import com.google.android.filament.Engine
import com.google.android.filament.Texture
import io.github.sceneview.environment.Environment
import io.github.sceneview.loaders.MaterialLoader
import io.github.sceneview.rememberEngine
import io.github.sceneview.rememberEnvironment
import io.github.sceneview.rememberEnvironmentLoader
import io.github.sceneview.rememberMaterialLoader

data class PlanetSceneResources(
    val engine: Engine,
    val materialLoader: MaterialLoader,
    val environment: Environment
) {
    val textures = mutableMapOf<Int, Texture>()
}

@Composable
fun rememberPlanetSceneResources(): PlanetSceneResources {
    val engine = rememberEngine()
    val materialLoader = rememberMaterialLoader(engine)
    val environmentLoader = rememberEnvironmentLoader(engine)
    val environment = rememberEnvironment(environmentLoader)
    return PlanetSceneResources(
        engine,
        materialLoader,
        environment
    )
}