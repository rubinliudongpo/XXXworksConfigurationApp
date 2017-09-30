package com.skyworks.android.skyworksapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.skyworks.android.skyworksapp.R;
import com.skyworks.android.skyworksapp.activity.ControlActivity;
import com.skyworks.android.skyworksapp.activity.DevicestatusActivity;
import com.skyworks.android.skyworksapp.activity.TriggerActivity;

/**
 * Created by dongpo on 2/22/2016.
 */
public class HomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup container, Bundle savedInstanceState) {
        return layoutInflater.inflate(R.layout.homefragment_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        RelativeLayout re_control = (RelativeLayout) getView().findViewById(
                R.id.re_control);
        re_control.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ControlActivity.class));
            }

        });

        RelativeLayout re_triggers = (RelativeLayout) getView().findViewById(
                R.id.re_triggers);
        re_triggers.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TriggerActivity.class));
            }

        });

        RelativeLayout re_devicestatus = (RelativeLayout) getView().findViewById(
                R.id.re_devicestatus);
        re_devicestatus.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), DevicestatusActivity.class));
            }

        });


    }

}
