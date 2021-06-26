package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class AndroidActivityInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_info);
        getSupportActionBar().hide();
    }
}