package com.example.noteapp.ui.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.noteapp.ui.createnote.CreateNote
import com.example.noteapp.ui.home.HomeScreen

@Composable
fun AppNavHost() {
    val navController = rememberNavController()

    Scaffold { paddingValues ->
        AppNavigation(
            paddingValues = paddingValues,
            navController = navController,
        )
    }
}

@Composable
private fun AppNavigation(
    paddingValues: PaddingValues,
    navController: NavController,
) {

    NavHost(
        navController = navController,
        startDestination =Screen.Home.createRoute(),
    ) {
        composable(
            route = Screen.Home.route,
        ) {
            HomeScreen(
                openCreatNote = {
                    navController.navigate(Screen.CreateNote.route)
                }
            )
        }


        composable(
            route = Screen.CreateNote.route,
            arguments = Screen.CreateNote.navArguments
        ) {
            CreateNote(
                onBackClick = {
                    navController.navigateUp()
                }
            )
        }

    }
}