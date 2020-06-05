package com.example.javadesignpattern.decorator;

public abstract class Master extends Swordsman{

    public Swordsman swordsman;

    public Master(Swordsman swordsman){
        this.swordsman = swordsman;
    }

    /**
     * 调用目标类的方法
     */
    @Override
    public void attackMagic() {
        swordsman.attackMagic();
    }

    /**
     * 可以添加其他方法
     */
    public abstract void dancer();
}
