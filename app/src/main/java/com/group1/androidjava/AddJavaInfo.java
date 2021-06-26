package com.group1.androidjava;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class AddJavaInfo extends AppCompatActivity {
    TextView  desc5, bar5;
    ImageView samplePic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_java_info);

        getSupportActionBar().hide();
        samplePic = findViewById(R.id.samplePic);
        bar5 = findViewById(R.id.javaView2);
        desc5 = findViewById(R.id.listdesc5);

        Intent intent5 = getIntent();
        samplePic.setImageResource(intent5.getIntExtra("image5", 0));
        desc5.setText(intent5.getStringExtra("desc5"));
    }
}