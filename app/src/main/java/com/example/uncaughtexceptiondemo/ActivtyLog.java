package com.example.uncaughtexceptiondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class ActivtyLog extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activty_log);
        Throwable e = (Throwable) getIntent().getSerializableExtra("EXE");


        Log.d("UCE->", "Message " + e.getMessage());
        Log.d("UCE->", "LocalizedMessage " + e.getLocalizedMessage());
       // Log.d("UCE->", "Message " + e.getStackTrace()[0].);
    }
}
