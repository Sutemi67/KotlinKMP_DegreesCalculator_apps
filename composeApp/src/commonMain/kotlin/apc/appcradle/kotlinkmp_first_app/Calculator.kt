package apc.appcradle.kotlinkmp_first_app

import kotlin.math.floor

class Calculator {
    fun getGrads(degrees: Double): Double {
        return degrees * 0.9
    }

    fun getMinutes(degrees: Double): Triple<Int, Int, Int> {
        val degreesCalc = floor(degrees)
        val minutesCalc = floor((degrees - degreesCalc) * 60)
        val secondsCalc = ((degrees - degreesCalc) * 60 - minutesCalc) * 60

        val roundSec = secondsCalc.toInt()
        val roundMin = minutesCalc.toInt()
        val roundDeg = degreesCalc.toInt()
        return Triple(roundDeg, roundMin, roundSec)
    }

    fun getRadians(degrees: Double): Double {
        return degrees * 0.01745
    }
}