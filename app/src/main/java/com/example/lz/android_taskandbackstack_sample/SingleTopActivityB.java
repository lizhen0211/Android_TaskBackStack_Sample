package com.example.lz.android_taskandbackstack_sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleTopActivityB extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_top_b);
        Log.v("SingleTopActivityB", "onCreate");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.v("SingleTopActivityB", "onNewIntent");
        String comment = intent.getStringExtra("restart");
        Log.v("SingleTopActivityB", comment);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("SingleTopActivityB", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("SingleTopActivityB", "onResume");
    }

    public void reStartActivityB(View view) {
        Intent intent = new Intent(this, SingleTopActivityB.class);
        intent.putExtra("restart", "restart ActivityB");
        startActivity(intent);
    }
}
