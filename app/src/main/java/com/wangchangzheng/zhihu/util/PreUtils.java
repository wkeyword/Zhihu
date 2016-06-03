package com.wangchangzheng.zhihu.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * Created by wangchangzheng on 16/6/3.
 */
public class PreUtils {
    public static void putStringToDefault(Context context,String key,String value){
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(context);
        sp.edit().putString(key,value).commit();
    }

    public static String getStringFromDefault(Context context,String key,String defValue){
        SharedPreferences sp= PreferenceManager.getDefaultSharedPreferences(context);
        return sp.getString(key,defValue);
    }

}
