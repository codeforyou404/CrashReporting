package com.example.uncaughtexceptiondemo;

import android.app.Application;
import android.content.Intent;

public class MyApp extends Application {


    @Override
    public void onCreate() {
        // Setup handler for uncaught exceptions.
        super.onCreate();
       /* Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable e) {
                handleUncaughtException(thread, e);
            }
        });*/
    }



   /* public void handleUncaughtException (Thread thread, Throwable e)
    {
        e.printStackTrace(); // not all Android versions will print the stack trace automatically

        Intent intent = new Intent ();
        intent.setAction ("com.mydomain.SEND_LOG"); // see step 5.
        intent.setFlags (Intent.FLAG_ACTIVITY_NEW_TASK); // required when starting from Application
        intent.putExtra("EXE",E)
        startActivity (intent);

        System.exit(1); // kill off the crashed app
    }
*/
}
