package com.example.javadesignpattern.factory;

/**
 * 具体的对象
 */
public class ThinkPadComputer implements Computer {
    @Override
    public void startCreat() {
        System.out.println("ThinkPadComputer 运行了");
    }
}
