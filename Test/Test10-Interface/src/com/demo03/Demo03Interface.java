package com.demo03;

public class Demo03Interface {
    public static void main(String[] args) {
        //创建了实现类 对象
        MyInterFaceStaticImpl i = new MyInterFaceStaticImpl();
//        i.staticmethod();  该实现类的对象 不能调用接口当中的静态方法

        //使用方法： 使用接口名称调用静态方法    静态和类或接口没关系
        MyInterFaceStatic.staticmethod();
    }
}
