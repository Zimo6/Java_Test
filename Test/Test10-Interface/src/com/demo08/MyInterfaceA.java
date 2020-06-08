package com.demo08;

public interface MyInterfaceA {

    public abstract void methodA();
    //重名方法
    public abstract void methodComment();

    //重名默认方法
    public default void methodDefault(){
        System.out.println("A的默认方法");
    }
}
