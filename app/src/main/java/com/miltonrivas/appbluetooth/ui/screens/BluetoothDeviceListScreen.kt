package com.miltonrivas.appbluetooth.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.miltonrivas.appbluetooth.BluetoothObject
import com.miltonrivas.appbluetooth.ui.components.BluetoothApp
import com.miltonrivas.appbluetooth.ui.components.BluetoothDeviceCard
import com.miltonrivas.appbluetooth.ui.components.CustomAppBar


@Composable
fun BluetoothDeviceList() {
    val pairedDevices: Set<String> = setOf("d1","d2","d3")
    val bluetoothObject = BluetoothObject()
    var list = bluetoothObject.listPairedDevice()
    BluetoothApp {
        Scaffold(
            topBar = {
                CustomAppBar()
            },
            content = {
                Surface(color=MaterialTheme.colors.background){
                    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)){
                        if (list == null) {
                            item {
                                Text(text = "No hay dispositivos vinculados")
                            }
                        }else {
                            items(list) { device ->
                                BluetoothDeviceCard(device = device)
                            }
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
fun BluetoothDeviceListPreview() {
    BluetoothApp {
        BluetoothDeviceList()
    }
}