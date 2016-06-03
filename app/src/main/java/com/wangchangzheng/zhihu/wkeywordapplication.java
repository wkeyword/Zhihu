package com.wangchangzheng.zhihu;

import android.app.Application;
import android.content.Context;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

/**
 * Created by wangchangzheng on 16/6/3.
 */
public class wkeywordapplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initImageLoader(getApplicationContext());
    }

    private void initImageLoader(Context context) {
        /**
         * 图片加载
         */
        ImageLoaderConfiguration config=ImageLoaderConfiguration.createDefault(context);
        ImageLoader.getInstance().init(config);
    }
}
