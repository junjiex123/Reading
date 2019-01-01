package com.hankkin.reading.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

public class NetWorkUtil {

    public static boolean networkConnected(Context context) {
        if (context != null) {
            ConnectivityManager manager = (ConnectivityManager)  context.
                    getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo info = manager.getActiveNetworkInfo();
            return info != null && info.isAvailable();
        }
        return false;
    }
}
