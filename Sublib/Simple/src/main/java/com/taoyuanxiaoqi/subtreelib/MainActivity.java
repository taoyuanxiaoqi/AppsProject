package com.taoyuanxiaoqi.subtreelib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.taoyuanxiaoqi.lib.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)findViewById(R.id.tv_simple);
        tv.setText("this is simple " + Utils.getVersison());
    }
}
