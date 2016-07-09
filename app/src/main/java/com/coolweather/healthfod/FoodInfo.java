package com.coolweather.healthfod;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by ZongJie on 2016/7/9.
 */
public class FoodInfo extends ListActivity {
    @Bind(R.id.back)
    Button back;
    @Bind(R.id.button)
    Button button;
    @Bind(R.id.TextView03)
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_info);
        ButterKnife.bind(this);
        init();

    }
    public void init(){
        Bundle bundle=getIntent().getExtras();
        int drawable=bundle.getInt("drawable");
        String foodname=bundle.getString("foodname");
        String efoodname=bundle.getString("efoodnema");
        String foodinfos=bundle.getString("foodinfo");
        String[] efood=bundle.getStringArray("efood");
        String[] efoodinfo=bundle.getStringArray("efoodinfo");
        button.setBackgroundResource(drawable);
        textView.setText(foodinfos);
        List<Map<String,Object>> data=new ArrayList<Map<String,Object>>();
        for (int i=0;i<efood.length;i++){
            Map<String,Object> map=new HashMap<String,Object>();
            map.put("tv3",efood[i]);
            map.put("tv4",efoodinfo[i]);
            data.add(map);
        }
        SimpleAdapter simpleAdapter=new SimpleAdapter(this,data,R.layout.ex_food_info,new String[
                ]{"tv4","tv5"},new int[]{R.id.tv4,R.id.tv5});

        setListAdapter(simpleAdapter);
    }
    @OnClick(R.id.back)
    public void OnClick(){
        Intent intent=new Intent(this,FoodList.class);
        startActivity(intent);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        ButterKnife.unbind(this);
    }
}
