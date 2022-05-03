package com.example.receiverapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if ("DIFSTRFORALLOS".equals(intent.getAction())) {
            String extraData = intent.getStringExtra("ReceivedData");
            Toast.makeText(context, "from Receiver" + extraData, Toast.LENGTH_SHORT).show();
        }
    }
}