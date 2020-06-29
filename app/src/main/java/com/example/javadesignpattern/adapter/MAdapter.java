package com.example.javadesignpattern.adapter;

public class MAdapter extends AC220  implements IDC{

    @Override
    public int to12() {
        return super.to220()/12;
    }
}
