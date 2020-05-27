package com.example.javadesignpattern.factory;


public class DellComputer implements Computer {
    @Override
    public void startCreat() {
        System.out.println("DellComputer 运行了");
    }
}
