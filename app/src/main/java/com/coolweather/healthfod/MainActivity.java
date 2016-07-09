package com.coolweather.healthfod;

import android.app.Activity;

import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    @Bind(R.id.food_list)
    Button foodlist;
    @Bind(R.id.about)
    Button about;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
    @OnClick({R.id.food_list,R.id.about})
    public void OnClick(View v){
        switch (v.getId()){
            case R.id.food_list:
                Intent intent=new Intent(this,FoodList.class);
                startActivity(intent);
                break;
            case R.id.about:
                Intent intent2=new Intent(this,About.class);
                startActivity(intent2);
                break;
            default:
                break;
        }
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
