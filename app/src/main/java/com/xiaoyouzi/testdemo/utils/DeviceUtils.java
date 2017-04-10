package com.xiaoyouzi.testdemo.utils;

import android.content.Context;

/**
 * Created by yangdehao@xiaoyouzi.com  on 2017/4/10 18:29
 */

public class DeviceUtils {

    public static int sp2px(Context context, float spValue) {
        float scale = context.getResources().getDisplayMetrics().scaledDensity;
        return (int)(spValue * scale + 0.5F);
    }

    public static int px2dip(Context context, float pxValue) {
        float scale = context.getResources().getDisplayMetrics().density;
        return (int)(pxValue / scale + 0.5F);
    }

}
