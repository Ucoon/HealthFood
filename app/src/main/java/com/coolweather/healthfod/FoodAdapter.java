package com.coolweather.healthfod;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ZongJie on 2016/7/10.
 */
public class FoodAdapter extends ArrayAdapter<Food> {

    private int resourceId;

    public FoodAdapter(Context context, int textViewResourceId, List<Food> objects) {
        super(context, textViewResourceId, objects);
        resourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Food food = getItem(position);
        View view;
        ViewHolder viewHolder;
        if (convertView == null) {
            view = LayoutInflater.from(getContext()).inflate(resourceId, null);
            viewHolder = new ViewHolder();
            viewHolder.iv = (ImageView) view.findViewById(R.id.iv1);
            viewHolder.tv1 = (TextView) view.findViewById(R.id.tv1);
            viewHolder.tv2 = (TextView) view.findViewById(R.id.tv2);
            view.setTag(viewHolder);
        } else {
            view = convertView;
            viewHolder = (ViewHolder) view.getTag();
        }

        viewHolder.iv.setImageResource(food.getIvId());
        viewHolder.tv1.setText(food.getTv1());
        viewHolder.tv2.setText(food.getTv2());
        return view;
    }

    class ViewHolder {
        ImageView iv;
        TextView tv1;
        TextView tv2;
    }
}
