package com.skyworks.android.xxxworksapp.activity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.skyworks.android.xxxworksapp.R;
import com.skyworks.android.xxxworksapp.activity.option.TriggerOptions;

/**
 * Created by dongpo on 2/22/2016.
 */
public class TriggerActivity extends Activity implements View.OnClickListener {

    String enable_all_triggers_mask_string;
    String enable_trigger_mask0_string;
    String enable_trigger_mask1_string;
    String enable_trigger_mask2_string;
    String enable_trigger_mask3_string;
    String enable_auto_triggers_string;
    String enable_all_triggers_string;
    String enable_trigger0_string;
    String enable_trigger1_string;
    String enable_trigger2_string;
    private RelativeLayout enable_all_triggers_mask;
    private RelativeLayout enable_trigger_mask0;
    private RelativeLayout enable_trigger_mask1;
    private RelativeLayout enable_trigger_mask2;
    private RelativeLayout enable_trigger_mask3;
    private RelativeLayout enable_auto_triggers;
    private RelativeLayout enable_all_triggers;
    private RelativeLayout enable_trigger0;
    private RelativeLayout enable_trigger1;
    private RelativeLayout enable_trigger2;
    private ImageView iv_enable_all_triggers_mask;
    private ImageView iv_disenable_all_triggers_mask;
    private ImageView iv_enable_trigger_mask0;
    private ImageView iv_disenable_trigger_mask0;
    private ImageView iv_enable_trigger_mask1;
    private ImageView iv_disenable_trigger_mask1;
    private ImageView iv_enable_trigger_mask2;
    private ImageView iv_disenable_trigger_mask2;
    private ImageView iv_enable_trigger_mask3;
    private ImageView iv_disenable_trigger_mask3;
    private ImageView iv_enable_auto_triggers;
    private ImageView iv_disenable_auto_triggers;
    private ImageView iv_enable_all_triggers;
    private ImageView iv_disenable_all_triggers;
    private ImageView iv_enable_trigger0;
    private ImageView iv_disenable_trigger0;
    private ImageView iv_enable_trigger1;
    private ImageView iv_disenable_trigger1;
    private ImageView iv_enable_trigger2;
    private ImageView iv_disenable_trigger2;

    @Override
    public void onCreate(Bundle onSavedInstateState) {
        super.onCreate(onSavedInstateState);
        setContentView(R.layout.activity_trigger);
        initView();
    }

    private void initView() {

        enable_all_triggers_mask_string = TriggerOptions.getInstance(TriggerActivity.this).getTriggerOptions("enable_all_triggers_mask");
        enable_trigger_mask0_string = TriggerOptions.getInstance(TriggerActivity.this).getTriggerOptions("enable_trigger_mask0");
        enable_trigger_mask1_string = TriggerOptions.getInstance(TriggerActivity.this).getTriggerOptions("enable_trigger_mask1");
        enable_trigger_mask2_string = TriggerOptions.getInstance(TriggerActivity.this).getTriggerOptions("enable_trigger_mask2");
        enable_trigger_mask3_string = TriggerOptions.getInstance(TriggerActivity.this).getTriggerOptions("enable_trigger_mask3");
        enable_auto_triggers_string = TriggerOptions.getInstance(TriggerActivity.this).getTriggerOptions("enable_auto_triggers");
        enable_all_triggers_string = TriggerOptions.getInstance(TriggerActivity.this).getTriggerOptions("enable_all_triggers");
        enable_trigger0_string = TriggerOptions.getInstance(TriggerActivity.this).getTriggerOptions("enable_trigger0");
        enable_trigger1_string = TriggerOptions.getInstance(TriggerActivity.this).getTriggerOptions("enable_trigger1");
        enable_trigger2_string = TriggerOptions.getInstance(TriggerActivity.this).getTriggerOptions("enable_trigger2");

        enable_all_triggers_mask = (RelativeLayout) this.findViewById(R.id.set_all_trigger_masks);
        enable_trigger_mask0 = (RelativeLayout) this.findViewById(R.id.set_trigger_mask0);
        enable_trigger_mask1 = (RelativeLayout) this.findViewById(R.id.set_trigger_mask1);
        enable_trigger_mask2 = (RelativeLayout) this.findViewById(R.id.set_trigger_mask2);
        enable_trigger_mask3 = (RelativeLayout) this.findViewById(R.id.set_trigger_mask3);
        enable_auto_triggers = (RelativeLayout) this.findViewById(R.id.set_auto_triggers);
        enable_all_triggers = (RelativeLayout) this.findViewById(R.id.set_all_triggers);
        enable_trigger0 = (RelativeLayout) this.findViewById(R.id.set_trigger0);
        enable_trigger1 = (RelativeLayout) this.findViewById(R.id.set_trigger1);
        enable_trigger2 = (RelativeLayout) this.findViewById(R.id.set_trigger2);

        iv_enable_all_triggers_mask = (ImageView) this.findViewById(R.id.iv_enable_set_all_trigger_masks);
        iv_disenable_all_triggers_mask = (ImageView) this.findViewById(R.id.iv_disenable_set_all_trigger_masks);
        iv_enable_trigger_mask0 = (ImageView) this.findViewById(R.id.iv_enable_set_trigger_mask0);
        iv_disenable_trigger_mask0 = (ImageView) this.findViewById(R.id.iv_disenable_set_trigger_mask0);
        iv_enable_trigger_mask1 = (ImageView) this.findViewById(R.id.iv_enable_set_trigger_mask1);
        iv_disenable_trigger_mask1 = (ImageView) this.findViewById(R.id.iv_disenable_set_trigger_mask1);
        iv_enable_trigger_mask2 = (ImageView) this.findViewById(R.id.iv_enable_set_trigger_mask2);
        iv_disenable_trigger_mask2 = (ImageView) this.findViewById(R.id.iv_disenable_set_trigger_mask2);
        iv_enable_trigger_mask3 = (ImageView) this.findViewById(R.id.iv_enable_set_trigger_mask3);
        iv_disenable_trigger_mask3 = (ImageView) this.findViewById(R.id.iv_disenable_set_trigger_mask3);
        iv_enable_auto_triggers = (ImageView) this.findViewById(R.id.iv_enable_auto_triggers);
        iv_disenable_auto_triggers = (ImageView) this.findViewById(R.id.iv_disenable_auto_triggers);
        iv_enable_all_triggers = (ImageView) this.findViewById(R.id.iv_enable_set_all_trigger);
        iv_disenable_all_triggers = (ImageView) this.findViewById(R.id.iv_disenable_set_all_trigger);
        iv_enable_trigger0 = (ImageView) this.findViewById(R.id.iv_enable_set_trigger0);
        iv_disenable_trigger0 = (ImageView) this.findViewById(R.id.iv_disenable_set_trigger0);
        iv_enable_trigger1 = (ImageView) this.findViewById(R.id.iv_enable_set_trigger1);
        iv_disenable_trigger1 = (ImageView) this.findViewById(R.id.iv_disenable_set_trigger1);
        iv_enable_trigger2 = (ImageView) this.findViewById(R.id.iv_enable_set_trigger2);
        iv_disenable_trigger2 = (ImageView) this.findViewById(R.id.iv_disenable_set_trigger2);

        enable_all_triggers_mask.setOnClickListener(this);
        enable_trigger_mask0.setOnClickListener(this);
        enable_trigger_mask1.setOnClickListener(this);
        enable_trigger_mask2.setOnClickListener(this);
        enable_trigger_mask3.setOnClickListener(this);
        enable_auto_triggers.setOnClickListener(this);
        enable_all_triggers.setOnClickListener(this);
        enable_trigger0.setOnClickListener(this);
        enable_trigger1.setOnClickListener(this);
        enable_trigger2.setOnClickListener(this);

        if (enable_all_triggers_mask_string.equals("true")) {
            iv_enable_all_triggers_mask.setVisibility(View.VISIBLE);
            iv_disenable_all_triggers_mask.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_all_triggers_mask.setVisibility(View.INVISIBLE);
            iv_disenable_all_triggers_mask.setVisibility(View.VISIBLE);
        }

        if (enable_trigger_mask0_string.equals("true")) {
            iv_enable_trigger_mask0.setVisibility(View.VISIBLE);
            iv_disenable_trigger_mask0.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_trigger_mask0.setVisibility(View.INVISIBLE);
            iv_disenable_trigger_mask0.setVisibility(View.VISIBLE);
        }

        if (enable_trigger_mask1_string.equals("true")) {
            iv_enable_trigger_mask1.setVisibility(View.VISIBLE);
            iv_disenable_trigger_mask1.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_trigger_mask1.setVisibility(View.INVISIBLE);
            iv_disenable_trigger_mask1.setVisibility(View.VISIBLE);
        }

        if (enable_trigger_mask2_string.equals("true")) {
            iv_enable_trigger_mask2.setVisibility(View.VISIBLE);
            iv_disenable_trigger_mask2.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_trigger_mask2.setVisibility(View.INVISIBLE);
            iv_disenable_trigger_mask2.setVisibility(View.VISIBLE);
        }

        if (enable_trigger_mask3_string.equals("true")) {
            iv_enable_trigger_mask3.setVisibility(View.VISIBLE);
            iv_disenable_trigger_mask3.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_trigger_mask3.setVisibility(View.INVISIBLE);
            iv_disenable_trigger_mask3.setVisibility(View.VISIBLE);
        }

        if (enable_auto_triggers_string.equals("true")) {
            iv_enable_auto_triggers.setVisibility(View.VISIBLE);
            iv_disenable_auto_triggers.setVisibility(View.INVISIBLE);
            enable_all_triggers.setVisibility(View.VISIBLE);
            enable_trigger0.setVisibility(View.VISIBLE);
            enable_trigger1.setVisibility(View.VISIBLE);
            enable_trigger2.setVisibility(View.VISIBLE);
        } else {
            iv_enable_auto_triggers.setVisibility(View.INVISIBLE);
            iv_disenable_auto_triggers.setVisibility(View.VISIBLE);
            enable_all_triggers.setVisibility(View.GONE);
            enable_trigger0.setVisibility(View.GONE);
            enable_trigger1.setVisibility(View.GONE);
            enable_trigger2.setVisibility(View.GONE);
        }

        if (enable_all_triggers_string.equals("true")) {
            iv_enable_all_triggers.setVisibility(View.VISIBLE);
            iv_disenable_all_triggers.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_all_triggers.setVisibility(View.INVISIBLE);
            iv_disenable_all_triggers.setVisibility(View.VISIBLE);
        }

        if (enable_trigger0_string.equals("true")) {
            iv_enable_trigger0.setVisibility(View.VISIBLE);
            iv_disenable_trigger0.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_trigger0.setVisibility(View.INVISIBLE);
            iv_disenable_trigger0.setVisibility(View.VISIBLE);
        }

        if (enable_trigger1_string.equals("true")) {
            iv_enable_trigger1.setVisibility(View.VISIBLE);
            iv_disenable_trigger1.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_trigger1.setVisibility(View.INVISIBLE);
            iv_disenable_trigger1.setVisibility(View.VISIBLE);
        }

        if (enable_trigger2_string.equals("true")) {
            iv_enable_trigger2.setVisibility(View.VISIBLE);
            iv_disenable_trigger2.setVisibility(View.INVISIBLE);
        } else {
            iv_enable_trigger2.setVisibility(View.INVISIBLE);
            iv_disenable_trigger2.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.set_all_trigger_masks:
                if (iv_enable_all_triggers_mask.getVisibility() == View.VISIBLE) {
                    iv_enable_all_triggers_mask.setVisibility(View.INVISIBLE);
                    iv_disenable_all_triggers_mask.setVisibility(View.VISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_all_triggers_mask", "false");
                } else {
                    iv_enable_all_triggers_mask.setVisibility(View.VISIBLE);
                    iv_disenable_all_triggers_mask.setVisibility(View.INVISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_all_triggers_mask", "true");
                }
                break;
            case R.id.set_trigger_mask0:
                if (iv_enable_trigger_mask0.getVisibility() == View.VISIBLE) {
                    iv_enable_trigger_mask0.setVisibility(View.INVISIBLE);
                    iv_disenable_trigger_mask0.setVisibility(View.VISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger_mask0", "false");
                } else {
                    iv_enable_trigger_mask0.setVisibility(View.VISIBLE);
                    iv_disenable_trigger_mask0.setVisibility(View.INVISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger_mask0", "true");
                }
                break;
            case R.id.set_trigger_mask1:
                if (iv_enable_trigger_mask1.getVisibility() == View.VISIBLE) {
                    iv_enable_trigger_mask1.setVisibility(View.INVISIBLE);
                    iv_disenable_trigger_mask1.setVisibility(View.VISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger_mask1", "false");
                } else {
                    iv_enable_trigger_mask1.setVisibility(View.VISIBLE);
                    iv_disenable_trigger_mask1.setVisibility(View.INVISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger_mask1", "true");
                }
                break;
            case R.id.set_trigger_mask2:
                if (iv_enable_trigger_mask2.getVisibility() == View.VISIBLE) {
                    iv_enable_trigger_mask2.setVisibility(View.INVISIBLE);
                    iv_disenable_trigger_mask2.setVisibility(View.VISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger_mask2", "false");
                } else {
                    iv_enable_trigger_mask2.setVisibility(View.VISIBLE);
                    iv_disenable_trigger_mask2.setVisibility(View.INVISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger_mask2", "true");
                }
                break;
            case R.id.set_trigger_mask3:
                if (iv_enable_trigger_mask3.getVisibility() == View.VISIBLE) {
                    iv_enable_trigger_mask3.setVisibility(View.INVISIBLE);
                    iv_disenable_trigger_mask3.setVisibility(View.VISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger_mask3", "false");
                } else {
                    iv_enable_trigger_mask3.setVisibility(View.VISIBLE);
                    iv_disenable_trigger_mask3.setVisibility(View.INVISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger_mask3", "true");
                }
                break;
            case R.id.set_auto_triggers:
                if (iv_enable_auto_triggers.getVisibility() == View.VISIBLE) {
                    iv_enable_auto_triggers.setVisibility(View.INVISIBLE);
                    iv_disenable_auto_triggers.setVisibility(View.VISIBLE);
                    enable_all_triggers.setVisibility(View.GONE);
                    enable_trigger0.setVisibility(View.GONE);
                    enable_trigger1.setVisibility(View.GONE);
                    enable_trigger2.setVisibility(View.GONE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_auto_triggers", "false");

                } else {
                    iv_enable_auto_triggers.setVisibility(View.VISIBLE);
                    iv_disenable_auto_triggers.setVisibility(View.INVISIBLE);
                    enable_all_triggers.setVisibility(View.VISIBLE);
                    enable_trigger0.setVisibility(View.VISIBLE);
                    enable_trigger1.setVisibility(View.VISIBLE);
                    enable_trigger2.setVisibility(View.VISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_auto_triggers", "true");
                }
                break;
            case R.id.set_all_triggers:
                if (iv_enable_all_triggers.getVisibility() == View.VISIBLE) {
                    iv_enable_all_triggers.setVisibility(View.INVISIBLE);
                    iv_disenable_all_triggers.setVisibility(View.VISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_all_triggers", "false");
                } else {
                    iv_enable_all_triggers.setVisibility(View.VISIBLE);
                    iv_disenable_all_triggers.setVisibility(View.INVISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_all_triggers", "true");
                }
                break;
            case R.id.set_trigger0:
                if (iv_enable_trigger0.getVisibility() == View.VISIBLE) {
                    iv_enable_trigger0.setVisibility(View.INVISIBLE);
                    iv_disenable_trigger0.setVisibility(View.VISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger0", "false");
                } else {
                    iv_enable_trigger0.setVisibility(View.VISIBLE);
                    iv_disenable_trigger0.setVisibility(View.INVISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger0", "true");
                }
                break;
            case R.id.set_trigger1:
                if (iv_enable_trigger1.getVisibility() == View.VISIBLE) {
                    iv_enable_trigger1.setVisibility(View.INVISIBLE);
                    iv_disenable_trigger1.setVisibility(View.VISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger1", "false");
                } else {
                    iv_enable_trigger1.setVisibility(View.VISIBLE);
                    iv_disenable_trigger1.setVisibility(View.INVISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger1", "true");
                }
                break;
            case R.id.set_trigger2:
                if (iv_enable_trigger2.getVisibility() == View.VISIBLE) {
                    iv_enable_trigger2.setVisibility(View.INVISIBLE);
                    iv_disenable_trigger2.setVisibility(View.VISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger2", "false");
                } else {
                    iv_enable_trigger2.setVisibility(View.VISIBLE);
                    iv_disenable_trigger2.setVisibility(View.INVISIBLE);
                    TriggerOptions.getInstance(TriggerActivity.this).setTriggerOptions("enable_trigger2", "true");
                }
                break;

            default:
                break;
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        super.onSaveInstanceState(outState);

    }

    public void back(View view) {

        finish();
    }
}
