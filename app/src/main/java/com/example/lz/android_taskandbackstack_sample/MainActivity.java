package com.example.lz.android_taskandbackstack_sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * 任务栈是一种后进先出的结构。位于栈顶的Activity处于焦点状态,当按下back按钮的时候,栈内的Activity会一个一个的出栈,并且调用其 onDestory() 方法。如果栈内没有Activity,那么系统就会回收这个栈,每个APP默认只有一个栈,以APP的包名来命名.
 * ◦standard : 标准模式,每次启动Activity都会创建一个新的Activity实例,并且将其压入任务栈栈顶,而不管这个Activity是否已经存在。Activity的启动三回调(onCreate()->onStart()->onResume())都会执行。
 * ◦singleTop : 栈顶复用模式.这种模式下,如果新Activity已经位于任务栈的栈顶,那么此Activity不会被重新创建,所以它的启动三回调就不会执行,同时Activity的 onNewIntent() 方法会被回调.如果Activity已经存在但是不在栈顶,那么作用与standard模式一样.
 * ◦singleTask: 栈内复用模式.创建这样的Activity的时候,系统会先确认它所需任务栈已经创建,否则先创建任务栈.然后放入Activity,如果栈中已经有一个Activity实例,那么这个Activity就会被调到栈顶, onNewIntent() ,并且singleTask会清理在当前Activity上面的所有Activity.(clear top)
 * ◦singleInstance : 加强版的singleTask模式,这种模式的Activity只能单独位于一个任务栈内,由于栈内复用的特性,后续请求均不会创建新的Activity,除非这个独特的任务栈被系统销毁了
 * <p>
 * <p>
 * Activity的堆栈管理以ActivityRecord为单位,所有的ActivityRecord都放在一个List里面.可以认为一个ActivityRecord就是一个Activity栈
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*   标准模式,每次启动Activity都会创建一个新的Activity实例,
        并且将其压入任务栈栈顶,而不管这个Activity是否已经存在。
        Activity的启动三回调(onCreate()->onStart()->onResume())都会执行。*/
    public void onStandardClick(View view) {
        Intent intent = new Intent(this, StandardActivity.class);
        startActivity(intent);
    }

    /*栈顶复用模式.这种模式下,如果新Activity已经位于任务栈的栈顶,
      那么此Activity不会被重新创建,所以它的启动三回调就不会执行,
      同时Activity的 onNewIntent() 方法会被回调.
      如果Activity已经存在但是不在栈顶,那么作用与standard模式一样*/
    public void onSingleTopClick(View view) {
        Intent intent = new Intent(this, SingleTopActivityA.class);
        startActivity(intent);
    }

    /*  栈内复用模式.创建这样的Activity的时候,系统会先确认它所需任务栈已经创建,
        否则先创建任务栈.然后放入Activity,如果栈中已经有一个Activity实例,
        那么这个Activity就会被调到栈顶, onNewIntent() ,
        并且singleTask会清理在当前Activity上面的所有Activity.(clear top)*/
    public void onSingleTaskClick(View view) {
        Intent intent = new Intent(this, SingleTaskActivityA.class);
        startActivity(intent);
    }

    /*  加强版的singleTask模式,这种模式的Activity只能单独位于一个任务栈内,
        由于栈内复用的特性,后续请求均不会创建新的Activity,除非这个独特的任务栈被系统销毁了*/
    public void onSingleInstanceClick(View view) {
        Intent intent = new Intent(this, SingleInstanceActivity.class);
        startActivity(intent);
    }
}
