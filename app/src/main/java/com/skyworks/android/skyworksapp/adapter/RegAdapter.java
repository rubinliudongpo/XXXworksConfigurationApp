package com.skyworks.android.skyworksapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import com.skyworks.android.skyworksapp.R;
import com.skyworks.android.skyworksapp.model.Reg;

import java.util.List;

/**
 * Created by dongpo on 2/25/2016.
 */
public class RegAdapter extends ArrayAdapter {

    private final String TAG = "RegAdapter";
    List<Reg> regList;
    private Activity activity;
    private int res;
    private LayoutInflater layoutInflater;

    public RegAdapter(Context context, int resouce, List<Reg> regList) {
        super(context, resouce, regList);
        Log.d(TAG, "in RegAdapter Constructor");
        this.activity = activity;
        this.res = resouce;
        this.regList = regList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d(TAG, "in regs adapter getView");
        //ViewHolder viewHolder = null;
        Reg reg = regList.get(position);

        if (reg == null)
            Log.d(TAG, "in regs adapter no reg");

        if (convertView == null) {
            Log.d(TAG, "in regs adapter convertView is null");
            convertView = layoutInflater.inflate(R.layout.reg_list_row, null);
        }

        if (convertView == null) {
            Log.d(TAG, "in reg adapter convertView is null after layoutInflater");
        }

        Button bit7 = (Button) convertView.findViewById(R.id.bit7_btn);
        bit7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        Button bit6 = (Button) convertView.findViewById(R.id.bit6_btn);
        bit6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        Button bit5 = (Button) convertView.findViewById(R.id.bit5_btn);
        bit5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        Button bit4 = (Button) convertView.findViewById(R.id.bit4_btn);
        bit4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        Button bit3 = (Button) convertView.findViewById(R.id.bit3_btn);
        bit3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        Button bit2 = (Button) convertView.findViewById(R.id.bit2_btn);
        bit2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        Button bit1 = (Button) convertView.findViewById(R.id.bit1_btn);
        bit1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        Button bit0 = (Button) convertView.findViewById(R.id.bit0_btn);
        bit0.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

            }
        });

        return convertView;
    }

    @Override
    public int getCount() {

        return regList.size();
    }

    @Override
    public Reg getItem(int location) {

        return regList.get(location);
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    static class ViewHolder {

        public TextView logTime;
        public TextView logId;
        public TextView logAddressHex;
        public TextView logDataHex;
        public TextView logNote;

    }
}
