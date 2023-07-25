package com.example.korpay_tela_login

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.korpay_tela_login.ui.theme.Korpay_tela_loginTheme
import com.example.korpay_tela_login.views.screens.login.Login
import com.example.korpay_tela_login.views.screens.login.TelaInicial

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface {
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
    // Define navigation routes
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "screen1") {
        composable("screen1") {
          TelaInicial(onNavigate = { navController.navigate("screen2") })
        }
        composable("screen2") {
            Login()
        }
    }
}


@Composable
fun GreetingPreview() {
    Korpay_tela_loginTheme {

        MyApp()


    }
}


