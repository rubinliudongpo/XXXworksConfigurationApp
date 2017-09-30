package com.skyworks.android.skyworksapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.skyworks.android.skyworksapp.R;


/**
 * Created by dongpo on 2/26/2016.
 */
public class RegActivity extends Activity implements View.OnClickListener {

    private static final String TAG = "RegActivity";
    private static String[] addrArray = {"00", "01", "03", "08", "1A", "1B", "1C", "1D", "1E", "1F", "21"};
    private static String[] nameArray = {"Output Voltage", "Switch Mode & Bypass", "High Resolution Output Voltage", "Fault Status", "RFFE Status", "Group ID", "Power Mode and Trigger", "Pruduct ID", "Manufacture ID", "User Programmer Slave ID", "Device Revision"};
    private static String[] reg1Array = {"NA", "VSET6", "VSET5", "VSET4", "VSET3", "VSET2", "VSET1", "VSET0"};
    private static String[] reg2Array = {"NA", "HRESV", "SMC", "BYP", "FSET1", "FSET1", "NA", "NA"};
    private static String[] reg3Array = {"HVSET7", "HVSE6", "HVSET5", "HVSET4", "HVSET3", "HVSET2", "HVSET1", "HVSET0"};
    private static String[] reg4Array = {"NA", "NA", "NA", "NA", "REG_OCF", "BVP_OCF", "OTF", "BYP_ST"};
    private static String[] reg5Array = {"RST", "CFP_ER", "CL_ER", "AFP_ER", "DFP_ER", "R_UNUSED", "W_UNUSED", "B_G_ER"};
    private static String[] reg6Array = {"NA", "NA", "NA", "NA", "GSID3", "GSID2", "GSID1", "GSID0"};
    private static String[] reg7Array = {"PW_MODE1", "PW_MODE0", "TRIG_MSK2", "TRIG_MSK1", "TRIG_MSK0", "TRIG2", "TRIG1", "TRIG0"};
    private static String[] reg8Array = {"PROD_ID7", "PROD_ID6", "PROD_ID5", "PROD_ID4", "PROD_ID3", "PROD_ID2", "PROD_ID1", "PROD_ID0"};
    private static String[] reg9Array = {"MFR_ID7", "MFR_ID6", "MFR_ID5", "MFR_ID4", "MFR_ID3", "MFR_ID2", "MFR_ID1", "MFR_ID0",};
    private static String[] reg10Array = {"NA", "NA", "MFR_ID9", "MFR_ID8", "USID3", "USID2", "USID1", "USID0"};
    private static String[] reg11Array = {"LOCK", "REV6", "REV5", "REV4", "REV3", "REV2", "REV1", "REV0"};
    private String reOptionString;
    private String[] regArray;

    private String regAddrString;
    private String regnameString;
    private String regDataString;

    private TextView regAddr;
    private TextView regName;
    private TextView regData;

    private RelativeLayout re_bit7;
    private RelativeLayout re_bit6;
    private RelativeLayout re_bit5;
    private RelativeLayout re_bit4;
    private RelativeLayout re_bit3;
    private RelativeLayout re_bit2;
    private RelativeLayout re_bit1;
    private RelativeLayout re_bit0;

    private TextView tv_bit7;
    private TextView tv_bit6;
    private TextView tv_bit5;
    private TextView tv_bit4;
    private TextView tv_bit3;
    private TextView tv_bit2;
    private TextView tv_bit1;
    private TextView tv_bit0;

    private Button btn_bit7;
    private Button btn_bit6;
    private Button btn_bit5;
    private Button btn_bit4;
    private Button btn_bit3;
    private Button btn_bit2;
    private Button btn_bit1;
    private Button btn_bit0;

    private String bit7_string;
    private String bit6_string;
    private String bit5_string;
    private String bit4_string;
    private String bit3_string;
    private String bit2_string;
    private String bit1_string;
    private String bit0_string;

    @Override
    public void onCreate(Bundle onSavedInstateState) {
        super.onCreate(onSavedInstateState);
        setContentView(R.layout.reg_list_row);
        Bundle reIntent = this.getIntent().getExtras();
        reOptionString = reIntent.getString("option");
        Log.d(TAG, reOptionString);
        setConfig(reOptionString);
        initView();
    }

    private void setConfig(String option) {
        Log.d(TAG, option);
        if (option.equals("output_valtage")) {

            regAddrString = addrArray[0];
            Log.d(TAG, regAddrString);
            regnameString = nameArray[0];
            regDataString = "(0000 0000)";
            regArray = reg1Array;
        } else if (option.equals("switch_mode_and_bypass_control")) {
            regAddrString = addrArray[1];
            regnameString = nameArray[1];
            regDataString = "(0000 0000)";
            regArray = reg2Array;
        } else if (option.equals("high_reso_output_voltage")) {
            regAddrString = addrArray[2];
            regnameString = nameArray[2];
            regDataString = "(0000 0000)";
            regArray = reg3Array;
        } else if (option.equals("fault_status")) {
            regAddrString = addrArray[3];
            regnameString = nameArray[3];
            regDataString = "(0000 0000)";
            regArray = reg4Array;
        } else if (option.equals("rffe_status")) {
            regAddrString = addrArray[4];
            regnameString = nameArray[4];
            regDataString = "(0000 0000)";
            regArray = reg5Array;
        } else if (option.equals("group_id")) {
            regAddrString = addrArray[5];
            regnameString = nameArray[5];
            regDataString = "(0000 0000)";
            regArray = reg6Array;
        } else if (option.equals("power_mode_and_trigger")) {
            regAddrString = addrArray[6];
            regnameString = nameArray[6];
            regDataString = "(0000 0000)";
            regArray = reg7Array;
        } else if (option.equals("product_id")) {
            regAddrString = addrArray[7];
            regnameString = nameArray[7];
            regDataString = "(0000 0000)";
            regArray = reg8Array;
        } else if (option.equals("manufacturer_id")) {
            regAddrString = addrArray[8];
            regnameString = nameArray[8];
            regDataString = "(0000 0000)";
            regArray = reg9Array;
        } else if (option.equals("user_programmable_slave_id")) {
            regAddrString = addrArray[9];
            regnameString = nameArray[9];
            regDataString = "(0000 0000)";
            regArray = reg10Array;
        } else if (option.equals("device_revision")) {
            regAddrString = addrArray[10];
            regnameString = nameArray[10];
            regDataString = "(0000 0000)";
            regArray = reg11Array;
        }
        Log.d(TAG, regAddrString);
        Log.d(TAG, regnameString);
        Log.d(TAG, regDataString);
    }

    private void initView() {

        regAddr = (TextView) this.findViewById(R.id.regAddr);
        regAddr.setText("Register Address : " + "\n" + regAddrString);
        regName = (TextView) this.findViewById(R.id.regName);
        regName.setText("Register Name : " + "\n" + regnameString);
        regData = (TextView) this.findViewById(R.id.regData);
        regData.setText("Register Data : " + "\n" + regDataString);

        re_bit7 = (RelativeLayout) this.findViewById(R.id.re_bit7);
        re_bit6 = (RelativeLayout) this.findViewById(R.id.re_bit6);
        re_bit5 = (RelativeLayout) this.findViewById(R.id.re_bit5);
        re_bit4 = (RelativeLayout) this.findViewById(R.id.re_bit4);
        re_bit3 = (RelativeLayout) this.findViewById(R.id.re_bit3);
        re_bit2 = (RelativeLayout) this.findViewById(R.id.re_bit2);
        re_bit1 = (RelativeLayout) this.findViewById(R.id.re_bit1);
        re_bit0 = (RelativeLayout) this.findViewById(R.id.re_bit0);

        /*
        tv_bit7 = (TextView) this.findViewById(R.id.tv_bit7);
        tv_bit6 = (TextView) this.findViewById(R.id.tv_bit6);
        tv_bit5 = (TextView) this.findViewById(R.id.tv_bit5);
        tv_bit4 = (TextView) this.findViewById(R.id.tv_bit4);
        tv_bit3 = (TextView) this.findViewById(R.id.tv_bit3);
        tv_bit2 = (TextView) this.findViewById(R.id.tv_bit2);
        tv_bit1 = (TextView) this.findViewById(R.id.tv_bit1);
        tv_bit0 = (TextView) this.findViewById(R.id.tv_bit0);
        */

        btn_bit7 = (Button) this.findViewById(R.id.bit7_btn);
        btn_bit7.setText(regArray[0]);
        //btn_bit7.setText("Try it");
        btn_bit6 = (Button) this.findViewById(R.id.bit6_btn);
        btn_bit6.setText(regArray[1]);
        btn_bit5 = (Button) this.findViewById(R.id.bit5_btn);
        btn_bit5.setText(regArray[2]);
        btn_bit4 = (Button) this.findViewById(R.id.bit4_btn);
        btn_bit4.setText(regArray[3]);
        btn_bit3 = (Button) this.findViewById(R.id.bit3_btn);
        btn_bit3.setText(regArray[4]);
        btn_bit2 = (Button) this.findViewById(R.id.bit2_btn);
        btn_bit2.setText(regArray[5]);
        btn_bit1 = (Button) this.findViewById(R.id.bit1_btn);
        btn_bit1.setText(regArray[6]);
        btn_bit0 = (Button) this.findViewById(R.id.bit0_btn);
        btn_bit0.setText(regArray[7]);

        re_bit7.setOnClickListener(this);
        re_bit6.setOnClickListener(this);
        re_bit5.setOnClickListener(this);
        re_bit4.setOnClickListener(this);
        re_bit3.setOnClickListener(this);
        re_bit2.setOnClickListener(this);
        re_bit1.setOnClickListener(this);
        re_bit0.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "enter reg activity onClick");

        switch (v.getId()) {
            case R.id.re_bit7:
                /*
                if (re_bit7.getVisibility() == View.VISIBLE) {
                    re_bit7.setVisibility(View.INVISIBLE);
                    iv_disenable_vio.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "false");
                } else {
                    iv_enable_vio.setVisibility(View.VISIBLE);
                    iv_disenable_vio.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "true");
                }
                */
                break;

            case R.id.re_bit6:
                /*
                if (re_bit7.getVisibility() == View.VISIBLE) {
                    re_bit7.setVisibility(View.INVISIBLE);
                    iv_disenable_vio.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "false");
                } else {
                    iv_enable_vio.setVisibility(View.VISIBLE);
                    iv_disenable_vio.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "true");
                }
                */
                break;

            case R.id.re_bit5:
                /*
                if (re_bit7.getVisibility() == View.VISIBLE) {
                    re_bit7.setVisibility(View.INVISIBLE);
                    iv_disenable_vio.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "false");
                } else {
                    iv_enable_vio.setVisibility(View.VISIBLE);
                    iv_disenable_vio.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "true");
                }
                */
                break;

            case R.id.re_bit4:
                /*
                if (re_bit7.getVisibility() == View.VISIBLE) {
                    re_bit7.setVisibility(View.INVISIBLE);
                    iv_disenable_vio.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "false");
                } else {
                    iv_enable_vio.setVisibility(View.VISIBLE);
                    iv_disenable_vio.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "true");
                }
                */
                break;

            case R.id.re_bit3:
                /*
                if (re_bit7.getVisibility() == View.VISIBLE) {
                    re_bit7.setVisibility(View.INVISIBLE);
                    iv_disenable_vio.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "false");
                } else {
                    iv_enable_vio.setVisibility(View.VISIBLE);
                    iv_disenable_vio.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "true");
                }
                */
                break;

            case R.id.re_bit2:
                /*
                if (re_bit7.getVisibility() == View.VISIBLE) {
                    re_bit7.setVisibility(View.INVISIBLE);
                    iv_disenable_vio.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "false");
                } else {
                    iv_enable_vio.setVisibility(View.VISIBLE);
                    iv_disenable_vio.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "true");
                }
                */
                break;

            case R.id.re_bit1:
                /*
                if (re_bit7.getVisibility() == View.VISIBLE) {
                    re_bit7.setVisibility(View.INVISIBLE);
                    iv_disenable_vio.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "false");
                } else {
                    iv_enable_vio.setVisibility(View.VISIBLE);
                    iv_disenable_vio.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "true");
                }
                */
                break;

            case R.id.re_bit0:
                /*
                if (re_bit7.getVisibility() == View.VISIBLE) {
                    re_bit7.setVisibility(View.INVISIBLE);
                    iv_disenable_vio.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "false");
                } else {
                    iv_enable_vio.setVisibility(View.VISIBLE);
                    iv_disenable_vio.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "true");
                }
                */
                break;
        }
    }
}
