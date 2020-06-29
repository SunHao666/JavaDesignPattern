package com.example.javadesignpattern.responsebility;

public class HandlerB extends Handler {
    @Override
    public void handRequest(String request) {
        if(request.equals("reqB")){
            System.out.println("HnadlerB 处理了消息"+request);
            return;
        }
        this.mNextHandler.handRequest(request);
    }
}
