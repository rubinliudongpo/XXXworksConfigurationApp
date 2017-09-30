package com.skyworks.android.skyworksapp.activity.option;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dongpo on 2/24/2016.
 */
public class ControlOptions {

    public static final String PREFERENCE_NAME = "ControlOptions";
    private static SharedPreferences mSharedPreferences;
    private static ControlOptions mControlOptions;
    private static SharedPreferences.Editor editor;

    private ControlOptions(Context cxt) {
        mSharedPreferences = cxt.getSharedPreferences(PREFERENCE_NAME,
                Context.MODE_PRIVATE);
    }

    /**
     * 单例模式，获取instance实例
     *
     * @param cxt
     * @return
     */
    public static ControlOptions getInstance(Context cxt) {
        if (mControlOptions == null) {
            mControlOptions = new ControlOptions(cxt);
        }
        editor = mSharedPreferences.edit();
        return mControlOptions;
    }

    //
    public void setControlOptions(String str_name, String str_value) {

        editor.putString(str_name, str_value);
        editor.commit();
    }

    public String getControlOptions(String str_name) {

        return mSharedPreferences.getString(str_name, "");

    }
}
