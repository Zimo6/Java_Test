package com.demo02;

/***
 * 对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾
 *
 */
public class Fu {
    //final修饰方法 不能被子类重写
    public final void  methodFinal(){
        System.out.println("Final修饰的父类方法执行");
    }

    //普通方法
    public  void  method(){
        System.out.println("父类方法执行");
    }
}
