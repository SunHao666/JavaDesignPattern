package com.example.javadesignpattern.cmd;

/**
 * 具体命令
 */
public class CommondImpl implements ICommond {

    Receive receive = new Receive();

    @Override
    public void excute() {
        this.receive.action("18");
    }
}
