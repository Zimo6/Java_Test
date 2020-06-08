package com.demo02;

/***
 *  实现类 A
 */
public class MyInterfaceDefaultA implements MyInterfaceDefault{
    @Override
    public void method() {
        System.out.println("实现了接口 AAAAAA");
    }

    @Override
    public void defaultmrthod(){
        System.out.println("重写了接口的默认方法");
    }
}
