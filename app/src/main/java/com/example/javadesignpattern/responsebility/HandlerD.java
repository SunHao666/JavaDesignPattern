package com.example.javadesignpattern.responsebility;

public class HandlerD extends HandlerReq {
    public HandlerD(Request request) {
        super(request);
    }

    @Override
    protected void hand(Request request) {
        System.out.println("HandlerD 处理了");
    }
}
