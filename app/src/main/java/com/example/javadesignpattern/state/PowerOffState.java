package com.example.javadesignpattern.state;

public class PowerOffState implements Mp3State {
    @Override
    public void powerOn() {
        System.out.println("开机");
    }

    @Override
    public void powerOff() {
        System.out.println("关机");
    }

    @Override
    public void preSong() {

    }

    @Override
    public void nextSong() {

    }

    @Override
    public void powerSleep() {

    }

    @Override
    public void background() {

    }
}
