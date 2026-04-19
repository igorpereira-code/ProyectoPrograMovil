package ucb.edu.bo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import ucb.edu.bo.profile.presentation.screen.ProfileScreen

@Composable
fun AppNavHost() {


    val navController = rememberNavController()


    NavHost(navController = navController, startDestination = NavRoute.Profile) {
        composable<NavRoute.Profile> {
            ProfileScreen()
        }


        composable<NavRoute.ProfileEdit> {
        }
    }
}
