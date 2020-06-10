package com.example.javadesignpattern.mediator;

public class WuDang extends United {
    WuLinAlliance wuLinAlliance;
    public WuDang(WuLinAlliance wuLinAlliance) {
        super(wuLinAlliance);
        this.wuLinAlliance = wuLinAlliance;
    }

    public void sendNotice(){
        wuLinAlliance.notice("武当发来消息",this);
    }

    public void getNotice(String message){
        System.out.println(message);
    }
}
