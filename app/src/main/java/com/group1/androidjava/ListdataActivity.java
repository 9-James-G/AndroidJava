package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ListdataActivity extends AppCompatActivity {
    TextView  descv;
    ImageView imagev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listdata);

        getSupportActionBar().hide();
        descv = findViewById(R.id.listdescv);
        imagev = findViewById(R.id.imagev);

        Intent intentv = getIntent();
        descv.setText(intentv.getStringExtra("descv"));
        imagev.setImageResource(intentv.getIntExtra("imagev1", 0));

    }
}