package com.codigofacilito.tallerecommerce.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codigofacilito.tallerecommerce.R

@Composable
fun LogoApp(padding: Int = 20) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()

        ) {
            Image(
                painter = painterResource(id = R.drawable.applogo),
                contentDescription = "",
                modifier = Modifier.size(100.dp)
            )
            Text(
                text = "Deliver", fontSize = 30.sp,
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    letterSpacing = 5.sp,
                    color = MaterialTheme.colorScheme.primary
                )
            )
        }
    Spacer(modifier = Modifier.padding(padding.dp))
}