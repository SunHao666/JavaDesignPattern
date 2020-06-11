package com.example.javadesignpattern.state;

public class PowerOnState implements Mp3State {
    @Override
    public void powerOn() {
        System.out.println("已开机");
    }

    @Override
    public void powerOff() {
        System.out.println("关机");
    }

    @Override
    public void preSong() {
        System.out.println("上一首");
    }

    @Override
    public void nextSong() {
        System.out.println("下一首");
    }

    @Override
    public void powerSleep() {
        System.out.println("睡眠");
    }

    @Override
    public void background() {
        System.out.println("后台运行");
    }
}
