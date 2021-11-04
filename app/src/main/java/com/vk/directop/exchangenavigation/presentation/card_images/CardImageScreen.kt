package com.vk.directop.exchangenavigation.presentation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.vk.directop.exchangenavigation.R
import com.vk.directop.exchangenavigation.presentation.card_images.components.ImageCard

@Composable
fun CardImageScreen(
    navController: NavController
){
    val painter = painterResource(id = R.drawable.lamba)
    val title = "Green car near snow rocks"
    val contDescr = "This is Lamborghini"

    Box(
        modifier = Modifier.fillMaxWidth(0.5f)
        .padding(16.dp)

    ){
        ImageCard(painter = painter,
            title = title,
            contentDescription = contDescr)
    }

}