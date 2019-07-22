package com.example.uncaughtexception;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyThread {

    public Context context = null;

    public void t(Context context) {
        this.context = context;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable e) {
                handleUncaughtException(thread, e);
            }
        });
    }


    public void handleUncaughtException(Thread thread, Throwable e) {
        e.printStackTrace(); // not all Android versions will print the stack trace automatically


        Log.e("Testy",e.getMessage());
        Intent intent = new Intent();
        intent.setAction("com.mydomain.SEND_LOG"); // see step 5.
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK); // required when starting from Application
        intent.putExtra("EXE", e);
        context.startActivity(intent);

        System.exit(1); // kill off the crashed app
    }

}
