package com.vk.directop.exchangenavigation.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.vk.directop.exchangenavigation.R
import com.vk.directop.exchangenavigation.presentation.card_images.components.ImageCard

@Composable
fun CardImageScreen(
    navController: NavController
) {
    val painter = painterResource(id = R.drawable.lamba)
    val title = "Green car near snow rocks"
    val contDescr = "This is Lamborghini"

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
            .background(Color(0xFF909065))

    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .padding(16.dp)
                //.background(Color(0xFF909065))

        ) {
            ImageCard(
                painter = painter,
                title = title,
                contentDescription = contDescr
            )
            ImageCard(
                painter = painterResource(id = R.drawable.detail4422a052),
                title = "Рулевой наконечник",
                contentDescription = "Рулевой наконечник на авто"
            )
            ImageCard(
                painter = painter,
                title = title,
                contentDescription = contDescr
            )
            ImageCard(
                painter = painterResource(id = R.drawable.detail4422a052),
                title = "Рулевой наконечник",
                contentDescription = "Рулевой наконечник на авто"
            )
        }
    }
}