package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.myapplication.features.login.LogInScreen
import com.example.myapplication.features.login.RegistrationScreen

object Destinations {
    const val Login = "login"
    const val Register = "register"
}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Destinations.Login) {
        composable(Destinations.Login) { LogInScreen(navController) }
        composable(Destinations.Register) { RegistrationScreen() }
    }
}
