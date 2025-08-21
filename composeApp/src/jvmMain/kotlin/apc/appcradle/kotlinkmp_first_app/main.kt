package apc.appcradle.kotlinkmp_first_app

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KotlinKMP_First_app",
    ) {
        App()
    }
}