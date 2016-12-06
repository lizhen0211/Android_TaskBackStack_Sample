package com.example.lz.android_taskandbackstack_sample;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by lz on 2016/12/6.
 */

public class StandardActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v("StandardActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("StandardActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("StandardActivity", "onResume");
    }
}
