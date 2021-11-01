package com.vk.directop.exchangenavigation


import androidx.compose.runtime.Composable

import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.vk.directop.exchangenavigation.presentation.FavoriteScreen
import com.vk.directop.exchangenavigation.presentation.PopularScreen
//navArgument
@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.PopularScreen.route) {

        composable(route = Screen.PopularScreen.route) {
            PopularScreen(navController = navController)
        }
        composable(route = Screen.FavoriteScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "my dear friend"
                    nullable = true
                }
            )
        ) { entry ->
            FavoriteScreen(name = entry.arguments?.getString("name"))
        }
    }
}



