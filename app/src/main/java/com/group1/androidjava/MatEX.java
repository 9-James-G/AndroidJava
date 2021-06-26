package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MatEX extends AppCompatActivity {
    TextView desc4,descx1,descx2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_e_x);
        getSupportActionBar().hide();

        desc4 = findViewById(R.id.listdesc4);
        descx1 = findViewById(R.id.descrip1);
        descx2 = findViewById(R.id.descrip2);

        Intent intent4 = getIntent();
        desc4.setText(intent4.getStringExtra("desc4"));
        descx1.setText(intent4.getStringExtra("descx1"));
        descx2.setText(intent4.getStringExtra("descx2"));

    }
}