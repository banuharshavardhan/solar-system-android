package com.banuharshavardhan.SolarSystemApp.core.data

import androidx.compose.runtime.Composable
import com.google.android.filament.Engine
import com.google.android.filament.Texture
import io.github.sceneview.environment.Environment
import io.github.sceneview.gesture.CameraGestureDetector
import io.github.sceneview.loaders.MaterialLoader
import io.github.sceneview.math.Position
import io.github.sceneview.node.CameraNode
import io.github.sceneview.rememberCameraManipulator
import io.github.sceneview.rememberCameraNode
import io.github.sceneview.rememberEngine
import io.github.sceneview.rememberEnvironment
import io.github.sceneview.rememberEnvironmentLoader
import io.github.sceneview.rememberMaterialLoader

data class PlanetSceneResources(
    val engine: Engine,
    val materialLoader: MaterialLoader,
    val environment: Environment,
    val cameraNode: CameraNode,
    val cameraManipulator: CameraGestureDetector.CameraManipulator
) {
    val textures = mutableMapOf<Int, Texture>()
}

@Composable
fun rememberPlanetSceneResources(): PlanetSceneResources {
    val engine = rememberEngine()
    val materialLoader = rememberMaterialLoader(engine)
    val environmentLoader = rememberEnvironmentLoader(engine)
    val environment = rememberEnvironment(environmentLoader)
    val cameraNode = rememberCameraNode(engine) {
        position = Position(0f, 0f, 20f)
    }
    val cameraManipulator = rememberCameraManipulator(
        orbitHomePosition = Position(0f, 0f, 20f),
        targetPosition = Position(0f, 0f, 0f)
    )
    return PlanetSceneResources(
        engine,
        materialLoader,
        environment,
        cameraNode,
        cameraManipulator
    )
}