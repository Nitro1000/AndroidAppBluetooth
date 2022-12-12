package com.miltonrivas.appbluetooth

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHost
import androidx.navigation.compose.rememberNavController
import com.miltonrivas.appbluetooth.ui.components.Alert
import com.miltonrivas.appbluetooth.ui.components.BluetoothApp
import com.miltonrivas.appbluetooth.ui.components.CustomButton
import com.miltonrivas.appbluetooth.ui.screens.MainScreen
import com.miltonrivas.appbluetooth.ui.theme.AppBluetoothTheme

class MainActivity : ComponentActivity() {

    var bluetoothObject = BluetoothObject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BluetoothApp {
                MainScreen()
            }
        }
    }

    // Verify that the user has accepted the Bluetooth activation.
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == bluetoothObject.REQUEST_ENABLE_BT) {
            if (resultCode == RESULT_OK) {
/*                Alert(title = "Estado de Bluetooth", message = "El Bluetooth esta activo") {

                }*/
                Toast.makeText(applicationContext, "Bluetooth activado", Toast.LENGTH_SHORT).show();
            } else if (resultCode == RESULT_CANCELED) {
                Toast.makeText(
                    applicationContext,
                    "Error al habilitar Bluetooth",
                    Toast.LENGTH_SHORT
                ).show();
                finishAffinity();
            }
        }
    }


}
