package com.example.javadesignpattern.state;

public class Mp3Context {
    Mp3State mp3State;

    public void setMp3State(Mp3State state){
        this.mp3State = state;
    }

    public void powerOn(){
        mp3State.powerOn();
        setMp3State(new PowerOnState());
    }

    public void powerOff(){
        mp3State.powerOff();
        setMp3State(new PowerOffState());
    }

    public void preSong(){
        mp3State.preSong();
    }

    public void nextSong(){
        mp3State.nextSong();
    }
}
