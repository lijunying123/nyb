package com.example.lijy.nyb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.RelativeSizeSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView tv= (TextView) findViewById(R.id.tv);
        SpannableString spannableString=new SpannableString("聂雁宾是大帅哥");
        RelativeSizeSpan s1=new RelativeSizeSpan(1.2f);
        RelativeSizeSpan s2=new RelativeSizeSpan(1.4f);
        RelativeSizeSpan s3=new RelativeSizeSpan(1.6f);
        RelativeSizeSpan s4=new RelativeSizeSpan(1.8f);
        RelativeSizeSpan s5=new RelativeSizeSpan(1.6f);
        RelativeSizeSpan s6=new RelativeSizeSpan(1.4f);
        RelativeSizeSpan s7=new RelativeSizeSpan(1.2f);
        spannableString.setSpan(s1,0,1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(s2,1,2, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(s3,2,3, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(s4,3,4, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(s5,4,5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(s6,5,6, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(s7,6,7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        tv.setText(spannableString);
    }
}
