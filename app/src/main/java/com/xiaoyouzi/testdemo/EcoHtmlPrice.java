package com.xiaoyouzi.testdemo;

/**
 * 淘抢购价格样式
 * Created by yangdehao@xiaoyouzi.com  on 2017/4/10 14:15
 */

public class EcoHtmlPrice {
    String mFontSize;
    String mStrValue;

    public EcoHtmlPrice(String fontSize, String strValue) {
        this.mFontSize = fontSize;
        this.mStrValue = strValue;
    }

    public String getFontSize() {
        return mFontSize;
    }

    public void setFontSize(String fontSize) {
        mFontSize = fontSize;
    }

    public String getStrValue() {
        return mStrValue;
    }

    public void setStrValue(String strValue) {
        mStrValue = strValue;
    }
}
