package com.demo02;

public class Demo02Interface {
    public static void main(String[] args) {
        MyInterfaceDefaultA a = new MyInterfaceDefaultA();
        a.method();

        //默认方法会被实现类 继承下去
        a.defaultmrthod();
    }
}
