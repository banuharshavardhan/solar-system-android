package com.banuharshavardhan.SolarSystemApp.core.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import com.banuharshavardhan.SolarSystemApp.R
import com.banuharshavardhan.SolarSystemApp.core.data.PlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.core.models.Planet
import com.google.android.filament.IndexBuffer
import com.google.android.filament.RenderableManager
import com.google.android.filament.VertexBuffer
import io.github.sceneview.geometries.Sphere
import io.github.sceneview.math.Position
import io.github.sceneview.math.Rotation
import io.github.sceneview.node.MeshNode
import io.github.sceneview.node.Node
import io.github.sceneview.node.SphereNode
import io.github.sceneview.texture.ImageTexture
import java.nio.FloatBuffer
import java.nio.ShortBuffer


@Composable
fun rememberSunNode(
    resources: PlanetSceneResources,
    radius: Float,
    position: Position
): SphereNode {

    val context = LocalContext.current

    val texture = remember(resources.engine) {
        ImageTexture.Builder()
            .bitmap(
                context = context,
                drawableResId = R.drawable.sun_surface_texture
            )
            .build(resources.engine)
    }

    val materialInstance = remember(resources.materialLoader, texture) {
        resources.materialLoader.createTextureInstance(texture)
    }

    val geometry = remember(resources.engine, radius) {
        Sphere.Builder()
            .radius(radius)
            .build(resources.engine)
    }

    return remember(
        resources.engine,
        geometry,
        materialInstance,
        position
    ) {
        SphereNode(
            engine = resources.engine,
            geometry = geometry,
            materialInstance = materialInstance
        ).apply {
            this.position = position
        }
    }
}

@Composable
fun rememberPlanetNode(
    resources: PlanetSceneResources,
    planet: Planet
): SphereNode {

    val context = LocalContext.current

    val texture = remember(resources.engine, planet.textureRes) {
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

    val geometry = remember(resources.engine, planet.spaceRadius) {
        Sphere.Builder()
            .radius(planet.spaceRadius)
            .build(resources.engine)
    }

    val angle = Math.toRadians(
        planet.spaceOrbitStartAngle.toDouble()
    )

    return remember(
        resources.engine,
        geometry,
        materialInstance,
        planet.spaceOrbitRadius,
        planet.selfRotationSpeed
    ) {
        SphereNode(
            engine = resources.engine,
            geometry = geometry,
            materialInstance = materialInstance
        ).apply {

            position = Position(
                x = kotlin.math.cos(angle).toFloat() * planet.spaceOrbitRadius,
                y = 0f,
                z = kotlin.math.sin(angle).toFloat() * planet.spaceOrbitRadius
            )

            var previousTimeNanos = 0L
            var rotationAngle = 0f

            onFrame = { frameTimeNanos ->

                if (previousTimeNanos == 0L) {
                    previousTimeNanos = frameTimeNanos
                } else {

                    val deltaSeconds =
                        (frameTimeNanos - previousTimeNanos) / 1_000_000_000f

                    previousTimeNanos = frameTimeNanos

                    rotationAngle +=
                        planet.selfRotationSpeed * deltaSeconds * 30f

                    rotation = Rotation(
                        x = 0f,
                        y = rotationAngle,
                        z = 0f
                    )
                }
            }
        }
    }
}

@Composable
fun rememberPlanetOrbitNode(
    resources: PlanetSceneResources,
    planet: Planet
): Node {

    val planetNode = rememberPlanetNode(
        resources = resources,
        planet = planet
    )

    return remember(
        resources.engine,
        planet,
        planetNode
    ) {

        var previousTimeNanos = 0L
        var orbitAngle = 0f

        Node(
            engine = resources.engine
        ).apply {

            addChildNode(planetNode)

            onFrame = { frameTimeNanos ->

                if (previousTimeNanos == 0L) {
                    previousTimeNanos = frameTimeNanos
                } else {

                    val deltaSeconds =
                        (frameTimeNanos - previousTimeNanos) / 1_000_000_000f

                    previousTimeNanos = frameTimeNanos

                    orbitAngle +=
                        planet.spaceOrbitSpeed * deltaSeconds * 30f

                    rotation = Rotation(
                        x = 0f,
                        y = orbitAngle,
                        z = 0f
                    )
                }
            }
        }
    }
}