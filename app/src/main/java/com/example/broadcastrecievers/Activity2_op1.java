package com.example.broadcastrecievers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity2_op1 extends AppCompatActivity {
    public static final String EXTRA_TEXT = "com.example.broadcastrecievers.EXTRA_TEXT";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_op1);
        Button button = (Button) findViewById(R.id.act2_btn1_op1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }

    private void openActivity3() {
        EditText editText = (EditText) findViewById(R.id.editText_act2_op1);
        Intent intent = new Intent(this,CustomBroadcast.class);
        String text = editText.getText().toString();
        intent.putExtra(EXTRA_TEXT,text);
        startActivity(intent);

    }

}