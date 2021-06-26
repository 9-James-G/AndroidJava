package com.group1.androidjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Znackbar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_znackbar);
        getSupportActionBar().hide();
    }
}