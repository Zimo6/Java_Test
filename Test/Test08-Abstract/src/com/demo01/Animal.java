package com.demo01;

/***
 * 抽象方法：就是加上abstract关键字，然后去掉大括号，直接分号结束。
 * 抽象类：抽象方法所在的类，必须是抽象类。
 *
 * 如何使用抽象类和抽象方法：
 * 1.不能直接创建new抽象类对象。
 * 2.必须用一个子类继承抽象父类。
 * 3.子类必须覆盖重写父类当中所有抽象方法。
 * 3.创建子类对象进行使用。
 */


public abstract class Animal {  //抽象类

    public abstract void eat(); //抽象方法

    public void normalMethod(){ //普通方法

    }
}
