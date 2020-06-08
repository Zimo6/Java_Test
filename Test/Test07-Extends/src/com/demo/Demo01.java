package com.demo;

/***
 * 在父类的继承关系当中，如果成员变量重名则创建子类对象时，访问有两种方式
 *
 * 直接：通过子类对象访问成员变量
 *          点号左边是谁，就优先用谁，没有则向上找
 * 间接：通过成员方法访问成员变量
 *          方法属于谁，就优先用谁
 *
 */
public class Demo01 {
    public static void main(String[] args) {
        Fu fu = new Fu();
        System.out.println(fu.numFu);
        System.out.println("================");

        Zi zi = new Zi();
        System.out.println(zi.numFu);
        System.out.println(zi.numZi);
        System.out.println("================");

        //点号左边是谁，就优先用谁
        System.out.println(zi.num); //优先子类
        System.out.println("================");


        //这个方法是子类的，优先用子类的，没有再向上找
        zi.methodZi();//200

        //这个方法是父类的
        zi.methodFu();




    }
}
