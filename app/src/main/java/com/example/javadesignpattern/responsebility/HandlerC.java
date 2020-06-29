package com.example.javadesignpattern.responsebility;

public class HandlerC extends HandlerReq {
    public HandlerC(Request request) {
        super(request);
    }

    @Override
    protected void hand(Request request) {
        System.out.println("HandlerC 处理了");
    }
}
