package com.example.app_preuba.ui.screens


import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {

    NavHost(
        navController = navController,
        startDestination = Destination.HOME.route,
        modifier = modifier
    ) {

        composable(Destination.HOME.route) {
            HomeScreen()
        }

        composable(Destination.LOGIN.route) {
            LoginScreen()
        }

        composable(Destination.PROFILE.route) {
            ProfilesScreen()
        }
    }
}
