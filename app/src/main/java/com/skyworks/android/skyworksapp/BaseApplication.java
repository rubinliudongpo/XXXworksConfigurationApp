package com.skyworks.android.skyworksapp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dongpo on 2/22/2016.
 */
public class BaseApplication extends Application {

    public static Context applicationContext;
    private static BaseApplication instance;
    private List<Activity> activityList = new ArrayList<Activity>();

    public static BaseApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = this;
        instance = this;
    }

    public void addActivity(Activity activity) {
        if (activityList.contains(activity)) {
            activityList.add(activity);
        }
    }
}
