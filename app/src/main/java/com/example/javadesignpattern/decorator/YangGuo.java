package com.example.javadesignpattern.decorator;
//被装饰着类
public class YangGuo extends Swordsman {

    @Override
    public void attackMagic() {
        System.out.println("杨过初始化全真剑法");
    }
}
