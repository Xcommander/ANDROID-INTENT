package com.example.xulinchao.intent;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    public static final String XLC_ACTION="xlc";
    public static final String XLC_CAG="xlc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("xlc","MainActivity PID "+getTaskId()+"Activity 实例  "+MainActivity.this.toString());

        ((Button)findViewById(R.id.tzOne)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(){
                    {
                        setAction(MainActivity.XLC_ACTION);
                        addCategory("xlc2");
                    }
                });
            }
        });
        ((Button)findViewById(R.id.tzTwo)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(){
                    {
                        setAction(MainActivity.XLC_ACTION);
                        addCategory(MainActivity.XLC_CAG);
                        addFlags(FLAG_ACTIVITY_BROUGHT_TO_FRONT);
                    }
                });
            }
        });
        ((Button)findViewById(R.id.look)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(){
                    {
                        {
                            setAction(ACTION_MAIN);
                            addCategory(CATEGORY_HOME);
                        }
                    }
                });
            }
        });

        ((Button)findViewById(R.id.wap)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(){
                    {
                        {
                            setAction(ACTION_VIEW);
                            setData(Uri.parse("http://www.baidu.com"));
                        }
                    }
                });
            }
        });

        ((Button)findViewById(R.id.edit)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(){
                    {
                        {
                            setAction(ACTION_EDIT);
                            setData(Uri.parse("content://com.android.contacts/contacts/1"));
                        }
                    }
                });
            }
        });
        ((Button)findViewById(R.id.del)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(){
                    {
                        {
                            setAction(ACTION_DIAL);
                            setData(Uri.parse("tel:18817327151"));

                        }
                    }
                });
            }
        });


    }

}
