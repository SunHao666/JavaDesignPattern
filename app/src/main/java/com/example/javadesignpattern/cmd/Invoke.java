package com.example.javadesignpattern.cmd;

/**
 * 请求类
 */
public class Invoke {

    private ICommond iCommond;

    public Invoke(ICommond iCommond) {
        this.iCommond = iCommond;
    }

    public void action(){
        this.iCommond.excute();
    }
}
