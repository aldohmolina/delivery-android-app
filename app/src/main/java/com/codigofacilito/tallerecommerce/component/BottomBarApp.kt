package com.codigofacilito.tallerecommerce.component

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.codigofacilito.tallerecommerce.screen.Section

@Composable
fun BottomBarApp(
    items: List<Section>,
    currentSection: Section,
    onSectionSelected: (Section) -> Unit

) {
    Column {
        Box(
            modifier = Modifier.fillMaxWidth()
                .background(MaterialTheme.colorScheme.onSurface.copy(alpha = 0.2f))
                .height(1.dp)
        ){
        }
        NavigationBar(
            modifier = Modifier
                .height(90.dp)
                .background(
                    MaterialTheme.colorScheme.background
                ), contentColor = MaterialTheme.colorScheme.surface,
            containerColor = MaterialTheme.colorScheme.background
        ) {
            items.forEach { section ->
                val selected = section == currentSection
                NavigationBarItem(
                    selected = selected,
                    onClick = {
                        onSectionSelected(section)
                    },
                    icon = {
                        Icon(
                            painter = painterResource(id = section.icon),
                            contentDescription = "",
                            modifier = Modifier.size(24.dp)
                        )
                    },
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = MaterialTheme.colorScheme.primary,
                        indicatorColor = MaterialTheme.colorScheme.surface
                    ), modifier = Modifier.background(MaterialTheme.colorScheme.background)
                )
            }
        }
    }
}