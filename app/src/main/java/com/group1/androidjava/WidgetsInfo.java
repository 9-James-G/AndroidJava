package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WidgetsInfo extends AppCompatActivity {
    TextView  desc1;
    ImageView widimg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_widgets_info);

        getSupportActionBar().hide();

        widimg = findViewById(R.id.widimg);
        desc1 = findViewById(R.id.listdesc1);

        Intent intent1 = getIntent();
        widimg.setImageResource(intent1.getIntExtra("wid", 0));
        desc1.setText(intent1.getStringExtra("desc1"));


    }
}