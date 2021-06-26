package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class LightInfo extends AppCompatActivity {
    TextView  descli;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_light_info);

        getSupportActionBar().hide();
        descli = findViewById(R.id.listdescli);

        Intent intentli = getIntent();
        descli.setText(intentli.getStringExtra("descli"));
    }
}