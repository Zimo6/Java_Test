package com.demo08;

public interface MyInterfaceB {

    public abstract void methodA();

    //重名方法
    public abstract void methodComment();

    //重名默认方法
    public default void methodDefault(){
        System.out.println("B的默认方法");
    }
}
