package com.example.lz.android_taskandbackstack_sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SingleTaskActivityC extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_task_c);
    }

    public void restartActivityB(View view) {
        Intent intent = new Intent(this, SingleTaskActivityB.class);
        startActivity(intent);
    }
}
