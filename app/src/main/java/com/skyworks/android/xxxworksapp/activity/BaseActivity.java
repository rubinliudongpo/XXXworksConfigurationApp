package com.skyworks.android.xxxworksapp.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by dongpo on 2/22/2016.
 */
public class BaseActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //BaseApplication.getInstance().addActivity(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
