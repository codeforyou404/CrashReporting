package com.example.uncaughtexception;

import android.content.Context;
import android.content.Intent;

public class MyExec {

    public static Context context1 = null;

    public static void with(Context context, MyThread myThread) {
        context1 = context;
        myThread.t(context1);
    }
}
