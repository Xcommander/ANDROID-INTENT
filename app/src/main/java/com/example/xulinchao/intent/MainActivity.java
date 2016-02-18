package com.example.xulinchao.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    public static final String XLC_ACTION="xlc";
    public static final String XLC_CAG="xlc";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        ((Button)findViewById(R.id.)).setOnClickListener(new View.OnClickListener() {
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


    }

}
