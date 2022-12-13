package com.miltonrivas.appbluetooth

import android.bluetooth.BluetoothAdapter
import android.content.Intent
import androidx.core.app.ActivityCompat.startActivityForResult
import java.util.*

class BluetoothObject {
    val REQUEST_ENABLE_BT:Int = 10;
    val STATE_LISTENING = 1
    val STATE_CONNECTING = 2
    val STATE_CONNECTED = 3
    val STATE_CONNECTION_FAILED = 4
    val STATE_MESSAGE_RECEIVED = 5

    /*val bluetoothManager: BluetoothManager = getSystemService(BluetoothManager::class.java)
    val bluetoothAdapter: BluetoothAdapter? = bluetoothManager.getAdapter()*/
    val bluetoothAdapter: BluetoothAdapter? = BluetoothAdapter.getDefaultAdapter();
    val MY_UUID= UUID.fromString("caf59de6-8089-4fd5-9836-768a63fd2281")

    fun isCompatibleDevice(): Boolean {
        if (bluetoothAdapter == null) {
            return false
        }
        return true
    }

    fun isBluetoothEnabled(): Unit {
        if (bluetoothAdapter?.isEnabled == false) {
            val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
//            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT)
        }
    }

}