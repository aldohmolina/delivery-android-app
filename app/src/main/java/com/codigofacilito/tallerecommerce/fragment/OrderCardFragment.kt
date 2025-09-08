package com.codigofacilito.tallerecommerce.fragment

import androidx.annotation.ColorInt
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.codigofacilito.tallerecommerce.component.card.CategoryCard
import com.codigofacilito.tallerecommerce.component.card.ProductCard
import com.codigofacilito.tallerecommerce.model.Order

@Composable
fun OrderCardFragment(navController: NavController) {
    val orders = Order().getOrders()
    Column(
        Modifier.fillMaxHeight().padding(bottom = 10.dp),
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            Modifier.fillMaxWidth().padding(bottom = 50.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            items(orders) {
                ProductCard(
                    it.title,
                    "${it.count} Articulos\n MXN ${it.total} \n ${it.direction}",
                    it.image,
                    Icons.Default.Close,
                    onItemClick = {
                    })
            }
        }
        Button(
            onClick = {},
            modifier = Modifier
                .height(50.dp)
                .width(150.dp)
        ) {
            Text("Pagar", style = MaterialTheme.typography.bodyLarge)
        }
    }
}