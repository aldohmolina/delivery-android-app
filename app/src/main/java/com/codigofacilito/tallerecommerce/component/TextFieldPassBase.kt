package com.codigofacilito.tallerecommerce.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.codigofacilito.tallerecommerce.R

@Composable
fun TextFieldPassBase(text: String, textValue: MutableState<String>, padding: Int = 5) {
    val passwordVisible = remember { mutableStateOf(false) }
        OutlinedTextField(
            modifier = Modifier.padding(padding.dp),
            value = textValue.value,
            onValueChange = { textValue.value = it },
            trailingIcon = {
                IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_baseline_remove_red_eye_24),
                        tint = if (passwordVisible.value) MaterialTheme.colorScheme.primary else Color.Gray,
                        contentDescription = ""
                    )
                }
            },
            label = {
                Text(
                    text = text,
                    color = MaterialTheme.colorScheme.onBackground
                )
            },
            visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation()
        )

}