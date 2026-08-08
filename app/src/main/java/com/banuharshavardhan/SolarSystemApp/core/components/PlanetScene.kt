package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.banuharshavardhan.SolarSystemApp.core.data.PlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.core.models.Planet
import dev.romainguy.kotlin.math.Float3
import dev.romainguy.kotlin.math.Quaternion

import io.github.sceneview.Scene
import io.github.sceneview.math.Position
import io.github.sceneview.node.SphereNode
import io.github.sceneview.rememberCameraManipulator
import io.github.sceneview.rememberMainLightNode
import io.github.sceneview.texture.ImageTexture

@Composable
fun PlanetScene(
    resources: PlanetSceneResources,
    planet: Planet,
    modifier: Modifier = Modifier
) {
    val context = LocalContext.current
    val mainLightNode = rememberMainLightNode(resources.engine)
    val cameraManipulator = rememberCameraManipulator()

    val texture = remember(resources.engine) {
        ImageTexture.Builder()
            .bitmap(
                context = context,
                drawableResId = planet.textureRes
            )
            .build(resources.engine)
    }
    val materialInstance = remember(resources.materialLoader, texture) {
        resources.materialLoader.createTextureInstance(texture)
    }

    val sphereNode = remember(resources.engine, materialInstance) {
        SphereNode(
            engine = resources.engine,
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
        modifier = modifier,
        engine = resources.engine,
        environment = resources.environment,
        mainLightNode = mainLightNode,
        cameraManipulator = cameraManipulator,
        childNodes = listOf(sphereNode),
        isOpaque = true
    )
}