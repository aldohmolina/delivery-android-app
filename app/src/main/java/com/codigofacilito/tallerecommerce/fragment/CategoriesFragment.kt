package com.codigofacilito.tallerecommerce.fragment

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codigofacilito.tallerecommerce.R
import com.codigofacilito.tallerecommerce.component.card.CategoryCard
import com.codigofacilito.tallerecommerce.component.card.CompanyCard
import com.codigofacilito.tallerecommerce.component.card.TagCard
import com.codigofacilito.tallerecommerce.model.Category

@Composable
fun CategoriesFragment(navController: NavController) {
    val categories = Category().getCategories()

    LazyVerticalGrid(GridCells.Fixed(2)) {
        items(categories){
            CategoryCard (it, onItemClick = {
            })
        }
    }
}