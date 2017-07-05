package com.example.ostrovskypc.testcallingdetecting;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by ostrovskyPC on 04.07.2017.
 */

public class RSSPullService extends Service {
    String adw = "test";

    protected  void  onHandleIntent(Intent workIntent){
        String dataString = workIntent.getDataString();
    }

    //comment test?

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
