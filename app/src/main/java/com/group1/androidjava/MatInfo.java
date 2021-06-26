package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


public class MatInfo extends AppCompatActivity {
    TextView  desc4,descx1,descx2,descx3;
    ImageView matinfoimg,matinfoimg1,matinfoimg2,matinfoimg3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat_info);
        getSupportActionBar().hide();

        desc4 = findViewById(R.id.listdesc4);
        descx1 = findViewById(R.id.descrip1);
        descx2 = findViewById(R.id.descrip2);
        descx3 = findViewById(R.id.descrip3);
        matinfoimg = findViewById(R.id.matinfoimg);
        matinfoimg1 = findViewById(R.id.matinfoimg1);
        matinfoimg2 = findViewById(R.id.matinfoimg2);
        matinfoimg3 = findViewById(R.id.matinfoimg3);

        Intent intent4 = getIntent();
        desc4.setText(intent4.getStringExtra("desc4"));
        descx1.setText(intent4.getStringExtra("descx1"));
        descx2.setText(intent4.getStringExtra("descx2"));
        descx3.setText(intent4.getStringExtra("descx3"));

        matinfoimg.setImageResource(intent4.getIntExtra("imagex", 0));
        matinfoimg1.setImageResource(intent4.getIntExtra("imagex1", 0));
        matinfoimg2.setImageResource(intent4.getIntExtra("imagex2", 0));
        matinfoimg3.setImageResource(intent4.getIntExtra("imagex3", 0));
    }
}