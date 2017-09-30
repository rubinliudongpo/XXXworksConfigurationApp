package com.skyworks.android.skyworksapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.skyworks.android.skyworksapp.R;
import com.skyworks.android.skyworksapp.activity.RegActivity;


/**
 * Created by dongpo on 2/22/2016.
 */
public class RegFragment extends Fragment {

    private static final String REG_LIST = "RegFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.regfragment_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(REG_LIST, "in reg onActivityCreated");

        RelativeLayout re_output_valtage = (RelativeLayout) getView().findViewById(
                R.id.re_output_valtage);
        re_output_valtage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "output_valtage");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        RelativeLayout re_switch_mode_and_bypass_control = (RelativeLayout) getView().findViewById(
                R.id.re_switch_mode_and_bypass_control);
        re_switch_mode_and_bypass_control.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "switch_mode_and_bypass_control");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        RelativeLayout re_high_reso_output_voltage = (RelativeLayout) getView().findViewById(
                R.id.re_high_reso_output_voltage);
        re_high_reso_output_voltage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "high_reso_output_voltage");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        RelativeLayout re_fault_status = (RelativeLayout) getView().findViewById(
                R.id.re_fault_status);
        re_fault_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "fault_status");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        RelativeLayout re_rffe_status = (RelativeLayout) getView().findViewById(
                R.id.re_rffe_status);
        re_rffe_status.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "rffe_status");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        RelativeLayout re_group_id = (RelativeLayout) getView().findViewById(
                R.id.re_group_id);
        re_group_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "group_id");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        RelativeLayout re_power_mode_and_trigger = (RelativeLayout) getView().findViewById(
                R.id.re_power_mode_and_trigger);
        re_power_mode_and_trigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "power_mode_and_trigger");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        RelativeLayout re_product_id = (RelativeLayout) getView().findViewById(
                R.id.re_product_id);
        re_product_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "product_id");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        RelativeLayout re_manufacturer_id = (RelativeLayout) getView().findViewById(
                R.id.re_manufacturer_id);
        re_manufacturer_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "manufacturer_id");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        RelativeLayout re_user_programmable_slave_id = (RelativeLayout) getView().findViewById(
                R.id.re_user_programmable_slave_id);
        re_user_programmable_slave_id.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "user_programmable_slave_id");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

        RelativeLayout re_device_revision = (RelativeLayout) getView().findViewById(
                R.id.re_device_revision);
        re_device_revision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RegActivity.class);
                Bundle bundle = new Bundle();
                bundle.putString("option", "device_revision");
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });

    }
}
