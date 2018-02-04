package com.example.mohammedsaid.broadcastreceiverdemo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Mohammed Said on 03-Feb-18.
 */

public class MyFirstReceiver extends BroadcastReceiver{

    private static final String TAG=MyFirstReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        if (isOrderedBroadcast()) {
            int initCode = getResultCode();
            String initData = getResultData();
            Bundle initBundle = getResultExtras(true);
            String title = initBundle.getString("title");

            Log.i(TAG, "code : " + initCode + " data : " + initData + " bundle : " + title);
        String name=intent.getStringExtra("name");
        int age=intent.getIntExtra("age",0);
        Log.i(TAG,"Name : "+name+" ,Age : "+age);

        Log.i(TAG,"Hello from 1st receiver , Thread name : "+Thread.currentThread().getName());
        Toast.makeText(context, "hello from 1st receiver", Toast.LENGTH_LONG).show();

            initBundle.putString("title", "lazyDeveloper");
            setResult(83,"windows",initBundle);
        }
    }
}
