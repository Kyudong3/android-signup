package nextstep.signup.ui.signup

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import nextstep.signup.R


@Composable
fun PasswordConfirmField(
    passwordConfirm: String,
    onPasswordConfirmChange: (String) -> Unit
) {
    TextField(
        value = passwordConfirm,
        onValueChange = { onPasswordConfirmChange(it) },
        modifier = Modifier.fillMaxWidth(),
        label = { Text(text = stringResource(id = R.string.password_confirm)) },
        placeholder = { Text(text = stringResource(id = R.string.password_confirm)) },
        visualTransformation = PasswordVisualTransformation(),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password)
    )
}

@Preview(showBackground = true)
@Composable
private fun PasswordConfirmFieldPreview() {
    var passwordConfirm by remember { mutableStateOf("") }
    PasswordConfirmField(
        passwordConfirm = passwordConfirm,
        onPasswordConfirmChange = { passwordConfirm = it }
    )
}
