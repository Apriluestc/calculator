package com.apriluestc.calaulator;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_results);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        TextView resultsText = (TextView) findViewById(R.id.text_results);
        resultsText.setText(getIntent().getStringExtra("results"));
    }

    @Override
    protected int setLayout() {
        return R.layout.activity_results;
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

    public static void actionStart(Context context, String results) {
        Intent intent = new Intent(context, ResultsActivity.class);
        intent.putExtra("results", results);
        context.startActivity(intent);

    }
}
