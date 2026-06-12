package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.banuharshavardhan.SolarSystemApp.core.models.Planet
import dev.romainguy.kotlin.math.Float3
import dev.romainguy.kotlin.math.Quaternion

import io.github.sceneview.Scene
import io.github.sceneview.math.Position
import io.github.sceneview.node.SphereNode
import io.github.sceneview.rememberCameraManipulator
import io.github.sceneview.rememberEngine
import io.github.sceneview.rememberEnvironment
import io.github.sceneview.rememberEnvironmentLoader
import io.github.sceneview.rememberMainLightNode
import io.github.sceneview.rememberMaterialLoader
import io.github.sceneview.texture.ImageTexture

@Composable
fun PlanetScene(
    planet: Planet,
    modifier: Modifier = Modifier
) {
    val engine = rememberEngine()
    val context = LocalContext.current
    val materialLoader = rememberMaterialLoader(engine)
    val environmentLoader = rememberEnvironmentLoader(engine)
    val environment = rememberEnvironment(environmentLoader)
    val mainLightNode = rememberMainLightNode(engine)
    val cameraManipulator = rememberCameraManipulator()

    val texture = remember(engine) {
        ImageTexture.Builder()
            .bitmap(
                context = context,
                drawableResId = planet.textureRes
            )
            .build(engine)
    }
    val materialInstance = remember(materialLoader, texture) {
        materialLoader.createTextureInstance(texture)
    }

    val sphereNode = remember(engine, materialInstance) {
        SphereNode(
            engine = engine,
            radius = 1.0f,
            materialInstance = materialInstance
        ).apply {
            position = Position(0f, 0f, -3f)
            onFrame = {
                quaternion *= Quaternion.fromEuler(
                    Float3(0f, planet.selfRotationSpeed, 0f)
                )
            }
        }
    }

    Scene(
        modifier = modifier.size(250.dp),
        engine = engine,
        environment = environment,
        mainLightNode = mainLightNode,
        cameraManipulator = cameraManipulator,
        childNodes = listOf(sphereNode)
    )
}