package com.skyworks.android.skyworksapp.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import com.skyworks.android.skyworksapp.R;
import com.skyworks.android.skyworksapp.model.Logdata;

import java.util.List;

/**
 * Created by dongpo on 2/25/2016.
 */
public class LogAdapter extends ArrayAdapter {

    private final String TAG = "LogAdapter";
    List<Logdata> logList;
    private Activity activity;
    private int res;
    private LayoutInflater layoutInflater;

    public LogAdapter(Context context, int resouce, List<Logdata> logList) {
        super(context, resouce, logList);
        Log.d(TAG, "in LogAdapter Constructor");
        this.activity = activity;
        this.res = resouce;
        this.logList = logList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Log.d(TAG, "in logs adapter getView");
        //ViewHolder viewHolder = null;
        Logdata logdata = logList.get(position);

        if (logdata == null)
            Log.d(TAG, "in logs adapter no logdata");

        if (convertView == null) {
            Log.d(TAG, "in logs adapter convertView is null");
            convertView = layoutInflater.inflate(R.layout.log_list_row, null);
        }

        if (convertView == null) {
            Log.d(TAG, "in logs adapter convertView is null after layoutInflater");
        }

        TextView logTime = (TextView) convertView.findViewById(R.id.logTime);
        logTime.setText("Logged at :" + logdata.getLogdatatime().toString());
        TextView logId = (TextView) convertView.findViewById(R.id.logId);
        logId.setText("Log ID" + " : " + logdata.getLogId());
        TextView logAddressHex = (TextView) convertView.findViewById(R.id.logAddressHex);
        logAddressHex.setText("Address(Hex)" + " : " + logdata.getAddressHex());
        TextView logDataHex = (TextView) convertView.findViewById(R.id.logDataHex);
        logDataHex.setText("Data(Hex)" + " : " + logdata.getDataHex());
        EditText logNote = (EditText) convertView.findViewById(R.id.logNote);

        return convertView;
    }

    @Override
    public int getCount() {

        return logList.size();
    }

    @Override
    public Logdata getItem(int location) {

        return logList.get(location);
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
