package com.example.android.rabbit.appstart;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by sagar_000 on 11/23/2015.
 */
public class SmsViewPager extends  ViewPager{

    public SmsViewPager(Context context) {
        super(context);
    }

    public SmsViewPager (Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    public boolean onInterceptTouchEvent (MotionEvent event){
        //Never allow swiping to switch between pages
        return false;
    }

    @Override
    public boolean onTouchEvent (MotionEvent event){
        //Never allow swiping to switch between pages
        return false;
    }
}
