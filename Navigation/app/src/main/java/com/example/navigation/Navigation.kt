package com.example.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation() {
    //Step 3: create NavController->
    //keeps track of the back stack of composables
    // that make up the screens in your app
    // and the state of each screen.
    val navController = rememberNavController()

    //Step 4: Creating a NavHost:
    //The NavHost links the NavController to the composable destinations that you should be able to navigate between.
    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {

        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController = navController)
        }

        composable(
            route = Screen.Detail.route
        ){
            DetailScreen(navController=navController)
        }


    }


}