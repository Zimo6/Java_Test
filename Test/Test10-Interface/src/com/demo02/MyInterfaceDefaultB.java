package com.demo02;

/***
 * 实现类 B
 */
public class MyInterfaceDefaultB implements MyInterfaceDefault{
    @Override
    public void method() {
        defaultmrthod(); //这里可以直接访问上面接口的默认方法
        System.out.println("实现了接口 BBBBBB");
    }

}

