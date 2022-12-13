package com.miltonrivas.appbluetooth.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier

@Composable
fun BluetoothDeviceCard(name: String) {

    Surface(modifier = Modifier.fillMaxWidth()) {
        Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(16.dp)) {
            Text(text = name, style = MaterialTheme.typography.body1)
        }
    }

}

@Preview(
    showBackground = true
)
@Composable
fun BluetoothDeviceCardPreview() {
    val name="d1"
    BluetoothApp {
        BluetoothDeviceCard(name = name)
    }
}