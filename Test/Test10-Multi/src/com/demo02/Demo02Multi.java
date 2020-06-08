package com.demo02;

public class Demo02Multi {
    public static void main(String[] args) {
        //使用多态写法
        Fu obj = new Zi();
        System.out.println(obj.num);
    //    System.out.println(obj.age);  错误写法
    }
}
