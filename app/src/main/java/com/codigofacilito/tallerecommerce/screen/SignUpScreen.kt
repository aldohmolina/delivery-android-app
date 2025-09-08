package com.codigofacilito.tallerecommerce.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import com.codigofacilito.tallerecommerce.component.ButtonBase
import com.codigofacilito.tallerecommerce.component.LogoApp
import com.codigofacilito.tallerecommerce.component.TextClickable
import com.codigofacilito.tallerecommerce.component.TextFieldBase
import com.codigofacilito.tallerecommerce.component.TextFieldPassBase
import com.codigofacilito.tallerecommerce.navigation.Screen

@Composable
fun SignUpScreen(navController: NavController, innerPadding: PaddingValues) {
    val nameValue = remember { mutableStateOf("") }
    val phoneValue = remember { mutableStateOf("") }
    val emailValue = remember { mutableStateOf("") }
    val passwordValue = remember { mutableStateOf("") }
    val confirmPasswordValue = remember { mutableStateOf("") }

    Scaffold(modifier = Modifier.padding(innerPadding)) { innerPadding ->
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(innerPadding)

        ) {
            item {
                LogoApp()
                TextFieldBase("Nombre", nameValue)
                TextFieldBase("Teléfono", phoneValue)
                TextFieldBase("Correo", emailValue)
                TextFieldPassBase("Contraseña", passwordValue)
                TextFieldPassBase("Confirmar Contraseña", confirmPasswordValue)
                ButtonBase("Registrarse", onClick = {}, 20)
                TextClickable("Inicia Sesión", onClick = {
                    navController.navigate(Screen.LoginScreen.route){
                        popUpTo(Screen.LoginScreen.route){
                            inclusive = true
                        }
                    }
                }, 0)
            }
        }
    }
}