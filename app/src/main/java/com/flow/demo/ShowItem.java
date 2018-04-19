package com.flow.demo;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;

import java.util.Random;

/**
 * Created by Frank on 2018/4/19.
 */

public class ShowItem {

    public Drawable color;
    public String des;

    public ShowItem(String des) {
        this.des = des;
        color = getBack();
    }

    private Drawable getBack() {
        GradientDrawable drawable = new GradientDrawable();
        drawable.setCornerRadius(8);
        //动态设置不同的背景颜色
        drawable.setColor(Color.rgb(new Random().nextInt(255), new Random().nextInt(255), new Random().nextInt(255)));
        return drawable;
    }

}
