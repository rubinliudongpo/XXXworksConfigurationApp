package com.skyworks.android.xxxworksapp.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.skyworks.android.xxxworksapp.R;

/**
 * Created by dongpo on 2/22/2016.
 */
public class ScriptFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.scriptfragment_layout, container, false);
    }
}
