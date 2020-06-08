package com.cui;

import java.util.Scanner;

/***
 * 匿名对象
 */
public class Anonymous {
    public static void main(String[] args) {
//        普通创建对象
        Person person = new Person();
        person.setName("催催催");
        person.showname();

//        匿名对象
//        注意事项：匿名对象只能使用一次
        new Person().setName("双双双");
        new Person().showname();//输出为null

//        Scanner的匿名对象使用
    }
}
