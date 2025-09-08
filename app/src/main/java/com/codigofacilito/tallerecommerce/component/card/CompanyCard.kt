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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.codigofacilito.tallerecommerce.model.Company

@Composable
fun CompanyCard(company: Company, onItemClick: (company: Company) -> Unit) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clickable { onItemClick(company) },
        elevation = CardDefaults.cardElevation(5.dp)
    ) {
        Column (
            modifier = Modifier.background(MaterialTheme.colorScheme.surface)
        ) {
            val image: Painter = painterResource(id = company.image)
            Image(
                painter = image, contentDescription = "",
                modifier = Modifier.height(150.dp).fillMaxWidth(),
                contentScale = ContentScale.Crop
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(15.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Column {
                    Text(
                        text = company.name,
                        style = MaterialTheme.typography.headlineSmall
                    )
                    Text(
                        text = "Costo de envio: ${company.deliveryPrice}. ${company.deliveryTime} ",
                        style = MaterialTheme.typography.titleMedium
                    )
                }
                TagCard(tag = company.rating)
            }
        }
    }

}