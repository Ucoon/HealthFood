package com.coolweather.healthfod;

/**
 * Created by ZongJie on 2016/7/10.
 */
public class Food {
    private String tv1;
    private String tv2;
    private int ivId;
    public Food(int ivId,String tv1,String tv2){
        this.ivId=ivId;
        this.tv1=tv1;
        this.tv2=tv2;
    }

    public String getTv1() {
        return tv1;
    }


    public String getTv2() {
        return tv2;
    }


    public int getIvId() {
        return ivId;
    }

}
