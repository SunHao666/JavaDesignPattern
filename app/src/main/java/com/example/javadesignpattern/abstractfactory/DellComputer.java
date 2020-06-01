package com.example.javadesignpattern.abstractfactory;


public class DellComputer implements Computer {
    @Override
    public void startCreat() {
        System.out.println("DellComputer 运行了");
    }
}
