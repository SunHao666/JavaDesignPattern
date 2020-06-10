package com.example.javadesignpattern.mediator;

public class ShaoLin extends United {
    WuLinAlliance wuLinAlliance;
    public ShaoLin(WuLinAlliance wuLinAlliance) {
        super(wuLinAlliance);
        this.wuLinAlliance = wuLinAlliance;
    }

    public void sendNotice(){
        wuLinAlliance.notice("少林发来消息",this);
    }

    public void getNotice(String message){
        System.out.println(message);
    }
}
