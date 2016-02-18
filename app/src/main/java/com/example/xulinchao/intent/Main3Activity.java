package com.example.xulinchao.intent;

import android.content.Intent;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Log.e("xlc","Main3Activity PID "+getTaskId()+"Activity 实例  "+Main3Activity.this.toString());
//        startActivity(new Intent(Main3Activity.this,MainActivity.class));

    }
}
