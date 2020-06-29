package com.example.javadesignpattern.cmd.test2;

public class WinCommondMinImpl implements IWindCommond {

    WindReceive receive;

    public WinCommondMinImpl(WindReceive receive) {
        this.receive = receive;
    }

    @Override
    public void excute() {

        receive.turnMin();
    }
}
