package com.miltonrivas.appbluetooth.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.miltonrivas.appbluetooth.BluetoothObject
import com.miltonrivas.appbluetooth.ui.components.BluetoothApp
import com.miltonrivas.appbluetooth.ui.components.BluetoothDeviceCard
import com.miltonrivas.appbluetooth.ui.components.CustomAppBar


@Composable
fun BluetoothDeviceListScreen(navController: NavController) {
    val bluetoothObject = BluetoothObject()
    var list = bluetoothObject.listPairedDevice()
    BluetoothApp {
        Scaffold(
            topBar = {
                CustomAppBar(navigationIcon = Icons.Filled.ArrowBack){
                    navController.navigate(route = "home"){
                        popUpTo(route = "home")
                    }
                }
            },
            content = {
                Surface(color=MaterialTheme.colors.background){
                    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)){

                        items(list) { device ->
                            BluetoothDeviceCard(device = device)
                        }

                    }
                }
            }
        )
    }
}

@Preview(
    showBackground = true
)
@Composable
fun BluetoothDeviceListScreenPreview() {
    BluetoothApp {
//        BluetoothDeviceListScreen()
    }
}