package com.codigofacilito.tallerecommerce.component.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.codigofacilito.tallerecommerce.model.Category
import com.codigofacilito.tallerecommerce.model.Company

@Composable
fun ProductCard(
    title: String,
    subtitle: String,
    idImage: Int,
    idIcon: ImageVector,
    onItemClick: (category: Category) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(20.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 3.dp),
        shape = RoundedCornerShape(10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth()
                .background(MaterialTheme.colorScheme.surface)
                .padding(end = 5.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                val image: Painter = painterResource(id = idImage)
                Image(
                    painter = image, contentDescription = "",
                    modifier = Modifier.size(100.dp),
                    contentScale = ContentScale.Crop

                )
                Column (Modifier.padding(start = 3.dp)) {
                    Text(
                        text = title,
                        style = MaterialTheme.typography.headlineSmall.copy(fontWeight = FontWeight.Bold)
                    )
                    Text(
                            text = subtitle,
                    style = MaterialTheme.typography.titleMedium
                    )
                }
            }
                TagCard(icon = idIcon)


        }

    }

}