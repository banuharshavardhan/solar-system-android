package com.banuharshavardhan.SolarSystemApp.features.home.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.banuharshavardhan.SolarSystemApp.core.components.rememberPlanetOrbitNode
import com.banuharshavardhan.SolarSystemApp.core.components.rememberSunNode
import com.banuharshavardhan.SolarSystemApp.core.data.PlanetSceneResources
import com.banuharshavardhan.SolarSystemApp.core.data.Planets
import io.github.sceneview.Scene
import io.github.sceneview.math.Position
import io.github.sceneview.node.Node

@Composable
fun SpaceSection(
    resources: PlanetSceneResources
) {
    val spaceNode = remember(resources.engine) {
        Node(
            engine = resources.engine
        )
    }
    val sunNode = rememberSunNode(
        resources = resources,
        radius = 1.5f,
        position = Position(0f, 0f, 0f)
    )
    spaceNode.addChildNode(sunNode)

    Planets.all.forEach { planet ->
        val orbitNode = rememberPlanetOrbitNode(
            resources = resources,
            planet = planet
        )
        spaceNode.addChildNode(orbitNode)
    }

    Scene(
        modifier = Modifier
            .fillMaxSize(),
        engine = resources.engine,
        environment = resources.environment,
        cameraNode = resources.cameraNode,
        cameraManipulator = resources.cameraManipulator,
        childNodes = listOf(spaceNode),
        isOpaque = true
    )
}