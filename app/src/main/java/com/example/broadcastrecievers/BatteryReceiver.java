package com.example.broadcastrecievers;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.BatteryManager;
import android.widget.TextView;

public class BatteryReceiver extends BroadcastReceiver {
    public static int b ;
    @Override
    public void onReceive(Context context, Intent intent) {

        
        TextView percentageLabel = ((Activity3_op3)context).findViewById(R.id.percentageLabel);
         TextView textView = ((Activity3_op3)context).findViewById(R.id.textView4);

        String action = intent.getAction();
        int percentage = 0;
        if (action != null && action.equals(Intent.ACTION_BATTERY_CHANGED)) {

           
            // Percentage
            int level = intent.getIntExtra(BatteryManager.EXTRA_LEVEL, -1);
            int scale = intent.getIntExtra(BatteryManager.EXTRA_SCALE, -1);
            percentage = level * 100 / scale;
            percentageLabel.setText("Current battery Percentage of device is: "+percentage + "%");
        }
    compare(percentage,b,textView);

    }

    public void compare(int a, int x, TextView t){

        if (a>x){
            t.setText("Your Prediction was lower");
        }
        else if (a==x){
            t.setText("Your Prediction was Correct");
        }
        else{
            t.setText("Your Prediction was higher");
        }
    }
}

