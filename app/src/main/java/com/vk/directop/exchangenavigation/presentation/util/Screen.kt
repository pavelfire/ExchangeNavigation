package com.vk.directop.exchangenavigation.presentation.util

sealed class Screen(val route: String){
    object PopularScreen : Screen("popular_screen")
    object FavoriteScreen : Screen("favorite_screen")
    object CardImageScreen: Screen("card_image")

    fun withArgs(vararg args: String): String {
        return buildString{
            append(route)
            args.forEach{ arg ->
                append("/$arg")
            }
        }
    }
}
