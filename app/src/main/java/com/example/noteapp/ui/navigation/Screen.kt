package com.example.noteapp.ui.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.noteapp.ui.navigation.Screen.Constants.CREATE_NOTE_PATH
import com.example.noteapp.ui.navigation.Screen.Constants.HOME_PATH

sealed class Screen(
    val route: String,
    val navArguments: List<NamedNavArgument> = emptyList(),
) {
    private object Constants {
        const val HOME_PATH = "home"
        const val CREATE_NOTE_PATH = "createnote"
    }

    data object Home : Screen(
        route = HOME_PATH,
    ) {
        fun createRoute() = HOME_PATH
    }

    data object CreateNote : Screen(
        route = CREATE_NOTE_PATH,
        navArguments = listOf(
            navArgument("id") {
                type = NavType.StringType
                nullable = true
            }
        )
    ) {
        fun createRoute(
            id: String?,
        ) = "$CREATE_NOTE_PATH?id=$id"
    }
}