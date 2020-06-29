package com.example.javadesignpattern.responsebility;

/**
 * 请求
 * @param <T> 请求类型
 */
public abstract class Request<T> {

    protected T t;

    public Request(T t){
        this.t = t;
    }

    public T getRequest(){
        return t;
    }

    public abstract boolean isSame(Request<T> request);


}
