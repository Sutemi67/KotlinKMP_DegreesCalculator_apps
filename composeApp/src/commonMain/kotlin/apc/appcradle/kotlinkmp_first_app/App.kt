package apc.appcradle.kotlinkmp_first_app

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import apc.appcradle.kotlinkmp_first_app.components.AppOutlinedField
import kotlinkmp_first_app.composeapp.generated.resources.Res
import kotlinkmp_first_app.composeapp.generated.resources.app_name
import kotlinkmp_first_app.composeapp.generated.resources.grads_value
import kotlinkmp_first_app.composeapp.generated.resources.minutes
import kotlinkmp_first_app.composeapp.generated.resources.radians_value
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    MaterialTheme {
        val calc = Calculator()
        var degrees by remember { mutableStateOf(0.0) }
        var grads by remember { mutableStateOf(0.0) }
        var radians by remember { mutableStateOf(0.0) }
        var minutes by remember { mutableStateOf(Triple(0, 0, 0)) }

        LaunchedEffect(degrees) {
            grads = calc.getGrads(degrees)
            radians = calc.getRadians(degrees)
            minutes = calc.getMinutes(degrees)
        }

        Column(
            modifier = Modifier
                .background(MaterialTheme.colorScheme.primaryContainer)
                .safeContentPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Text(stringResource(Res.string.app_name))
            HorizontalDivider(Modifier.padding(20.dp))
            AppOutlinedField { degrees = it }
            Text(text = stringResource(Res.string.grads_value, grads))
            Text(text = stringResource(Res.string.radians_value, radians))
            Text(
                text = stringResource(
                    Res.string.minutes,
                    minutes.first,
                    minutes.second,
                    minutes.third
                )
            )
        }
    }
}