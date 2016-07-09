package com.coolweather.healthfod;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by ZongJie on 2016/7/9.
 */
public class About extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.about);
    }
}
