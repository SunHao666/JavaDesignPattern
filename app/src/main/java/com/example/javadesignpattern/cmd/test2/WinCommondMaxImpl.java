package com.example.javadesignpattern.cmd.test2;

import com.example.javadesignpattern.cmd.test.IWindMachine;

public class WinCommondMaxImpl implements IWindCommond {

    WindReceive receive;

    public WinCommondMaxImpl(WindReceive receive) {
        this.receive = receive;
    }


    @Override
    public void excute() {
        receive.turnMax();
    }
}
