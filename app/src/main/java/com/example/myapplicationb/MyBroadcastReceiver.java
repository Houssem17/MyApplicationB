package com.example.myapplicationb;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MyBroadcastReceiver extends BroadcastReceiver{
  //  List<String[]> Packages =new ArrayList<String[]>();

    @Override
    public void onReceive(Context context, Intent intent)
    {

       ArrayList<String> pack = intent.getStringArrayListExtra("package");
        Log.i("BR" ,"Data received:  " + pack);
    }
}