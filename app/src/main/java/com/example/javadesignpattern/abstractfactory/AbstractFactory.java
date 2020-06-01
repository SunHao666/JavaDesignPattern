package com.example.javadesignpattern.abstractfactory;

import android.provider.ContactsContract;

/**
 * 抽象Factory
 * 为每个公司创建对应的Factory
 * 优点：相比在一个类中添加创建不同产品方法，这种更能体现单一原则
 * 缺点：新的产品还需改动抽象Factory
 */
public abstract class AbstractFactory {

   public abstract Computer creatComputer(Class<?> clz);

   public abstract NoteComputer creatNote(Class<?> clz);
}
