package com.example.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class MyBroadCastReciever extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction()))
        {

         boolean booleanExtra=intent.getBooleanExtra(ConnectivityManager.EXTRA_NO_CONNECTIVITY,false);
            if (!booleanExtra)
            {
                Toast.makeText(context, "connected", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(context, "disconnected", Toast.LENGTH_SHORT).show();
            }

        }else if (Intent.ACTION_TIME_TICK.equals(intent.getAction()))
        {

            Toast.makeText(context, "time change", Toast.LENGTH_SHORT).show();
        }
        
    }
}
