package com.example.wangkai.test;

import android.app.Application;

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

    public synchronized MyApplication getInstance(){
        return mMyApplication;
    }

}
