package com.example.broadcastrecievers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.TextView;

public class Activity3_op3 extends AppCompatActivity {
   // public static final String ACTION_BATTERY_CHANGED = "com.example.broadcastrecievers.ACTION_BATTERY_CHANGED";
    private BatteryReceiver mBatteryReceiver = new BatteryReceiver();
    private IntentFilter mIntentFilter = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity3_op3);
        Intent intent = getIntent();

        String txt = intent.getStringExtra(SystemBattery.EXTRA_TEXT);
        int num = Integer.parseInt(txt);
        BatteryReceiver.b=num;
        txt = "User input "+txt+"%";
        TextView txt1 = (TextView)findViewById(R.id.textView2);
        txt1.setText(txt);
    }
    @Override
    protected void onResume() {
        super.onResume();
        registerReceiver(mBatteryReceiver, mIntentFilter);
        //compare();
    }

    @Override
    protected void onPause() {
        unregisterReceiver(mBatteryReceiver);
        super.onPause();
    }

}