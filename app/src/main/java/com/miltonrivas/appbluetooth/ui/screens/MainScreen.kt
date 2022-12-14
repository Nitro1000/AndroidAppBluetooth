package com.miltonrivas.appbluetooth.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.miltonrivas.appbluetooth.ui.components.CustomAppBar
import com.miltonrivas.appbluetooth.ui.components.CustomButton

@Composable
fun MainScreen() {
    val navController= rememberNavController()

    Scaffold(
        topBar = {
                 CustomAppBar()
        },
        content = { padding ->
            Surface(color = MaterialTheme.colors.background) {
                Column(modifier = Modifier.padding(padding)) {
                    CustomButton(label = "Mostrar dispositivos vinculados") {}
                    BluetoothDeviceList()
                }
            }
        }
    )
}