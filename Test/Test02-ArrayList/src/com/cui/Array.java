package com.cui;

/***
 * 对象数组
 */
public class Array {
    public static void main(String[] args) {
        Person[]  person= new Person[3];

        Person one = new Person("巴啦啦",20);
        Person two = new Person("啊啊啊",30);
        Person three = new Person("大大啊",40);


        person[0] = one;
        person[1] = two;
        person[2] = three;

        System.out.println(person[0]);//地址值
        System.out.println(person[1]);//地址值
        System.out.println(person[2]);//地址值

        System.out.println(person[0].getName());
    }
}
