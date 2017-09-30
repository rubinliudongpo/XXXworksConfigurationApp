package com.skyworks.android.skyworksapp;


import android.content.Context;

import com.skyworks.android.skyworksapp.model.Logdata;

import java.util.ArrayList;


/**
 * Created by dongpo on 2/26/2016.
 */
public class LogLab {

    private static LogLab sLogLab;
    private ArrayList<Logdata> mLogdatas;
    private Context mAppContext;

    private LogLab(Context appContext) {
        mAppContext = appContext;
        mLogdatas = new ArrayList<Logdata>();
        for (int i = 0; i < 100; i++) {
            Logdata logdata = new Logdata();
            if (i % 2 == 0) {
                logdata.setAddressHex("0x00");
                logdata.setDataHex("0x000001");

            } else {
                logdata.setAddressHex("0x01");
                logdata.setDataHex("0x00000a");
            }
            mLogdatas.add(logdata);
        }
    }

    public static LogLab get(Context context) {
        if (sLogLab == null) {
            sLogLab = new LogLab(context.getApplicationContext());
        }
        return sLogLab;
    }

    public ArrayList<Logdata> getmLogdatas() {
        return mLogdatas;
    }
}
