package com.example.wangkai.test;

import android.app.Application;
import android.content.Context;
import android.util.DisplayMetrics;
import android.app.Activity;
import android.view.WindowManager;

/**
 * Created by wangkai on 16/7/7.
 */
public class MyApplication extends Application{

    private MyApplication mMyApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mMyApplication = this;
    }
    public MyApplication getInstance(){
        if(mMyApplication == null){
            synchronized (MyApplication.class){
                if(mMyApplication == null){
                    mMyApplication = this;
                }
            }
        }
        return mMyApplication;
    }
    public void getPhoneWithAndHeight(){
        WindowManager windowManager = (WindowManager) this.getSystemService(Context.WINDOW_SERVICE);
        int width = windowManager.getDefaultDisplay().getWidth();
        int height = windowManager.getDefaultDisplay().getHeight();
        
    }

}
