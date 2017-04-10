package com.xiaoyouzi.testdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.util.Log;
import android.widget.TextView;

import com.xiaoyouzi.testdemo.utils.CustomTagHandler;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static String testHtml = "<html><body><div style=\"font-size:0;\">\n" +
            "  <span style=\"font-size:18px;\">&yen;</span>\n" +
            "  <span style=\"font-size:24px;\">120</span>\n" +
            "  <span style=\"font-size:16px;\">.9</span>\n" +
            "</div></body></html>";


    private List<EcoHtmlPrice> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView title = (TextView) findViewById(R.id.title);

//        title.setText(Html.fromHtml("<font color='red' size='24'>你好</font>"));

        list.add(new EcoHtmlPrice("32", "&yen;"));
        list.add(new EcoHtmlPrice("44", "120."));
        list.add(new EcoHtmlPrice("26", "9"));
        Spannable span = new SpannableString("¥120.8");
        span.setSpan(new AbsoluteSizeSpan(32), 0, 1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(new AbsoluteSizeSpan(99), 1, 4, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        span.setSpan(new AbsoluteSizeSpan(26), 4, 5, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);


        title.setText(Html.fromHtml(testHtml, null, new CustomTagHandler(this,title.getTextColors())));
    }


    public static Spanned ecoHtml(List<EcoHtmlPrice> list) {
        if (list != null && list.size() > 0) {
            StringBuffer sb = new StringBuffer();
            sb.append("<div style=\"font-size:0;\">");
            for (int i = 0; i < list.size(); i++) {//遍历list
                sb.append("<span style=\"font-size:");
                sb.append(list.get(i).getFontSize());
                sb.append("px;\">");
                sb.append(list.get(i).getStrValue());
                sb.append("</span>");
            }
            sb.append("</div>");
            Log.i("EcoHtmlUtils", sb.toString());
            return Html.fromHtml(sb.toString());
        }
        return Html.fromHtml("");
    }


}
