package com.example.javadesignpattern.prototype;

import androidx.annotation.NonNull;

public class Info implements Cloneable{
    public String name;
    public String address;
    public Info(String name,String address) {
        this.address = address;
        this.name = name;
    }

    @NonNull
    @Override
    public Info clone(){
        Info info = null;
        try {
             info = (Info) Info.super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return info;

    }

    @Override
    public String toString() {
        return "Info{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
