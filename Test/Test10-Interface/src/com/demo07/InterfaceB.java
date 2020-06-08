package com.demo07;

/***
 *
 * 1.接口是没有静态代码块或者构造方法的
 *
 *
 * 2.一个类的直接父类是唯一的，但是一个类可以同时实现多个接口
 *
 * 格式：
 *      public class implements InterfaceA,InterFace{
 *          //重写所有抽象方法
 *      }
 */
public interface InterfaceB {
    public abstract void methodB();

    //同名方法
    public abstract void methodAbs();

    //同名默认方法
    public default void methodDefault(){
        System.out.println("B的默认方法");
    }

}
