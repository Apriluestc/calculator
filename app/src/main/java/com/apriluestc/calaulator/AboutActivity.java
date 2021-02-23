package com.apriluestc.calaulator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class AboutActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_about;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void toogleTheme() {

    }

    public static void actionStart(Context context) {
        context.startActivity(new Intent(context, AboutActivity.class));
    }
}
