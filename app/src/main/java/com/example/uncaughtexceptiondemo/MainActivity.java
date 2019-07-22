package com.example.uncaughtexceptiondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.uncaughtexception.MyExec;
import com.example.uncaughtexception.MyThread;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyExec.with(this,new MyThread());

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int i=1/0;

            }
        });
    }
}
