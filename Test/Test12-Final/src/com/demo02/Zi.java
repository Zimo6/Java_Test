package com.demo02;

public class Zi extends Fu {
    @Override
    public void method() {
        System.out.println("子类重写父类方法");//父类的普通方法可以重写
    }

    //父类final修饰的方法不能被重写
}
