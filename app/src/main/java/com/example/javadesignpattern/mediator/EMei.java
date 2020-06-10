package com.example.javadesignpattern.mediator;

public class EMei extends United {
    WuLinAlliance wuLinAlliance;
    public EMei(WuLinAlliance wuLinAlliance) {
        super(wuLinAlliance);
        this.wuLinAlliance = wuLinAlliance;
    }

    public void sendNotice(){
        wuLinAlliance.notice("峨眉发来消息",this);
    }

    public void getNotice(String message){
        System.out.println(message);
    }
}
