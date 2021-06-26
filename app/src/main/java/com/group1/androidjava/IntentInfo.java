package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class IntentInfo extends AppCompatActivity {
    TextView  desc7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_info);

        getSupportActionBar().hide();
        desc7 = findViewById(R.id.listdesc7);

        Intent intent7 = getIntent();
        desc7.setText(intent7.getStringExtra("desc7"));


    }
}