package com.ryan.weexandroiddemo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.taobao.weex.InitConfig;
import com.taobao.weex.WXSDKEngine;

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        InitConfig config = new InitConfig.Builder().setImgAdapter(new FrescoImageAdapter()).build();
        WXSDKEngine.initialize(this, config);

        Fresco.initialize(this);

    }
}
