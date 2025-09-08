package com.codigofacilito.tallerecommerce.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.codigofacilito.tallerecommerce.screen.HomeScreen
import com.codigofacilito.tallerecommerce.screen.LoginScreen
import com.codigofacilito.tallerecommerce.screen.SignUpScreen

@Composable
fun Navigation(innerPadding: PaddingValues){
    val navController = rememberNavController()
    NavHost(
        navController,
        startDestination = Screen.LoginScreen.route,
    ){
        composable(Screen.LoginScreen.route) { LoginScreen(navController, innerPadding) }
        composable(Screen.HomeScreen.route) { HomeScreen(navController, innerPadding) }
        composable(Screen.SignUpScreen.route) { SignUpScreen(navController, innerPadding) }

    }
}