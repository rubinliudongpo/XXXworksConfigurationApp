package com.skyworks.android.xxxworksapp.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.skyworks.android.xxxworksapp.R;
import com.skyworks.android.xxxworksapp.activity.option.DevicesStatusOptions;

/**
 * Created by dongpo on 2/22/2016.
 */
public class DevicestatusActivity extends Activity implements View.OnClickListener {

    private static final String TAG = "DevicestatusActivity";
    String enable_poll_device_status_every_string;
    String poll_device_status_frequency_string;
    String enable_check_fault_status_string;
    private RelativeLayout enable_poll_device_status_every;
    private RelativeLayout poll_device_status_frequency;
    private RelativeLayout enable_check_fault_status;
    private ImageView iv_enable_poll_device_status_every;
    private ImageView iv_disenable_poll_device_status_every;
    private ImageView iv_enable_check_fault_status;
    private ImageView iv_disenable_check_fault_status;
    private TextView tv_poll_device_status_frequency;

    @Override
    public void onCreate(Bundle onSavedInstateState) {
        super.onCreate(onSavedInstateState);
        setContentView(R.layout.activity_devicestatus);
        initView();
    }

    private void initView() {

        enable_poll_device_status_every_string = DevicesStatusOptions.getInstance(DevicestatusActivity.this).getDevicesStatusOptions("enable_poll_device_status_every");
        poll_device_status_frequency_string = DevicesStatusOptions.getInstance(DevicestatusActivity.this).getDevicesStatusOptions("poll_device_status_frequency");
        enable_check_fault_status_string = DevicesStatusOptions.getInstance(DevicestatusActivity.this).getDevicesStatusOptions("enable_check_fault_status");

        enable_poll_device_status_every = (RelativeLayout) this.findViewById(R.id.enable_poll_device_status_every);
        poll_device_status_frequency = (RelativeLayout) this.findViewById(R.id.poll_device_status_frequency);
        enable_check_fault_status = (RelativeLayout) this.findViewById(R.id.enable_check_fault_status);

        iv_enable_poll_device_status_every = (ImageView) this.findViewById(R.id.iv_enable_poll_device_status_every);
        iv_disenable_poll_device_status_every = (ImageView) this.findViewById(R.id.iv_disenable_poll_device_status_every);
        iv_enable_check_fault_status = (ImageView) this.findViewById(R.id.iv_enable_check_fault_status);
        iv_disenable_check_fault_status = (ImageView) this.findViewById(R.id.iv_disenable_check_fault_status);

        tv_poll_device_status_frequency = (TextView) this.findViewById(R.id.tv_poll_device_status_frequency);

        enable_poll_device_status_every.setOnClickListener(this);
        poll_device_status_frequency.setOnClickListener(this);
        enable_check_fault_status.setOnClickListener(this);

        if (enable_poll_device_status_every_string.equals("true")) {
            iv_enable_poll_device_status_every.setVisibility(View.VISIBLE);
            iv_disenable_poll_device_status_every.setVisibility(View.INVISIBLE);
            poll_device_status_frequency.setVisibility(View.VISIBLE);
            enable_check_fault_status.setVisibility(View.VISIBLE);
        } else {
            iv_enable_poll_device_status_every.setVisibility(View.INVISIBLE);
            iv_disenable_poll_device_status_every.setVisibility(View.VISIBLE);
            poll_device_status_frequency.setVisibility(View.GONE);
            enable_check_fault_status.setVisibility(View.GONE);
        }

        if (poll_device_status_frequency_string.equals("1")) {
            tv_poll_device_status_frequency.setText("1000ms");
        } else if (poll_device_status_frequency_string.equals("2")) {
            tv_poll_device_status_frequency.setText("1100ms");
        } else if (poll_device_status_frequency_string.equals("3")) {
            tv_poll_device_status_frequency.setText("1200ms");
        } else if (poll_device_status_frequency_string.equals("4")) {
            tv_poll_device_status_frequency.setText("1300ms");
        } else if (poll_device_status_frequency_string.equals("5")) {
            tv_poll_device_status_frequency.setText("1400ms");
        } else if (poll_device_status_frequency_string.equals("6")) {
            tv_poll_device_status_frequency.setText("1500ms");
        } else if (poll_device_status_frequency_string.equals("7")) {
            tv_poll_device_status_frequency.setText("1600ms");
        } else if (poll_device_status_frequency_string.equals("8")) {
            tv_poll_device_status_frequency.setText("1700ms");
        } else if (poll_device_status_frequency_string.equals("9")) {
            tv_poll_device_status_frequency.setText("1800ms");
        } else if (poll_device_status_frequency_string.equals("10")) {
            tv_poll_device_status_frequency.setText("1900ms");
        } else if (poll_device_status_frequency_string.equals("11")) {
            tv_poll_device_status_frequency.setText("2000ms");
        } else if (poll_device_status_frequency_string.equals("12")) {
            tv_poll_device_status_frequency.setText("2100ms");
        } else if (poll_device_status_frequency_string.equals("13")) {
            tv_poll_device_status_frequency.setText("2200ms");
        } else if (poll_device_status_frequency_string.equals("14")) {
            tv_poll_device_status_frequency.setText("2300ms");
        } else if (poll_device_status_frequency_string.equals("15")) {
            tv_poll_device_status_frequency.setText("2400ms");
        } else if (poll_device_status_frequency_string.equals("16")) {
            tv_poll_device_status_frequency.setText("2500ms");
        } else if (poll_device_status_frequency_string.equals("17")) {
            tv_poll_device_status_frequency.setText("2600ms");
        } else if (poll_device_status_frequency_string.equals("18")) {
            tv_poll_device_status_frequency.setText("2700ms");
        } else if (poll_device_status_frequency_string.equals("19")) {
            tv_poll_device_status_frequency.setText("2800ms");
        }

        if (enable_check_fault_status_string.equals("true")) {
            iv_enable_check_fault_status.setVisibility(View.VISIBLE);
            iv_disenable_check_fault_status.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_check_fault_status.setVisibility(View.INVISIBLE);
            iv_disenable_check_fault_status.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.enable_poll_device_status_every:
                if (iv_enable_poll_device_status_every.getVisibility() == View.VISIBLE) {
                    iv_enable_poll_device_status_every.setVisibility(View.INVISIBLE);
                    iv_disenable_poll_device_status_every.setVisibility(View.VISIBLE);
                    poll_device_status_frequency.setVisibility(View.GONE);
                    enable_check_fault_status.setVisibility(View.GONE);
                    DevicesStatusOptions.getInstance(DevicestatusActivity.this).setDevicesStatusOptions("enable_poll_device_status_every", "false");
                } else {
                    iv_enable_poll_device_status_every.setVisibility(View.VISIBLE);
                    iv_disenable_poll_device_status_every.setVisibility(View.INVISIBLE);
                    poll_device_status_frequency.setVisibility(View.VISIBLE);
                    enable_check_fault_status.setVisibility(View.VISIBLE);
                    DevicesStatusOptions.getInstance(DevicestatusActivity.this).setDevicesStatusOptions("enable_poll_device_status_every", "true");
                }
                break;
            case R.id.enable_check_fault_status:
                if (iv_enable_check_fault_status.getVisibility() == View.VISIBLE) {
                    iv_enable_check_fault_status.setVisibility(View.INVISIBLE);
                    iv_disenable_check_fault_status.setVisibility(View.VISIBLE);
                    DevicesStatusOptions.getInstance(DevicestatusActivity.this).setDevicesStatusOptions("enable_check_fault_status", "false");
                } else {
                    iv_enable_check_fault_status.setVisibility(View.VISIBLE);
                    iv_disenable_check_fault_status.setVisibility(View.INVISIBLE);
                    DevicesStatusOptions.getInstance(DevicestatusActivity.this).setDevicesStatusOptions("enable_check_fault_status", "true");
                }
                break;

            case R.id.poll_device_status_frequency:
                Log.d(TAG, "enter onClick output_voltage");
                showPollDeviceStatusFrequencyDialog();
                break;


            default:
                break;
        }
    }

    private void showPollDeviceStatusFrequencyDialog() {
        final AlertDialog dlg = new AlertDialog.Builder(this).create();
        dlg.show();
        Window window = dlg.getWindow();
        window.setContentView(R.layout.alertdialog19paras);
        LinearLayout ll_title = (LinearLayout) window
                .findViewById(R.id.ll_title);
        ll_title.setVisibility(View.VISIBLE);
        TextView tv_title = (TextView) window.findViewById(R.id.tv_title);
        tv_title.setText("Poll device status every");

        TextView tv_1 = (TextView) window.findViewById(R.id.tv_content1);
        tv_1.setText("1000ms");
        tv_1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("1")) {
                    tv_poll_device_status_frequency.setText("1000ms");
                    update_high_output_reso("1");
                }
                dlg.cancel();
            }
        });
        TextView tv_2 = (TextView) window.findViewById(R.id.tv_content2);
        tv_2.setText("1100ms");
        tv_2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (!poll_device_status_frequency_string.equals("2")) {
                    tv_poll_device_status_frequency.setText("1100ms");
                    update_high_output_reso("2");
                }
                dlg.cancel();
            }
        });
        TextView tv_3 = (TextView) window.findViewById(R.id.tv_content3);
        tv_3.setText("1200ms");
        tv_3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("3")) {
                    tv_poll_device_status_frequency.setText("1200ms");
                    update_high_output_reso("3");
                }
                dlg.cancel();
            }
        });
        TextView tv_4 = (TextView) window.findViewById(R.id.tv_content4);
        tv_4.setText("1300ms");
        tv_4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (!poll_device_status_frequency_string.equals("4")) {
                    tv_poll_device_status_frequency.setText("1300ms");
                    update_high_output_reso("4");
                }
                dlg.cancel();
            }
        });

        TextView tv_5 = (TextView) window.findViewById(R.id.tv_content5);
        tv_5.setText("1400ms");
        tv_5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("5")) {
                    tv_poll_device_status_frequency.setText("1400ms");
                    update_high_output_reso("5");
                }
                dlg.cancel();
            }
        });
        TextView tv_6 = (TextView) window.findViewById(R.id.tv_content6);
        tv_6.setText("1500ms");
        tv_6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (!poll_device_status_frequency_string.equals("6")) {
                    tv_poll_device_status_frequency.setText("1500ms");
                    update_high_output_reso("6");
                }
                dlg.cancel();
            }
        });
        TextView tv_7 = (TextView) window.findViewById(R.id.tv_content7);
        tv_7.setText("1600ms");
        tv_7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("7")) {
                    tv_poll_device_status_frequency.setText("1600ms");
                    update_high_output_reso("7");
                }
                dlg.cancel();
            }
        });
        TextView tv_8 = (TextView) window.findViewById(R.id.tv_content8);
        tv_8.setText("1700ms");
        tv_8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (!poll_device_status_frequency_string.equals("8")) {
                    tv_poll_device_status_frequency.setText("1700ms");
                    update_high_output_reso("8");
                }
                dlg.cancel();
            }
        });

        TextView tv_9 = (TextView) window.findViewById(R.id.tv_content9);
        tv_9.setText("1800ms");
        tv_9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("9")) {
                    tv_poll_device_status_frequency.setText("18000ms");
                    update_high_output_reso("9");
                }
                dlg.cancel();
            }
        });
        TextView tv_10 = (TextView) window.findViewById(R.id.tv_content10);
        tv_10.setText("1900ms");
        tv_10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (!poll_device_status_frequency_string.equals("10")) {
                    tv_poll_device_status_frequency.setText("1900ms");
                    update_high_output_reso("10");
                }
                dlg.cancel();
            }
        });
        TextView tv_11 = (TextView) window.findViewById(R.id.tv_content11);
        tv_11.setText("2000ms");
        tv_11.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("11")) {
                    tv_poll_device_status_frequency.setText("2000ms");
                    update_high_output_reso("11");
                }
                dlg.cancel();
            }
        });

        TextView tv_12 = (TextView) window.findViewById(R.id.tv_content12);
        tv_12.setText("2100ms");
        tv_12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (!poll_device_status_frequency_string.equals("12")) {
                    tv_poll_device_status_frequency.setText("2100ms");
                    update_high_output_reso("12");
                }
                dlg.cancel();
            }
        });
        TextView tv_13 = (TextView) window.findViewById(R.id.tv_content13);
        tv_13.setText("2200ms");
        tv_13.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("13")) {
                    tv_poll_device_status_frequency.setText("2200ms");
                    update_high_output_reso("13");
                }
                dlg.cancel();
            }
        });

        TextView tv_14 = (TextView) window.findViewById(R.id.tv_content14);
        tv_14.setText("2300ms");
        tv_14.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("14")) {
                    tv_poll_device_status_frequency.setText("2300ms");
                    update_high_output_reso("14");
                }
                dlg.cancel();
            }
        });

        TextView tv_15 = (TextView) window.findViewById(R.id.tv_content15);
        tv_15.setText("2400ms");
        tv_15.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (!poll_device_status_frequency_string.equals("15")) {
                    tv_poll_device_status_frequency.setText("2400ms");
                    update_high_output_reso("15");
                }
                dlg.cancel();
            }
        });
        TextView tv_16 = (TextView) window.findViewById(R.id.tv_content16);
        tv_16.setText("2500ms");
        tv_16.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("16")) {
                    tv_poll_device_status_frequency.setText("2500ms");
                    update_high_output_reso("16");
                }
                dlg.cancel();
            }
        });
        TextView tv_17 = (TextView) window.findViewById(R.id.tv_content17);
        tv_17.setText("2600ms");
        tv_17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                if (!poll_device_status_frequency_string.equals("17")) {
                    tv_poll_device_status_frequency.setText("2600ms");
                    update_high_output_reso("17");
                }
                dlg.cancel();
            }
        });
        TextView tv_18 = (TextView) window.findViewById(R.id.tv_content18);
        tv_18.setText("2700ms");
        tv_18.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("18")) {
                    tv_poll_device_status_frequency.setText("2700ms");
                    update_high_output_reso("18");
                }
                dlg.cancel();
            }
        });
        TextView tv_19 = (TextView) window.findViewById(R.id.tv_content19);
        tv_19.setText("2800ms");
        tv_19.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!poll_device_status_frequency_string.equals("19")) {
                    tv_poll_device_status_frequency.setText("2800ms");
                    update_high_output_reso("19");
                }
                dlg.cancel();
            }
        });
    }


    public void update_high_output_reso(final String poll_device_status_frequency) {
        DevicesStatusOptions.getInstance(DevicestatusActivity.this).setDevicesStatusOptions("poll_device_status_frequency", poll_device_status_frequency);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);

    }

    public void back(View view) {

        finish();
    }
}
