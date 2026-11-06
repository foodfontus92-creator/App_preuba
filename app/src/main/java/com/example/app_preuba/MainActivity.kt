package com.example.app_preuba

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.*
import com.example.app_preuba.ui.screens.HomeScreen
import com.example.app_preuba.ui.screens.LoginScreen
import com.example.app_preuba.ui.screens.SplashScreen
import com.example.app_preuba.ui.theme.App_preubaTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()

        setContent {

            App_preubaTheme {

                var showSplash by remember {
                    mutableStateOf(true)
                }

                if (showSplash) {

                    SplashScreen(
                        onFinish = {
                            showSplash = false
                        }
                    )

                } else {

                    HomeScreen()
                }
            }
        }
    }
}