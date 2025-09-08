package com.codigofacilito.tallerecommerce.component.card

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun TagCard(tag: String="", icon: ImageVector = Icons.Default.Add) {
    Card(
        modifier = Modifier
            .padding(3.dp),
        shape = RoundedCornerShape(12.dp)
    ){
        Column(
            modifier = Modifier.background(MaterialTheme.colorScheme.primary)
        )
        {
            if (tag.isNotEmpty()) {
                Text(
                    text = tag,
                    modifier = Modifier.padding(
                        12.dp,
                        6.dp,
                        12.dp,
                        6.dp
                    ),
                    color = MaterialTheme.colorScheme.onPrimary
                )
            } else {
                Icon(
                    icon,
                    tint = MaterialTheme.colorScheme.onPrimary,
                    contentDescription = ""
                )
            }
        }
    }

}