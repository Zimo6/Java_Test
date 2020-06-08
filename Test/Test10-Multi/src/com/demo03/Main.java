package com.demo03;

public class Main {
    public static void main(String[] args) {
        //向上转型  （一定是安全的）
        Anm anm = new Cat();
        anm.eat();
//        anm.catchMouse;   错误写法


        //向下转型
        Cat cat = (Cat) anm;
        cat.catchMouse();

       // Dog dog = (Dog)anm;
        //错误转型，本来new的是一只猫，现在非要当成狗
        //编译不会报错，运行会异常



        //如何才能知道一个父类引用的对象，本来是什么子类？
        //判断一下父类引用anm本来是不是Cat
        if (anm instanceof Cat) {
            Cat cat1 = (Cat) anm;
            cat1.eat();

        }

        //判断一下父类引用anm本来是不是Dog
        if (anm instanceof Dog) {
            Dog dog1 = (Dog) anm;
            dog1.eat();
        }
    }
}
