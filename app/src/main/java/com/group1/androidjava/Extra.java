package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Extra extends AppCompatActivity {
    TextView exdesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extra);
        getSupportActionBar().hide();
        exdesc = findViewById(R.id.listdescex);
        Intent intent1 = getIntent();
        exdesc.setText(intent1.getStringExtra("desc1"));
    }
}