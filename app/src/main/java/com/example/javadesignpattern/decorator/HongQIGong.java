package com.example.javadesignpattern.decorator;

public class HongQIGong extends Master {

    public HongQIGong(Swordsman swordsman) {
        super(swordsman);
    }

    @Override
    public void attackMagic() {
        super.attackMagic();
        System.out.println("洪七公教杨过打狗棒");
        System.out.println("杨过初始化打狗棒法");
    }

    @Override
    public void dancer() {

    }
}
