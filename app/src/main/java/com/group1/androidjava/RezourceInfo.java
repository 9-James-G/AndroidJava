package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class RezourceInfo extends AppCompatActivity {
    TextView  desc3;
    ImageView rezourceImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rezource_info);


        getSupportActionBar().hide();
        rezourceImage = findViewById(R.id.rezourceImage);
        desc3 = findViewById(R.id.listdesc3);

        Intent intent3 = getIntent();
        rezourceImage.setImageResource(intent3.getIntExtra("image3", 0));
        desc3.setText(intent3.getStringExtra("desc3"));
    }
}