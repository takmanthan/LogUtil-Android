package com.technofly.technicalbabalogutil;

import android.app.AlertDialog;
import android.util.Log;
import android.widget.Toast;

public class LogDebug {

    private static final String TAG = "SUPER_AWESOME_APP";

    public static void showLog(String message)
    {
        Log.d("LogUtil",message);
    }
}
