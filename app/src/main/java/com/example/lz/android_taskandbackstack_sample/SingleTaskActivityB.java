package com.example.lz.android_taskandbackstack_sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SingleTaskActivityB extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_b);
        Log.v("SingleTaskActivityB", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("SingleTaskActivityB", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("SingleTaskActivityB", "onResume");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.v("SingleTaskActivityB", "onNewIntent");
    }

    public void startActivityC(View view) {
        Intent intent = new Intent(this, SingleTaskActivityC.class);
        startActivity(intent);
    }


}
