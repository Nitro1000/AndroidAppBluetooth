package com.miltonrivas.appbluetooth

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat.startActivityForResult
import java.util.*

class BluetoothObject {
    val REQUEST_ENABLE_BT:Int = 10;


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

    fun isEnabled(): Unit {
        if (bluetoothAdapter?.isEnabled == false) {
            val enableBtIntent = Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE)
//            startActivityForResult(enableBtIntent, REQUEST_ENABLE_BT)
        }
    }

    fun listPairedDevice(): List<BluetoothDevice> {
        return (bluetoothAdapter?.bondedDevices).orEmpty().toList()//.toList().orEmpty()

    }

    fun EnableDiscoverability(): Unit {
        val requestCode = 1;
        val discoverableIntent: Intent = Intent(BluetoothAdapter.ACTION_REQUEST_DISCOVERABLE).apply {
            putExtra(BluetoothAdapter.EXTRA_DISCOVERABLE_DURATION, 300)
        }
//        startActivityForResult(discoverableIntent, requestCode)
    }

}