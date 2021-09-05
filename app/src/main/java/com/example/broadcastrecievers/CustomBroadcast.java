package com.example.broadcastrecievers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class CustomBroadcast extends AppCompatActivity {
    public static String text = "null";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_broadcast);

        Intent intent = getIntent();
        String txt = intent.getStringExtra(Activity2_op1.EXTRA_TEXT);
        text = txt;
        TextView txt1 = (TextView)findViewById(R.id.textView);
        txt1.setText(txt);
    }
    @Override
    protected void onStart() {
        super.onStart();
        Intent intent2 = new Intent (this,BroadCastRecieverClass.class);
        sendBroadcast(intent2);
    }
}