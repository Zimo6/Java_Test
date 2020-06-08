package com.demo01;

/***
 * 在任何版本java中，接口都能定义抽象方法
 *
 * 注意事项：
 * 1. 接口当中的抽象方法，修饰符必须是两个固定的关键字： public abstract
 * 2.这两个关键字修饰符，可以选择性省略
 */
public interface MyInterfaceAbstract {
    //抽象方法
    public abstract void methodAbs1();

    //这也是抽象方法
    abstract void methodAbs2();

    //这也是抽象方法
    public void methodAbs3();

    //这也是抽象方法
    void methodAbs4();

}
