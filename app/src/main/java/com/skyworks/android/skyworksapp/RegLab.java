package com.skyworks.android.skyworksapp;

import android.content.Context;

import com.skyworks.android.skyworksapp.model.Reg;

import java.util.ArrayList;

/**
 * Created by dongpo on 2/26/2016.
 */
public class RegLab {

    private static RegLab sRegLab;
    private static String[] addrArray = {"00", "01", "03", "08", "1A", "1B", "1C", "1D", "1E", "1F", "21"};
    private static String[] nameArray = {"Output Voltage", "Switch Mode & Bypass", "High Resolution Output Voltage", "Fault Status", "RFFE Status", "Group ID", "Power Mode and Trigger", "Pruduct ID", "Manufacture ID", "User Programmer Slave ID", "Device Revision"};
    private static String[] reg1Array = {"", "VSET6", "VSET5", "VSET4", "VSET3", "VSET2", "VSET1", "VSET0"};
    private static String[] reg2Array = {"", "HRESV", "SMC", "BYP", "FSET1", "FSET1", "", ""};
    private static String[] reg3Array = {"HVSET7", "HVSE6", "HVSET5", "HVSET4", "HVSET3", "HVSET2", "HVSET1", "HVSET0"};
    private static String[] reg4Array = {"", "", "", "", "REG_OCF", "BVP_OCF", "OTF", "BYP_ST"};
    private static String[] reg5Array = {"RST", "CFP_ER", "CL_ER", "AFP_ER", "DFP_ER", "R_UNUSED", "W_UNUSED", "B_G_ER"};
    private static String[] reg6Array = {"", "", "", "", "GSID3", "GSID2", "GSID1", "GSID0"};
    private static String[] reg7Array = {"PW_MODE1", "PW_MODE0", "TRIG_MSK2", "TRIG_MSK1", "TRIG_MSK0", "TRIG2", "TRIG1", "TRIG0"};
    private static String[] reg8Array = {"PROD_ID7", "PROD_ID6", "PROD_ID5", "PROD_ID4", "PROD_ID3", "PROD_ID2", "PROD_ID1", "PROD_ID0"};
    private static String[] reg9Array = {"MFR_ID7", "MFR_ID6", "MFR_ID5", "MFR_ID4", "MFR_ID3", "MFR_ID2", "MFR_ID1", "MFR_ID0",};
    private static String[] reg10Array = {"", "", "MFR_ID9", "MFR_ID8", "USID3", "USID2", "USID1", "USID0"};
    private static String[] reg11Array = {"LOCK", "REV6", "REV5", "REV4", "REV3", "REV2", "REV1", "REV0"};
    private ArrayList<Reg> mReg;
    private Context mAppContext;

    private RegLab(Context appContext) {
        mAppContext = appContext;
        mReg = new ArrayList<Reg>();
        for (int i = 0; i < 100; i++) {
            Reg reg = new Reg();
            if (i % 2 == 0) {
                //reg.setAddressHex("0x00");
                //reg.setDataHex("0x000001");

            } else {
                //reg.setAddressHex("0x01");
                //reg.setDataHex("0x00000a");
            }
            mReg.add(reg);
        }
    }

    public static RegLab get(Context context) {
        if (sRegLab == null) {
            sRegLab = new RegLab(context.getApplicationContext());
        }
        return sRegLab;
    }

    public ArrayList<Reg> getmReg() {
        return mReg;
    }
}
