package com.example.javadesignpattern.responsebility;

/**
 * 责任链模式
 * 将请求和处理解耦，使请求可传递
 */
public abstract class Handler {

    protected Handler mNextHandler;
    //设置下一个处理器
    public void setNextHandler(Handler mNextHandler){
        this.mNextHandler = mNextHandler;
    }
    //判断是否能够处理此消息 不能则传递给下一个
    public abstract void handRequest(String request);
}
