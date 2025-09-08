package com.codigofacilito.tallerecommerce.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ButtonBase(text: String, onClick: () -> Unit, padding: Int = 10) {
    Button(
        onClick = { onClick() },
        modifier = Modifier.padding(padding.dp)
    ) {
        Text(
            text = text,
            fontSize = 20.sp
        )
    }

}