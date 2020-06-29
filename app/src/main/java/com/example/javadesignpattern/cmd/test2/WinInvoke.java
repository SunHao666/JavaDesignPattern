package com.example.javadesignpattern.cmd.test2;

import com.example.javadesignpattern.cmd.Receive;

/**
 * 请求类
 */
public class WinInvoke {

    IWindCommond commond;


    public WinInvoke(IWindCommond commond) {
        this.commond = commond;
    }


    public void action(){
        commond.excute();
    }
}
