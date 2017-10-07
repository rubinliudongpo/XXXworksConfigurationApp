package com.skyworks.android.xxxworksapp.activity.option;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dongpo on 2/24/2016.
 */
public class TriggerOptions {

    public static final String PREFERENCE_NAME = "TriggerOptions";
    private static SharedPreferences mSharedPreferences;
    private static TriggerOptions mTriggerOptions;
    private static SharedPreferences.Editor editor;

    private TriggerOptions(Context cxt) {
        mSharedPreferences = cxt.getSharedPreferences(PREFERENCE_NAME,
                Context.MODE_PRIVATE);
    }

    /**
     * 单例模式，获取instance实例
     *
     * @param cxt
     * @return
     */
    public static TriggerOptions getInstance(Context cxt) {
        if (mTriggerOptions == null) {
            mTriggerOptions = new TriggerOptions(cxt);
        }
        editor = mSharedPreferences.edit();
        return mTriggerOptions;
    }

    //
    public void setTriggerOptions(String str_name, String str_value) {

        editor.putString(str_name, str_value);
        editor.commit();
    }

    public String getTriggerOptions(String str_name) {

        return mSharedPreferences.getString(str_name, "");

    }
}
