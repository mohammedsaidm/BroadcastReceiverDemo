package com.example.mohammedsaid.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    final static String TAG=MainActivity.class.getSimpleName();

    private MyFirstReceiver myFirstReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myFirstReceiver = new MyFirstReceiver();
    }

    public void sendBroadcastMessage(View view) {

        Intent intent=new Intent("my.custom.action.name");
        sendBroadcast(intent,"my.permission");
    }
}
