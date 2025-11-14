package com.example.fluffy_guacamole.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(val route: String, val label: String, val icon: ImageVector) {
    object Recording : Screen("recording", "Grabar", Icons.Default.Phone)
    object AudioList : Screen("audio", "Audios", Icons.Default.Star)
    object ImageList : Screen("images", "Imágenes", Icons.Default.AccountBox)
    object VideoList : Screen("videos", "Videos", Icons.Default.PlayArrow)
    // Pantalla de detalle (no va en la barra de navegación)
    object VideoPlayer : Screen("video_player/{uri}", "Video Player", Icons.Default.PlayArrow) {
        fun createRoute(uri: String) = "video_player/$uri"
    }
}

val navBarItems = listOf(
    Screen.Recording,
    Screen.AudioList,
    Screen.ImageList,
    Screen.VideoList,
)