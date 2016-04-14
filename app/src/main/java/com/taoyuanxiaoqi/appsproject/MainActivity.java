package com.taoyuanxiaoqi.appsproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.taoyuanxiaoqi.lib.Utils;

//import com.taoyuanxiaoqi.color.ColorUtil;
//import com.taoyuanxiaoqi.lib.Utils;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv = (TextView)findViewById(R.id.tv_app);
//        tv.setTextColor(ColorUtil.getConfigColor());
        tv.setText("App Projects " + Utils.getVersison());
    }
}
