package com.i5d5.basemodule.Utils;

import android.content.Context;
import android.content.SharedPreferences;

import com.i5d5.basemodule.DI.Qualifier.ApplicationContext;

import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * class_name: SPUtils
 * package_name: com.i5d5.basemodule.Utils
 * acthor: lucheng
 * time: 2017/4/7 14:35
 */
@Singleton
public class SPUtils {
    /**
     * ；临时文件管理类
     */
    //文件名为wuding_data
    public static final String FILE_NAME = "wuding_data";
    public static final String FIRST = "isFirst";//是否第一次打开
    public static final String LOGIN = "isLogin";//是否登录
    public static final String OPEN = "isOpen";//是否在打开状态
    public static final String INFO = "usInfo";
    public static final String ID = "usID";
    public static final String USNAME = "usName";
    public static final String USTOKEN = "usToken";
    public static final String LOCATION = "location";
    public static final String GOODS = "goods_id";
    public static final String AUTHOR = "author";

    private SharedPreferences preferences;
    private SharedPreferences.Editor edit;

    @Inject
    public SPUtils(@ApplicationContext Context context) {
        preferences = context.getSharedPreferences(FILE_NAME, Context.MODE_PRIVATE);
        edit = preferences.edit();
    }

    //第一次打开
    public void setIsFirst(boolean first) {
        edit.putBoolean(FIRST, first).commit();
    }

    public boolean getIsFirst() {
        return preferences.getBoolean(FIRST, true);
    }

    //第一次登录
    public void setIsLogin(boolean login) {
        edit.putBoolean(LOGIN, login).commit();
    }

    public boolean getIsLogin() {
        return preferences.getBoolean(LOGIN, false);
    }

    //用户ID
    public void setUsId(String usid) {
        edit.putString(ID, usid).commit();
    }

    public String getUsId() {
        return preferences.getString(ID, "");
    }

    //用户信息
    public void setUsInfo(String usinfo) {
        edit.putString(INFO, usinfo).commit();
    }

    public String getUsInfo() {
        return preferences.getString(INFO, "");
    }

    //用户昵称
    public void setUsName(String name) {
        edit.putString(USNAME, name).commit();
    }

    public String getUsName() {
        return preferences.getString(USNAME, "");
    }

    //用户token
    public void setUsToken(String token) {
        edit.putString(USTOKEN, token).commit();
    }

    public String getUsToken() {
        return preferences.getString(USTOKEN, "");
    }

    //用户头像地址
    public void setAuthor(String author) {
        edit.putString(AUTHOR, author).commit();
    }

    public String getAuthor() {
        return preferences.getString(AUTHOR, "");
    }

    //定位信息
    public void setLocation(String location) {
        edit.putString(LOCATION, location).commit();
    }

    public String getLocation() {
        return preferences.getString(LOCATION, "");
    }

    //app是否在打开状态
    public void setOpen(boolean open) {
        edit.putBoolean(OPEN, open).commit();
    }

    public boolean getOpen() {
        return preferences.getBoolean(OPEN, false);
    }


    //商品ID
    public void setGOods(String goodsId) {
        edit.putString(GOODS, goodsId).commit();
    }

    public String getGoods() {
        return preferences.getString(GOODS, "");
    }

    //退出用户清空数据
    public void edit() {
        setIsLogin(false);
        setUsId("");
        setUsInfo("");
        setUsName("");
        setUsToken("");
        setAuthor("");
    }
}
