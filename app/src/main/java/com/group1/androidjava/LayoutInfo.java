package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class LayoutInfo extends AppCompatActivity {
    TextView  desc2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_info);

        getSupportActionBar().hide();

        desc2 = findViewById(R.id.listdesc2);

        Intent intent2 = getIntent();

        desc2.setText(intent2.getStringExtra("desc2"));
    }
}