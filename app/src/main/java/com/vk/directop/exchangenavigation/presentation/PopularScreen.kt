package com.vk.directop.exchangenavigation.presentation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.vk.directop.exchangenavigation.presentation.util.Screen

@Composable
fun PopularScreen(
    navController: NavController
) {
    var text by remember {
        mutableStateOf("")
    }
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxHeight()
            .height(40.dp)
            .padding(vertical = 50.dp)
            .padding(horizontal = 50.dp)
    ) {
        TextField(
            value = text,
            onValueChange = {
                text = it
            },
            modifier = Modifier
                .height(88.dp),
        )
        Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = {
                if(text.isEmpty())
                navController.navigate(Screen.FavoriteScreen.route)
                else
                navController.navigate(Screen.FavoriteScreen.withArgs(text))
            },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(text = "To favorite screen")
        }

        Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = {
                    navController.navigate(Screen.CardImageScreen.route)
            },
            modifier = Modifier
                .align(Alignment.Start)
                .padding(10.dp)
        ) {
            Text(text = "To Card Image")
        }
        Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = {
                navController.navigate(Screen.InputFieldsScreen.route)
            },
            modifier = Modifier
                .align(Alignment.Start)
                .padding(10.dp)
        ) {
            Text(text = "To Input Fields")
        }
        Spacer(modifier = Modifier.height(18.dp))
        Button(
            onClick = {
                navController.navigate(Screen.DesignScreen.route)
            },
            modifier = Modifier
                .align(Alignment.Start)
                .padding(10.dp)
        ) {
            Text(text = "Design Screen")
        }
    }
}