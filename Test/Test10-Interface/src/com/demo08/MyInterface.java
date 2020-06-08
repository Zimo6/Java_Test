package com.demo08;

//这个子接口有几个方法？ 答：4个
//  methodA methodB methodComment method
public interface MyInterface extends MyInterfaceA,MyInterfaceB {

    public abstract void method();

    @Override
    default void methodDefault() {

    }
}
