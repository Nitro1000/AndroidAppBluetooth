package com.miltonrivas.appbluetooth.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.miltonrivas.appbluetooth.ui.theme.AppBluetoothTheme

@Composable
fun BluetoothApp( content: @Composable () -> Unit ) {
    val navController = rememberNavController()
    AppBluetoothTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            content()
        }
    }
}