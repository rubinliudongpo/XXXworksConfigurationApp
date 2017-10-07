package com.skyworks.android.xxxworksapp.model;

import android.app.Application;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by dongpo on 2/25/2016.
 */
public class Logdata extends Application implements Parcelable {

    public static final Creator CREATOR = new Creator() {

        public Logdata createFromParcel(Parcel in) {

            return new Logdata();
        }

        public Logdata[] newArray(int size) {
            return new Logdata[size];
        }
    };
    private static int i = 1;
    private int logId;
    private Date logTime;
    private String opernation;
    private String addressHex;
    private String dataHex;
    private String note;

    public Logdata() {
        this.logId = i++;
        this.logTime = new Date();
        this.note = "log note here";
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public Date getLogdatatime() {
        return logTime;
    }

    public void setLogdatatime(Date logTime) {
        this.logTime = logTime;
    }

    public String getOpernation() {
        return opernation;
    }

    public void setOpernation(String opernation) {
        this.opernation = opernation;
    }

    public String getAddressHex() {
        return addressHex;
    }

    public void setAddressHex(String addressHex) {
        this.addressHex = addressHex;
    }

    public String getDataHex() {
        return dataHex;
    }

    public void setDataHex(String dataHex) {
        this.dataHex = dataHex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public int describeContents() {

        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
