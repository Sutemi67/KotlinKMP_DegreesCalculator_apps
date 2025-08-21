package apc.appcradle.kotlinkmp_first_app.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedTextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun AppOutlinedField(
    modifier: Modifier = Modifier,
    onTextChange: (Double) -> Unit
) {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        modifier = modifier.fillMaxWidth().padding(40.dp),
        value = text,
        onValueChange = {
            text = it
            onTextChange(text.toDoubleOrNull() ?: 0.0)
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Decimal,
            imeAction = ImeAction.Done
        )
    )
}