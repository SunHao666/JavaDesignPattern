package com.example.javadesignpattern.responsebility;

public abstract class HandlerReq {

    private HandlerReq mNextHandler;
    private Request request;
    //默认可以处理的消息类型
    public HandlerReq(Request request) {
        this.request = request;
    }

    public void setNextHandler(HandlerReq mNextHandler) {
        this.mNextHandler = mNextHandler;
    }

    public void handrequest(Request request){
        //如果请求相同处理
        if(this.request.isSame(request)){
            this.hand(request);
            return;
        }

        if(mNextHandler != null){
            mNextHandler.handrequest(request);
        }
    }

    protected abstract void hand(Request request);


}
