package com.demo01;

/***
 * 当final关键字修饰一个类的时候
 * public final class 类名称{
 *     //....
 * }
 * 含义：当前这个类不能有任何子类。（太监类）（有父类，最起码有Object）
 *
 *  注意： 一个类如果是final类，那么其中所有的成员方法都无法进行重写（因为没儿子）
 */
public final class MyClass {
    public void method(){
        System.out.println("我是fina类的方法");
    }
}
