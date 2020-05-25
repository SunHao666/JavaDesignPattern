package com.example.javadesignpattern.formwork;

import android.util.Log;

/**
 * 模板模式
 */
public abstract class BaseActivity {

    public BaseActivity() {
        //按照一定顺序的模板，子类重写
        initData();
        initView();
        initPresenter();
    }
    //静态方法
    protected abstract void initPresenter();

    protected abstract void initView();

    protected abstract void initData();

    public void showLoading(){
        Log.e("taga","loading.....");
    }
}
