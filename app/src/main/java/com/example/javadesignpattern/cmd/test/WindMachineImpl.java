package com.example.javadesignpattern.cmd.test;

public class WindMachineImpl implements IWindMachine {
    @Override
    public void turnHeight() {
        System.out.println("强风");
    }

    @Override
    public void turnCenter() {
        System.out.println("中风");
    }

    @Override
    public void turnLow() {
        System.out.println("弱风");
    }

    @Override
    public void close() {
        System.out.println("关闭");
    }
}
