package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.banuharshavardhan.SolarSystemApp.R
import io.github.sceneview.Scene
import io.github.sceneview.geometries.Sphere
import io.github.sceneview.material.setRoughness
import io.github.sceneview.math.Position
import io.github.sceneview.math.colorOf
import io.github.sceneview.node.SphereNode
import io.github.sceneview.rememberCameraManipulator
import io.github.sceneview.rememberEngine
import io.github.sceneview.rememberEnvironment
import io.github.sceneview.rememberEnvironmentLoader
import io.github.sceneview.rememberMainLightNode
import io.github.sceneview.rememberMaterialLoader

@Composable
fun PlanetEarth() {
    val context = LocalContext.current

    val engine = rememberEngine()
    val materialLoader = rememberMaterialLoader(engine)
    val environmentLoader = rememberEnvironmentLoader(engine)
    val environment = rememberEnvironment(environmentLoader)
    val mainLightNode = rememberMainLightNode(engine)
    val cameraManipulator = rememberCameraManipulator()

    val earthMaterial = remember(materialLoader) {
        materialLoader.createColorInstance(
            color = colorOf(1f, 1f, 1f, 1f),
            metallic = 0f,
            roughness = 0.9f,
            reflectance = 0.5f
        ).apply {
            setRoughness(0.9f)
        }
    }

    val sphereGeometry = remember(engine) {
        Sphere.Builder()
            .radius(1.0f)
            .center(Position(0f, 0f, 0f))
            .stacks(24)
            .slices(24)
            .build(engine)
    }

    val earthNode = remember(engine, sphereGeometry, earthMaterial) {
        SphereNode(
            engine = engine,
            geometry = sphereGeometry,
            materialInstance = earthMaterial
        ).apply {
            position = Position(0f, 0f, -4f)
        }
    }

    Scene(
        modifier = Modifier.fillMaxSize(),
        engine = engine,
        environment = environment,
        mainLightNode = mainLightNode,
        cameraManipulator = cameraManipulator,
        childNodes = listOf(earthNode)
    )
}