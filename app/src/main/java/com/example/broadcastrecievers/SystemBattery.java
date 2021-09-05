package com.example.broadcastrecievers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SystemBattery extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.broadcastrecievers.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_battery);
        Button button = (Button) findViewById(R.id.button_Battary);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                battaryActivity3();
            }
        });
    }

    public void  battaryActivity3(){
        EditText editText = (EditText) findViewById(R.id.editText_Battary);
        Intent intent = new Intent(this,Activity3_op3.class);
        String text = editText.getText().toString();
        intent.putExtra(EXTRA_TEXT,text);
        startActivity(intent);
    }
}