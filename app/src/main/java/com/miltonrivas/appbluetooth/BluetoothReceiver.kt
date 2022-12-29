package com.miltonrivas.appbluetooth

import android.bluetooth.BluetoothAdapter
import android.bluetooth.BluetoothDevice
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

class BluetoothReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        val action = intent?.action
        when (action) {
            BluetoothDevice.ACTION_FOUND -> {
                val device: BluetoothDevice? = intent.getParcelableExtra(BluetoothDevice.EXTRA_DEVICE)
                device?.let {
                    Log.d("BluetoothReceiver", "Device found: ${it.name}")
                }
            }
            BluetoothAdapter.ACTION_DISCOVERY_STARTED -> {
                Log.d("BluetoothReceiver", "Discovery started")
            }
            BluetoothAdapter.ACTION_DISCOVERY_FINISHED -> {
                Log.d("BluetoothReceiver", "Discovery finished")
            }
            BluetoothAdapter.ACTION_STATE_CHANGED -> {
                val state = intent.getIntExtra(BluetoothAdapter.EXTRA_STATE, BluetoothAdapter.ERROR)
                when (state) {
                    BluetoothAdapter.STATE_OFF -> {
                        Log.d("BluetoothReceiver", "Bluetooth off")
                    }
                    BluetoothAdapter.STATE_TURNING_OFF -> {
                        Log.d("BluetoothReceiver", "Bluetooth turning off")
                    }
                    BluetoothAdapter.STATE_ON -> {
                        Log.d("BluetoothReceiver", "Bluetooth on")
                    }
                    BluetoothAdapter.STATE_TURNING_ON -> {
                        Log.d("BluetoothReceiver", "Bluetooth turning on")
                    }
                }
            }
        }
    }
}
