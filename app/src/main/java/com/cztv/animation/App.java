package com.cztv.animation;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 *
 * @author : BaoZhou
 * @date : 2019/1/31 2:08
 */
public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        ARouter.init(App.this);
    }
}
