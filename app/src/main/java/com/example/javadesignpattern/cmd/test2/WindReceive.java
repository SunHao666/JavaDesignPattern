package com.example.javadesignpattern.cmd.test2;

/**
 * 接收者
 */
public class WindReceive {

    public void turnMax(){
        System.out.println("强风");
    }

    public void turnMin(){
        System.out.println("弱风");
    }

    public void turnMid(){
        System.out.println("中风");
    }

    public void turnClose(){
        System.out.println("关闭");
    }
}
