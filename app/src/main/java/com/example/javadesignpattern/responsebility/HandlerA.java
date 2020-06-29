package com.example.javadesignpattern.responsebility;

public class HandlerA extends Handler {
    @Override
    public void handRequest(String request) {
        if(request.equals("reqA")){
            System.out.println("HnadlerA 处理了消息"+request);
            return;
        }

        this.mNextHandler.handRequest(request);
    }
}
