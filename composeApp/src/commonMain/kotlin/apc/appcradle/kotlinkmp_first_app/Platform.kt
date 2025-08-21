package apc.appcradle.kotlinkmp_first_app

import kotlinkmp_first_app.composeapp.generated.resources.Res
import org.jetbrains.compose.resources.stringResource

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform