package apc.appcradle.kotlinkmp_first_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import apc.appcradle.kotlinkmp_first_app.components.AppOutlinedField
import kotlinkmp_first_app.composeapp.generated.resources.Res
import kotlinkmp_first_app.composeapp.generated.resources.minutes
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        var degrees by remember { mutableStateOf(0.0) }
        val calc = Calculator()
        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text("Degrees calculator")
            HorizontalDivider()
            AppOutlinedField { degrees = it }
            Text(text = "Grads: ${calc.getGrads(degrees)}")
            Text(text = "Radians: ${calc.getRadians(degrees)}")
            Text(
                text = stringResource(
                    Res.string.minutes,
                    calc.getMinutes(degrees).first,
                    calc.getMinutes(degrees).second,
                    calc.getMinutes(degrees).third
                )
            )
        }
    }
}