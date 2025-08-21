package apc.appcradle.kotlinkmp_first_app

import kotlinkmp_first_app.composeapp.generated.resources.Res
import kotlinkmp_first_app.composeapp.generated.resources.allStringResources
import org.jetbrains.compose.resources.stringResource

class JVMPlatform : Platform {
    override val name: String = "Java ${System.getProperty("java.version")}"
}

actual fun getPlatform(): Platform = JVMPlatform()