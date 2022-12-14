package com.miltonrivas.appbluetooth.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.miltonrivas.appbluetooth.ui.components.BluetoothApp
import com.miltonrivas.appbluetooth.ui.components.CustomAppBar
import com.miltonrivas.appbluetooth.ui.components.CustomButton

@Composable
fun MainScreen() {
    val navController= rememberNavController()
    BluetoothApp {
        Surface(color=MaterialTheme.colors.background) {
            NavHost(navController = navController, startDestination = "home"){
                composable(route = "home"){
                    HomeScreen(navController = navController)
                }
                composable(route = "pairedDevices"){
                    BluetoothDeviceListScreen(navController = navController)
                }
            }
        }
    }
}