package com.miltonrivas.appbluetooth.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.miltonrivas.appbluetooth.ui.components.BluetoothApp
import com.miltonrivas.appbluetooth.ui.components.BluetoothDeviceCard
import com.miltonrivas.appbluetooth.ui.components.CustomAppBar
import com.miltonrivas.appbluetooth.ui.components.CustomButton

@Composable
fun BluetoothDeviceList() {
    val pairedDevices: Set<String> = setOf("d1","d2","d3")

    BluetoothApp {
        Scaffold(
            topBar = {
                CustomAppBar()
            },
            content = {
                Surface(color=MaterialTheme.colors.background){
                    LazyColumn(verticalArrangement = Arrangement.spacedBy(8.dp)){
                        items(pairedDevices.size){
                                device -> BluetoothDeviceCard(name = device.toString())
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