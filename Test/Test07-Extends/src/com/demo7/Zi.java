package com.demo7;

/***
 * super关键字三种用法
 * 1.子类成员方法访问父类成员变量
 * 2.子类成员方法访问父类成员方法
 * 3.子类构造调用父类构造方法
 */
public class Zi extends Fu {
    int num = 10;

    public Zi(){
        super();
    }

    public void num(){

        System.out.println(super.num);//访问父类成员变量
    }

    public void method(){
        super.method(); //调用父类同名方法
        System.out.println("子类构造方法");
    }
}
