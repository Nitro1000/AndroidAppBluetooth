package com.miltonrivas.appbluetooth.ui.components

import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Alert(title: String,message: String?, onClose: () -> Unit) {
    if (message!= null){
        AlertDialog(onDismissRequest = { onClose() },
            title = {
                Text(title, style= TextStyle(color = Color.Black))
            },
            text = {
                Text(text = message)
            },
            confirmButton = {
                Button(onClick = {
                    onClose()
                }) {
                    Text(text = "OK")
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AlertPreview() {
    Alert(title ="", message = null) {}
}