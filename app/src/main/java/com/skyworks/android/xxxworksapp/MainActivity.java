package com.skyworks.android.xxxworksapp;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.skyworks.android.xxxworksapp.activity.BaseActivity;
import com.skyworks.android.xxxworksapp.fragment.HomeFragment;
import com.skyworks.android.xxxworksapp.fragment.LogFragment;
import com.skyworks.android.xxxworksapp.fragment.RegFragment;
import com.skyworks.android.xxxworksapp.fragment.ScriptFragment;

public class MainActivity extends BaseActivity {

    private static final String TAG = "MainActivity";
    public HomeFragment homeFragment;
    private Fragment[] fragments;
    private RegFragment regFragment;
    private ScriptFragment scriptFragment;
    private LogFragment logFragment;
    private int index;
    private int currentTabIndex;

    private ImageView[] imagebuttons;
    private TextView[] textviews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {

        homeFragment = new HomeFragment();
        regFragment = new RegFragment();
        scriptFragment = new ScriptFragment();
        logFragment = new LogFragment();

        fragments = new Fragment[]{homeFragment, regFragment, scriptFragment, logFragment};

        imagebuttons = new ImageView[4];
        imagebuttons[0] = (ImageView) findViewById(R.id.ib_home);
        imagebuttons[1] = (ImageView) findViewById(R.id.ib_reg);
        imagebuttons[2] = (ImageView) findViewById(R.id.ib_script);
        imagebuttons[3] = (ImageView) findViewById(R.id.ib_log);

        imagebuttons[0].setSelected(true);
        textviews = new TextView[4];
        textviews[0] = (TextView) findViewById(R.id.tv_home);
        textviews[1] = (TextView) findViewById(R.id.tv_reg);
        textviews[2] = (TextView) findViewById(R.id.tv_script);
        textviews[3] = (TextView) findViewById(R.id.tv_log);
        textviews[0].setTextColor(0xFF45C01A);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fragment_container, homeFragment)
                .add(R.id.fragment_container, regFragment)
                .add(R.id.fragment_container, scriptFragment)
                .add(R.id.fragment_container, logFragment)
                .hide(regFragment)
                .hide(scriptFragment)
                .hide(logFragment)
                .show(homeFragment)
                .commit();
    }

    public void onTabClicked(View view) {
        switch (view.getId()) {
            case R.id.re_home:
                Log.d(TAG, "in home tab");
                index = 0;
                break;
            case R.id.re_reg:
                Log.d(TAG, "in reg tab");
                index = 1;
                break;
            case R.id.re_script:
                Log.d(TAG, "in script tab");
                index = 2;
                break;
            case R.id.re_log:
                Log.d(TAG, "in log tab");
                index = 3;
                break;
        }

        if (currentTabIndex != index) {
            FragmentTransaction trx = getSupportFragmentManager()
                    .beginTransaction();
            trx.hide(fragments[currentTabIndex]);
            if (!fragments[index].isAdded()) {
                trx.add(R.id.fragment_container, fragments[index]);
            }
            trx.show(fragments[index]).commit();
        }
        imagebuttons[currentTabIndex].setSelected(false);
        // 把当前tab设为选中状态
        imagebuttons[index].setSelected(true);
        textviews[currentTabIndex].setTextColor(0xFF999999);
        textviews[index].setTextColor(0xFF45C01A);
        currentTabIndex = index;
    }

}
