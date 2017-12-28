package com.skyworks.android.xxxworksapp.activity;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.skyworks.android.xxxworksapp.R;
import com.skyworks.android.xxxworksapp.activity.option.ControlOptions;

/**
 * @author dongpo on 2/22/2016.
 */
public class ControlActivity extends Activity implements OnClickListener {

    private static final String TAG = "ControlActivity";
    String enable_vio_string;
    String enable_extended_rw_string;
    String enable_high_reso_output_string;
    String high_output_reso_string;
    String output_voltage_string;
    String device_addr_hex_string;
    String rffe_frequency_string;
    String switching_frequency_string;
    String switching_mode_string;
    String bypass_pmos_string;
    String power_mode_string;
    private ControlOptions controlOptions;
    private RelativeLayout re_enable_vio;
    private RelativeLayout re_enable_extended_rw;
    private RelativeLayout re_enable_high_reso_output;
    private RelativeLayout re_high_reso_output;
    private RelativeLayout re_output_voltage;
    private RelativeLayout re_device_addr_hex;
    private RelativeLayout re_rffe_frequency;
    private RelativeLayout re_switching_frequency;
    private RelativeLayout re_switching_mode;
    private RelativeLayout re_bypass_pmos;
    private RelativeLayout re_power_mode;
    private ImageView iv_enable_vio;
    private ImageView iv_disenable_vio;
    private ImageView iv_enable_extended_rw;
    private ImageView iv_disenable_extended_rw;
    private ImageView iv_enable_high_reso_output;
    private ImageView iv_disenable_high_reso_output;
    private TextView tv_high_output_reso;
    private TextView tv_output_voltage;
    private TextView tv_device_addr_hex;
    private TextView tv_rffe_frequency;
    private TextView tv_switching_frequency;
    private TextView tv_switching_mode;
    private TextView tv_bypass_pmos;
    private TextView tv_power_mode;

    @Override
    public void onCreate(Bundle onSavedInstateState) {
        super.onCreate(onSavedInstateState);
        setContentView(R.layout.activity_control);
        initView();
    }

    private void initView() {
        enable_vio_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("enable_vio");
        enable_extended_rw_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("enable_extended");
        enable_high_reso_output_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("enable_high_reso_output");
        high_output_reso_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("high_output_reso");
        output_voltage_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("output_voltage");
        device_addr_hex_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("device_addr_hex");
        rffe_frequency_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("rffe_frequency");
        switching_frequency_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("switching_frequency");
        switching_mode_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("device_addr_hex");
        bypass_pmos_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("switching_mode");
        power_mode_string = ControlOptions.getInstance(ControlActivity.this).getControlOptions("power_mode");

        re_enable_vio = (RelativeLayout) this.findViewById(R.id.enable_vio);
        re_enable_extended_rw = (RelativeLayout) this.findViewById(R.id.enable_extended_rw);
        re_enable_high_reso_output = (RelativeLayout) this.findViewById(R.id.enable_high_reso_output);
        re_high_reso_output = (RelativeLayout) this.findViewById(R.id.high_reso_output);
        re_output_voltage = (RelativeLayout) this.findViewById(R.id.output_voltage);
        re_device_addr_hex = (RelativeLayout) this.findViewById(R.id.device_addr_hex);
        re_rffe_frequency = (RelativeLayout) this.findViewById(R.id.rffe_frequency);
        re_switching_frequency = (RelativeLayout) this.findViewById(R.id.switching_frequency);
        re_switching_mode = (RelativeLayout) this.findViewById(R.id.switching_mode);
        re_bypass_pmos = (RelativeLayout) this.findViewById(R.id.bypass_pmos);
        re_power_mode = (RelativeLayout) this.findViewById(R.id.power_mode);

        iv_enable_vio = (ImageView) this.findViewById(R.id.iv_enable_vio);
        iv_disenable_vio = (ImageView) this.findViewById(R.id.iv_disenable_vio);
        iv_enable_extended_rw = (ImageView) this.findViewById(R.id.iv_enable_extended_rw);
        iv_disenable_extended_rw = (ImageView) this.findViewById(R.id.iv_disenable_extended_rw);
        iv_enable_high_reso_output = (ImageView) this.findViewById(R.id.iv_enable_high_reso_output);
        iv_disenable_high_reso_output = (ImageView) this.findViewById(R.id.iv_disenable_high_reso_output);

        tv_high_output_reso = (TextView) this.findViewById(R.id.tv_high_output_reso);
        tv_output_voltage = (TextView) this.findViewById(R.id.tv_output_voltage);
        tv_device_addr_hex = (TextView) this.findViewById(R.id.tv_device_addr_hex);
        tv_rffe_frequency = (TextView) this.findViewById(R.id.tv_rffe_frequency);
        tv_switching_frequency = (TextView) this.findViewById(R.id.tv_switching_frequency);
        tv_switching_mode = (TextView) this.findViewById(R.id.tv_switching_mode);
        tv_bypass_pmos = (TextView) this.findViewById(R.id.tv_bypass_pmos);
        tv_power_mode = (TextView) this.findViewById(R.id.tv_power_mode);

        re_enable_vio.setOnClickListener(this);
        re_enable_extended_rw.setOnClickListener(this);
        re_enable_high_reso_output.setOnClickListener(this);
        re_output_voltage.setOnClickListener(this);
        re_high_reso_output.setOnClickListener(this);
        re_device_addr_hex.setOnClickListener(this);
        re_rffe_frequency.setOnClickListener(this);
        re_switching_frequency.setOnClickListener(this);
        re_switching_mode.setOnClickListener(this);
        re_bypass_pmos.setOnClickListener(this);
        re_power_mode.setOnClickListener(this);

        if (enable_vio_string.equals("true")) {
            iv_enable_vio.setVisibility(View.VISIBLE);
            iv_disenable_vio.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_vio.setVisibility(View.INVISIBLE);
            iv_disenable_vio.setVisibility(View.VISIBLE);
        }

        if (enable_extended_rw_string.equals("true")) {
            iv_enable_extended_rw.setVisibility(View.VISIBLE);
            iv_disenable_extended_rw.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_extended_rw.setVisibility(View.INVISIBLE);
            iv_disenable_extended_rw.setVisibility(View.VISIBLE);
        }

        if (enable_high_reso_output_string.equals("true")) {
            iv_enable_high_reso_output.setVisibility(View.VISIBLE);
            iv_disenable_high_reso_output.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_high_reso_output.setVisibility(View.INVISIBLE);
            iv_disenable_high_reso_output.setVisibility(View.VISIBLE);
        }

        if (high_output_reso_string.equals("1")) {
            tv_high_output_reso.setText("Low power mode");
        } else {
            tv_high_output_reso.setText("Standby mode");
        }

        if (output_voltage_string.equals("1")) {
            tv_output_voltage.setText("Low power mode");
        } else {
            tv_output_voltage.setText("Standby mode");
        }

        if (device_addr_hex_string.equals("1")) {
            tv_device_addr_hex.setText("00");
        } else {
            tv_device_addr_hex.setText("01");
        }

        if (rffe_frequency_string.equals("1")) {
            tv_rffe_frequency.setText("32 KHz");
        } else if (rffe_frequency_string.equals("2")) {
            tv_rffe_frequency.setText("50 KHz");
        } else if (rffe_frequency_string.equals("3")) {
            tv_rffe_frequency.setText("100 KHz");
        } else if (rffe_frequency_string.equals("4")) {
            tv_rffe_frequency.setText("200 KHz");
        } else if (rffe_frequency_string.equals("5")) {
            tv_rffe_frequency.setText("500 KHz");
        } else if (rffe_frequency_string.equals("6")) {
            tv_rffe_frequency.setText("1.0 MHz");
        } else if (rffe_frequency_string.equals("7")) {
            tv_rffe_frequency.setText("3.0 MHz");
        } else if (rffe_frequency_string.equals("8")) {
            tv_rffe_frequency.setText("26 MHz");
        }

        if (switching_frequency_string.equals("1")) {
            tv_switching_frequency.setText("2.5 MHz");
        } else if (switching_frequency_string.equals("2")) {
            tv_switching_frequency.setText("2.15 MHz");
        } else if (switching_frequency_string.equals("3")) {
            tv_switching_frequency.setText("2.00 MHz");
        } else if (switching_frequency_string.equals("4")) {
            tv_switching_frequency.setText("1.80 MHz");
        }

        if (switching_mode_string.equals("1")) {
            tv_switching_mode.setText("Automatic");
        } else {
            tv_switching_mode.setText("Forced PWM");
        }

        if (bypass_pmos_string.equals("1")) {
            tv_bypass_pmos.setText("Automatic");
        } else {
            tv_bypass_pmos.setText("Forced");
        }

        if (power_mode_string.equals("1")) {
            tv_power_mode.setText("Normal operation");
        } else if (power_mode_string.equals("2")) {
            tv_power_mode.setText("Restore default setting");
        } else if (power_mode_string.equals("3")) {
            tv_power_mode.setText("Low power mode");
        }

    }

    @Override
    public void onClick(View v) {
        Log.d(TAG, "enter onClick");

        switch (v.getId()) {
            case R.id.enable_vio:
                if (iv_enable_vio.getVisibility() == View.VISIBLE) {
                    iv_enable_vio.setVisibility(View.INVISIBLE);
                    iv_disenable_vio.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "false");
                } else {
                    iv_enable_vio.setVisibility(View.VISIBLE);
                    iv_disenable_vio.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", "true");
                }
                break;
            case R.id.enable_extended_rw:
                if (iv_enable_extended_rw.getVisibility() == View.VISIBLE) {
                    iv_enable_extended_rw.setVisibility(View.INVISIBLE);
                    iv_disenable_extended_rw.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_extended", "false");

                } else {
                    iv_enable_extended_rw.setVisibility(View.VISIBLE);
                    iv_disenable_extended_rw.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_extended", "true");
                }
                break;
            case R.id.enable_high_reso_output:
                if (iv_enable_high_reso_output.getVisibility() == View.VISIBLE) {
                    iv_enable_high_reso_output.setVisibility(View.INVISIBLE);
                    iv_disenable_high_reso_output.setVisibility(View.VISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_high_reso_output", "false");
                    re_high_reso_output.setVisibility(View.GONE);
                    re_output_voltage.setVisibility(View.VISIBLE);
                } else {
                    iv_enable_high_reso_output.setVisibility(View.VISIBLE);
                    iv_disenable_high_reso_output.setVisibility(View.INVISIBLE);
                    ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_high_reso_output", "true");
                    re_high_reso_output.setVisibility(View.VISIBLE);
                    re_output_voltage.setVisibility(View.GONE);
                }
                break;
            case R.id.high_reso_output:
                Log.d(TAG, "enter onClick high_output_reso");
                showHighOutputResoDialog();
                break;

            case R.id.output_voltage:
                Log.d(TAG, "enter onClick output_voltage");
                showOutputVoltageDialog();
                break;

            case R.id.device_addr_hex:
                Log.d(TAG, "enter onClick device_addr_hex");
                showDeviceAddrHexDialog();
                break;

            case R.id.rffe_frequency:
                Log.d(TAG, "enter onClick rffe_frequency");
                showRffeFrequencyDialog();
                break;

            case R.id.switching_frequency:
                Log.d(TAG, "enter onClick high_output_reso");
                showSwitchingFrequencyResoDialog();
                break;

            case R.id.switching_mode:
                Log.d(TAG, "enter onClick output_voltage");
                showSwitchingModeDialog();
                break;

            case R.id.bypass_pmos:
                Log.d(TAG, "enter onClick device_addr_hex");
                showBypassPmosDialog();
                break;
            case R.id.power_mode:
                Log.d(TAG, "enter onClick device_addr_hex");
                showPowerModelDialog();
                break;

            default:
                break;
        }
    }

    private void showDeviceAddrHexDialog() {
        final AlertDialog dlg = new AlertDialog.Builder(this).create();
        dlg.show();
        Window window = dlg.getWindow();
        window.setContentView(R.layout.alertdialog2paras);
        LinearLayout ll_title = (LinearLayout) window
                .findViewById(R.id.ll_title);
        ll_title.setVisibility(View.VISIBLE);
        TextView tv_title = (TextView) window.findViewById(R.id.tv_title);
        tv_title.setText("Device address hex");
        TextView tv_paizhao = (TextView) window.findViewById(R.id.tv_content1);
        tv_paizhao.setText("00");
        tv_paizhao.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!device_addr_hex_string.equals("1")) {
                    tv_device_addr_hex.setText("00");
                    update_device_addr_hex("1");
                }
                dlg.cancel();
            }
        });
        TextView tv_xiangce = (TextView) window.findViewById(R.id.tv_content2);
        tv_xiangce.setText("01");
        tv_xiangce.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!device_addr_hex_string.equals("2")) {
                    tv_device_addr_hex.setText("01");
                    update_device_addr_hex("2");
                }
                dlg.cancel();
            }
        });
    }

    private void showOutputVoltageDialog() {
        final AlertDialog dlg = new AlertDialog.Builder(this).create();
        dlg.show();
        Window window = dlg.getWindow();
        window.setContentView(R.layout.alertdialog2paras);
        LinearLayout ll_title = (LinearLayout) window
                .findViewById(R.id.ll_title);
        ll_title.setVisibility(View.VISIBLE);
        TextView tv_title = (TextView) window.findViewById(R.id.tv_title);
        tv_title.setText("Output voltage");
        TextView tv_paizhao = (TextView) window.findViewById(R.id.tv_content1);
        tv_paizhao.setText("Low power mode");
        tv_paizhao.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!output_voltage_string.equals("1")) {
                    tv_output_voltage.setText("Low power mode");
                    update_output_voltage("1");

                }
                dlg.cancel();
            }
        });
        TextView tv_xiangce = (TextView) window.findViewById(R.id.tv_content2);
        tv_xiangce.setText("Standby mode");
        tv_xiangce.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!output_voltage_string.equals("2")) {
                    tv_output_voltage.setText("Standby mode");
                    update_output_voltage("2");
                }
                dlg.cancel();
            }
        });
    }

    private void showHighOutputResoDialog() {
        final AlertDialog dlg = new AlertDialog.Builder(this).create();
        dlg.show();
        Window window = dlg.getWindow();
        window.setContentView(R.layout.alertdialog2paras);
        LinearLayout ll_title = (LinearLayout) window
                .findViewById(R.id.ll_title);
        ll_title.setVisibility(View.VISIBLE);
        TextView tv_title = (TextView) window.findViewById(R.id.tv_title);
        tv_title.setText("High Reso Output");
        TextView tv_paizhao = (TextView) window.findViewById(R.id.tv_content1);
        tv_paizhao.setText("Low power mode");
        tv_paizhao.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!high_output_reso_string.equals("1")) {
                    tv_high_output_reso.setText("Low power mode");
                    update_high_output_reso("1");
                }
                dlg.cancel();
            }
        });
        TextView tv_xiangce = (TextView) window.findViewById(R.id.tv_content2);
        tv_xiangce.setText("Standby mode");
        tv_xiangce.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!high_output_reso_string.equals("2")) {
                    tv_high_output_reso.setText("Standby mode");
                    update_high_output_reso("2");
                }
                dlg.cancel();
            }
        });
    }

    private void showRffeFrequencyDialog() {
        final AlertDialog dlg = new AlertDialog.Builder(this).create();
        dlg.show();
        Window window = dlg.getWindow();
        window.setContentView(R.layout.alertdialog8paras);
        LinearLayout ll_title = (LinearLayout) window
                .findViewById(R.id.ll_title);
        ll_title.setVisibility(View.VISIBLE);
        TextView tv_title = (TextView) window.findViewById(R.id.tv_title);
        tv_title.setText("RFFE frequency");

        TextView tv_1 = (TextView) window.findViewById(R.id.tv_content1);
        tv_1.setText("32 KHz");
        tv_1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!rffe_frequency_string.equals("1")) {
                    tv_rffe_frequency.setText("32 KHz");
                    update_rffe_frequency("1");

                }
                dlg.cancel();
            }
        });
        TextView tv_2 = (TextView) window.findViewById(R.id.tv_content2);
        tv_2.setText("50 KHz");
        tv_2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!rffe_frequency_string.equals("2")) {
                    tv_rffe_frequency.setText("50 KHz");
                    update_rffe_frequency("2");
                }
                dlg.cancel();
            }
        });
        TextView tv_3 = (TextView) window.findViewById(R.id.tv_content3);
        tv_3.setText("100 KHz");
        tv_3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!rffe_frequency_string.equals("3")) {
                    tv_rffe_frequency.setText("100 KHz");
                    update_rffe_frequency("3");

                }
                dlg.cancel();
            }
        });
        TextView tv_4 = (TextView) window.findViewById(R.id.tv_content4);
        tv_4.setText("200 KHz");
        tv_4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!rffe_frequency_string.equals("4")) {
                    tv_rffe_frequency.setText("200 KHz");
                    update_rffe_frequency("4");

                }
                dlg.cancel();
            }
        });

        TextView tv_5 = (TextView) window.findViewById(R.id.tv_content5);
        tv_5.setText("500 KHz");
        tv_5.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!rffe_frequency_string.equals("5")) {
                    tv_rffe_frequency.setText("500 KHz");
                    update_rffe_frequency("5");

                }
                dlg.cancel();
            }
        });
        TextView tv_6 = (TextView) window.findViewById(R.id.tv_content6);
        tv_6.setText("1.0 MHz");
        tv_6.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!rffe_frequency_string.equals("6")) {
                    tv_rffe_frequency.setText("1.0 MHz");
                    update_rffe_frequency("6");

                }
                dlg.cancel();
            }
        });
        TextView tv_7 = (TextView) window.findViewById(R.id.tv_content7);
        tv_7.setText("3.0 MHz");
        tv_7.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!rffe_frequency_string.equals("7")) {
                    tv_rffe_frequency.setText("3.0 MHz");
                    update_rffe_frequency("7");

                }
                dlg.cancel();
            }
        });
        TextView tv_8 = (TextView) window.findViewById(R.id.tv_content8);
        tv_8.setText("26 MHz");
        tv_8.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!rffe_frequency_string.equals("8")) {
                    tv_rffe_frequency.setText("26 MHz");
                    update_rffe_frequency("8");
                }
                dlg.cancel();
            }
        });


    }

    private void showSwitchingFrequencyResoDialog() {
        final AlertDialog dlg = new AlertDialog.Builder(this).create();
        dlg.show();
        Window window = dlg.getWindow();
        window.setContentView(R.layout.alertdialog4paras);
        LinearLayout ll_title = (LinearLayout) window
                .findViewById(R.id.ll_title);
        ll_title.setVisibility(View.VISIBLE);
        TextView tv_title = (TextView) window.findViewById(R.id.tv_title);
        tv_title.setText("Switching Frequency");

        TextView tv_1 = (TextView) window.findViewById(R.id.tv_content1);
        tv_1.setText("2.5 MHz");
        tv_1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!switching_frequency_string.equals("1")) {
                    tv_switching_frequency.setText("2.5 MHz");
                    update_switching_frequency("1");
                }
                dlg.cancel();
            }
        });
        TextView tv_2 = (TextView) window.findViewById(R.id.tv_content2);
        tv_2.setText("2.15 MHz");
        tv_2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!switching_frequency_string.equals("2")) {
                    tv_switching_frequency.setText("2.15 MHz");
                    update_switching_frequency("2");
                }
                dlg.cancel();
            }
        });

        TextView tv_3 = (TextView) window.findViewById(R.id.tv_content3);
        tv_3.setText("2.00 MHz");
        tv_3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!switching_frequency_string.equals("3")) {
                    tv_switching_frequency.setText("2.00 MHz");
                    update_switching_frequency("3");
                }
                dlg.cancel();
            }
        });
        TextView tv_4 = (TextView) window.findViewById(R.id.tv_content4);
        tv_4.setText("1.80 MHz");
        tv_4.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!switching_frequency_string.equals("4")) {
                    tv_switching_frequency.setText("1.80 MHz");
                    update_switching_frequency("4");
                }
                dlg.cancel();
            }
        });
    }

    private void showSwitchingModeDialog() {
        final AlertDialog dlg = new AlertDialog.Builder(this).create();
        dlg.show();
        Window window = dlg.getWindow();
        window.setContentView(R.layout.alertdialog2paras);
        LinearLayout ll_title = (LinearLayout) window
                .findViewById(R.id.ll_title);
        ll_title.setVisibility(View.VISIBLE);
        TextView tv_title = (TextView) window.findViewById(R.id.tv_title);
        tv_title.setText("Switching Mode");
        TextView tv_paizhao = (TextView) window.findViewById(R.id.tv_content1);
        tv_paizhao.setText("Automatic");
        tv_paizhao.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!switching_mode_string.equals("1")) {
                    tv_switching_mode.setText("Automatic");
                    update_switching_mode("1");
                }
                dlg.cancel();
            }
        });
        TextView tv_xiangce = (TextView) window.findViewById(R.id.tv_content2);
        tv_xiangce.setText("Forced PWM");
        tv_xiangce.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!switching_mode_string.equals("2")) {
                    tv_switching_mode.setText("Forced PWM");
                    update_switching_mode("2");
                }
                dlg.cancel();
            }
        });
    }

    private void showBypassPmosDialog() {
        final AlertDialog dlg = new AlertDialog.Builder(this).create();
        dlg.show();
        Window window = dlg.getWindow();
        window.setContentView(R.layout.alertdialog2paras);
        LinearLayout ll_title = (LinearLayout) window
                .findViewById(R.id.ll_title);
        ll_title.setVisibility(View.VISIBLE);
        TextView tv_title = (TextView) window.findViewById(R.id.tv_title);
        tv_title.setText("Bypass pmos");
        TextView tv_paizhao = (TextView) window.findViewById(R.id.tv_content1);
        tv_paizhao.setText("Automatic");
        tv_paizhao.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!bypass_pmos_string.equals("1")) {
                    tv_bypass_pmos.setText("Automatic");
                    update_bypass_pmos("1");
                }
                dlg.cancel();
            }
        });
        TextView tv_xiangce = (TextView) window.findViewById(R.id.tv_content2);
        tv_xiangce.setText("Forced");
        tv_xiangce.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!bypass_pmos_string.equals("2")) {
                    tv_bypass_pmos.setText("Forced");
                    update_bypass_pmos("2");
                }
                dlg.cancel();
            }
        });
    }

    private void showPowerModelDialog() {
        final AlertDialog dlg = new AlertDialog.Builder(this).create();
        dlg.show();
        Window window = dlg.getWindow();
        window.setContentView(R.layout.alertdialog3paras);
        LinearLayout ll_title = (LinearLayout) window
                .findViewById(R.id.ll_title);
        ll_title.setVisibility(View.VISIBLE);
        TextView tv_title = (TextView) window.findViewById(R.id.tv_title);
        tv_title.setText("Power mode");

        TextView tv_1 = (TextView) window.findViewById(R.id.tv_content1);
        tv_1.setText("Normal operation");
        tv_1.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                if (!power_mode_string.equals("1")) {
                    tv_power_mode.setText("Normal operation");
                    update_power_mode("1");
                }
                dlg.cancel();
            }
        });
        TextView tv_2 = (TextView) window.findViewById(R.id.tv_content2);
        tv_2.setText("Restore default setting");
        tv_2.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!power_mode_string.equals("2")) {
                    tv_power_mode.setText("Restore default setting");
                    update_power_mode("2");
                }
                dlg.cancel();
            }
        });
        TextView tv_3 = (TextView) window.findViewById(R.id.tv_content3);
        tv_3.setText("Low power mode");
        tv_3.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {

                if (!power_mode_string.equals("3")) {
                    tv_power_mode.setText("Low power mode");
                    update_power_mode("3");
                }
                dlg.cancel();
            }
        });
    }

    public void update_enable_vio(final String enable_vio) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_vio", enable_vio);
    }

    public void update_enable_extended_rw(final String enable_extended_rw) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_extended_rw", enable_extended_rw);
    }

    public void update_enable_high_reso_output(final String enable_high_reso_output) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("enable_high_reso_output", enable_high_reso_output);
    }

    public void update_high_output_reso(final String high_output_reso) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("high_output_reso", high_output_reso);
    }

    public void update_output_voltage(final String output_voltage) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("output_voltage", output_voltage);
    }

    public void update_device_addr_hex(final String device_addr_hex) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("device_addr_hex", device_addr_hex);
    }

    public void update_rffe_frequency(final String rffe_frequency) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("rffe_frequency", rffe_frequency);
    }

    public void update_switching_frequency(final String switching_frequency) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("switching_frequency", switching_frequency);
    }

    public void update_switching_mode(final String switching_mode) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("switching_mode", switching_mode);
    }

    public void update_bypass_pmos(final String bypass_pmos) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("bypass_pmos", bypass_pmos);
    }

    public void update_power_mode(final String power_mode) {
        ControlOptions.getInstance(ControlActivity.this).setControlOptions("power_mode", power_mode);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);

    }

    public void back(View view) {
        finish();
    }
}
