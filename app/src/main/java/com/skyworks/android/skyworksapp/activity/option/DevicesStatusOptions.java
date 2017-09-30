package com.skyworks.android.skyworksapp.activity.option;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dongpo on 2/24/2016.
 */
public class DevicesStatusOptions {

    public static final String PREFERENCE_NAME = "DevicesStatusOptions";
    private static SharedPreferences mSharedPreferences;
    private static DevicesStatusOptions mDevicesStatusOptions;
    private static SharedPreferences.Editor editor;

    private DevicesStatusOptions(Context cxt) {
        mSharedPreferences = cxt.getSharedPreferences(PREFERENCE_NAME,
                Context.MODE_PRIVATE);
    }

    /**
     * 单例模式，获取instance实例
     *
     * @param cxt
     * @return
     */
    public static DevicesStatusOptions getInstance(Context cxt) {
        if (mDevicesStatusOptions == null) {
            mDevicesStatusOptions = new DevicesStatusOptions(cxt);
        }
        editor = mSharedPreferences.edit();
        return mDevicesStatusOptions;
    }

    //
    public void setDevicesStatusOptions(String str_name, String str_value) {

        editor.putString(str_name, str_value);
        editor.commit();
    }

    public String getDevicesStatusOptions(String str_name) {

        return mSharedPreferences.getString(str_name, "");

    }
}
