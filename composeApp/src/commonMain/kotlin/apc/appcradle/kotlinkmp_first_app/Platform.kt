package apc.appcradle.kotlinkmp_first_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform