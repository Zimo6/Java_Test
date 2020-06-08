package com.demo07;

public class InterfaceImpl /* extends Object */ implements InterfaceA,InterfaceB{
    @Override
    public void methodA() {
        System.out.println("重写了接口A的方法");
    }

    @Override
    public void methodB() {
        System.out.println("重写了接口B方法");
    }

    //重写一次Abs方法
    @Override
    public void methodAbs() {

    }

    //必须重写同名默认方法
    @Override
    public void methodDefault() {

    }


}
