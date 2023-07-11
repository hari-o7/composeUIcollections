package com.example.navigation

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController

//Step 2: create screens for navigation

@Composable
fun DetailScreen(
    navController: NavController,
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .fillMaxSize()
    ) {
        Text(

            modifier = modifier.clickable {
                navController.navigate(Screen.Home.route) {//navController.navigate() is used to navigate to a specific destination screen.
                    popUpTo(route = Screen.Home.route) {//It means that if the "Home" screen is already present in the back stack, it will be brought to the front instead of creating a new instance of the screen.
                        inclusive = true    //When inclusive is set to true: The destination screen specified in popUpTo will be included in the popping operation. It means that the destination screen itself will be removed from the back stack along with all the screens above it. So, after the popping operation, the back stack will not contain the destination screen or any screens above it.
                    }
                }
            },
            text = "Details",
            color = Color.Blue,
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DetailScreenPreview() {
    DetailScreen(navController = rememberNavController())

}