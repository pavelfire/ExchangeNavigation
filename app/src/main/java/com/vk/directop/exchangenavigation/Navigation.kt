package com.vk.directop.exchangenavigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.PopularScreen.route) {
        composable(route = Screen.PopularScreen.route) {
            PopularScreen(navController = navController)
        }
        composable(
            route = Screen.FavoriteScreen.route + "/{name}",
            arguments = listOf(
                navArgument("name") {
                    type = NavType.StringType
                    defaultValue = "friend"
                    nullable = true
                }
            )
        ) { entry ->
            FavoriteScreen(name = entry.arguments?.getString("name"))
        }
    }
}

@Composable
fun PopularScreen(
    navController: NavController
) {
    var text1 by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 50.dp)
    ) {
        TextField(
            value = text1,
            onValueChange = {
                text1 = it
            },
            modifier = Modifier.height(8.dp)
        )
        Spacer(modifier = Modifier.height(8.dp))
        Button(
            onClick = {
                //navController.navigate(Screen.FavoriteScreen.route)
                navController.navigate(Screen.FavoriteScreen.withArgs(text1))
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "To favorite screen")
        }
    }
}

@Composable
fun FavoriteScreen(name: String?) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(text = "Hello, $name")
    }
}