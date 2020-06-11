package com.example.javadesignpattern.state;

public interface Mp3State {
    void powerOn();

    void powerOff();

    void preSong();

    void nextSong();

    void powerSleep();

    void background();
}
