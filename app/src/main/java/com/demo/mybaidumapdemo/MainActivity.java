package com.demo.mybaidumapdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_start_location = (Button)findViewById(R.id.start_location);
        btn_start_location.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BDLocationUtils bdLocationUtils = new BDLocationUtils(MainActivity.this);
                bdLocationUtils.doLocation();//开启定位
                bdLocationUtils.mLocationClient.start();//开始定位
            }
        });
    }
}
