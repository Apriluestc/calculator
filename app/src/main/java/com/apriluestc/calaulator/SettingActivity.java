package com.apriluestc.calaulator;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.zcw.togglebutton.ToggleButton;

public class SettingActivity extends BaseActivity {

    ToggleButton toggleBtn;
    // boolean isDark = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // setContentView(R.layout.activity_setting);
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_setting;
    }

    @Override
    protected void initView() {
        toggleBtn = (ToggleButton) findViewById(R.id.tog_btn);
        toggleBtn.toggle();
        toggleBtn.setToggleOn();
        initToggleStatus();
        toggleBtn.setOnToggleChanged(new ToggleButton.OnToggleChanged(){
            @Override
            public void onToggle(boolean on) {
                // on true 打开 暗黑色
                // on false 关闭 白色
                preferences.edit().putBoolean("ToggleStatus", on).apply();
                // isDark = !isDark;
                recreate();
            }
        });

    }

    // rivate void toogle

    private void initToggleStatus() {
        if (preferences.getBoolean("ToggleStatus", true)) {
            toggleBtn.toggleOn();
        } else {
            toggleBtn.toggleOff();
        }
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void toogleTheme() {
        if (preferences.getBoolean("ToggleStatus", true)) {
            setTheme(R.style.AppTheme);
            // Toast.makeText(SettingActivity.this, "AppTheme", Toast.LENGTH_SHORT).show();
        } else {
            setTheme(R.style.MyAppTheme);
            // Toast.makeText(SettingActivity.this, "MyAppTheme", Toast.LENGTH_SHORT).show();
        }
    }

    public static void actionStart(Context context) {
        context.startActivity(new Intent(context, SettingActivity.class));
    }
}