package com.codigofacilito.tallerecommerce.screen

import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.codigofacilito.tallerecommerce.R
import com.codigofacilito.tallerecommerce.component.BottomBarApp
import com.codigofacilito.tallerecommerce.component.ButtonBase
import com.codigofacilito.tallerecommerce.component.LogoApp
import com.codigofacilito.tallerecommerce.component.TextClickable
import com.codigofacilito.tallerecommerce.component.TextFieldBase
import com.codigofacilito.tallerecommerce.component.TextFieldPassBase
import com.codigofacilito.tallerecommerce.component.TopBarApp
import com.codigofacilito.tallerecommerce.fragment.CategoriesFragment
import com.codigofacilito.tallerecommerce.fragment.CompaniesFragment
import com.codigofacilito.tallerecommerce.fragment.OrderCardFragment
import org.w3c.dom.Text

@Composable
fun HomeScreen(navController: NavController, innerPadding: PaddingValues) {
    val navItems = Section.values().toList()
    val navSection = remember { mutableStateOf(Section.Companies) }

    val currentTheme = isSystemInDarkTheme()
    val toggleTheme: () -> Unit = {
        if (currentTheme) {
            setDayTheme()
        } else {
            SetNightTheme()
        }
    }

    Scaffold(
        modifier = Modifier
            .padding(15.dp)
            .background(MaterialTheme.colorScheme.background),
        topBar = {
            Crossfade(
                targetState = navSection.value,
            ) { section ->
                when (section) {
                    Section.Companies ->  TopBarApp(
                        "Restaurantes",
                        "Pide tu comida para llevar",
                        R.drawable.ic_baseline_lightbulb_24,
                        onIconClick = toggleTheme)
                    Section.Explore ->  TopBarApp(
                        "Categorias",
                        "Categorias principales",
                        R.drawable.ic_baseline_search_24,
                        onIconClick = {})
                    Section.Orders ->  TopBarApp(
                        "Carrito",
                        "Productos adquiridos",
                        R.drawable.ic_baseline_filter_list_24,
                        onIconClick = {})
                    Section.Profile ->  TopBarApp(
                        "Perfil",
                        "Datos personales",
                        R.drawable.ic_baseline_logout_24,
                        onIconClick = {})
                }
            }

        },
        bottomBar = {
            BottomBarApp(
                items = navItems,
                currentSection = navSection.value,
                onSectionSelected = { navSection.value = it },
            )
        }) { padding ->
        Column{
            Crossfade(
                targetState = navSection.value,
                modifier = Modifier.padding(padding)
            ) { section ->
                when (section) {
                    Section.Companies -> CompaniesFragment(navController)
                    Section.Explore -> CategoriesFragment(navController)
                    Section.Orders -> OrderCardFragment(navController)
                    Section.Profile -> Text("Profile")
                }
            }
        }

    }
}

private fun setDayTheme(){
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
}

private fun SetNightTheme(){
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
}

enum class Section(val icon: Int) {
    Companies(R.drawable.ic_baseline_home_24),
    Explore(R.drawable.ic_baseline_search_24),
    Orders(R.drawable.ic_baseline_shopping_cart_24),
    Profile(R.drawable.ic_baseline_person_24)
}