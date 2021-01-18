package com.example.myapplicationb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyBroadcastReceiver MyReceiver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Receive broadcast from External App
        MyReceiver = new MyBroadcastReceiver();
        IntentFilter intentFilter = new IntentFilter("com.example.myapplicationa.NOTIFICATION_LISTENER_EXAMPLE");

        if(intentFilter != null)
        {
            registerReceiver(MyReceiver, intentFilter);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(MyReceiver != null)
            unregisterReceiver(MyReceiver);
    }
}