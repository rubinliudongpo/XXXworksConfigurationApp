package com.skyworks.android.xxxworksapp.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.skyworks.android.xxxworksapp.LogLab;
import com.skyworks.android.xxxworksapp.R;
import com.skyworks.android.xxxworksapp.activity.LogdataActivity;
import com.skyworks.android.xxxworksapp.adapter.LogAdapter;
import com.skyworks.android.xxxworksapp.model.Logdata;

import java.util.ArrayList;

/**
 * Created by dongpo on 2/22/2016.
 */
public class LogFragment extends Fragment {

    private static final String STATE_LIST = "LogFragment";
    SwipeRefreshLayout mItemsContainer;
    private LogAdapter logsAdapter;
    private ListView loglistView;
    private ArrayList<Logdata> logDataList;
    private LayoutInflater inflater;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        logDataList = LogLab.get(getActivity()).getmLogdatas();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.d(STATE_LIST, "in log onCreateView");
        return inflater.inflate(R.layout.logfragment_layout, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d(STATE_LIST, "in log onActivityCreated");
        if (savedInstanceState != null && savedInstanceState.getBoolean("isConflict", false))
            return;

        loglistView = (ListView) getView().findViewById(R.id.loglistView);
        //logDataList = new ArrayList<Logdata>();
        inflater = LayoutInflater.from(getActivity());
        logsAdapter = new LogAdapter(getActivity(), R.layout.item_logdata_list, logDataList);
        loglistView.setAdapter(logsAdapter);

        loglistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Logdata logdata = logsAdapter.getItem(position);
                startActivity(new Intent(getActivity(), LogdataActivity.class).putExtra("logId", logdata.getLogId()));
            }
        });


    }
}
