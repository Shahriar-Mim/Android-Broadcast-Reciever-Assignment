package com.example.broadcastrecievers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class BroadCastRecieverClass extends BroadcastReceiver
{

    String str="default";
    @Override
    public void onReceive(Context context, Intent intent) {
        str = "Broadcast_Message_Received: "+CustomBroadcast.text;
       Toast toast = Toast.makeText(context, str, Toast.LENGTH_LONG);
        toast.show();
    }


}
