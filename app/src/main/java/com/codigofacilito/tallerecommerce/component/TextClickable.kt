package com.codigofacilito.tallerecommerce.component

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TextClickable(text: String, onClick: () -> Unit, padding: Int = 5) {
        Text(
            text = text,
            modifier= Modifier.clickable(
                onClick = { onClick() }
            ).padding(padding.dp)

        )
}