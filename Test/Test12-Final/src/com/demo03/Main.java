package com.demo03;

/***
 * final修饰局部变量
 */
public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        num1 = 1000;
        System.out.println(num1);

        //一旦使用final用来final修饰局部变量，那么这个值不能更改
        final int num2 = 200;
        System.out.println(num2);
//        num2 = 2000;  错误

        final int num3;
        num3 = 30; //正确

        //对于基本类型，不可变说的是变量当中的数据不可改变
        //对于引用类型，不可变说的是变量当中的地址值不可变

        //修饰引用类型    这里是可以变的
        final Person person = new Person("崔双麒");
        System.out.println(person.getName());

        person.setName("崔双双麒");
        System.out.println(person.getName());

        //但是 如下就不行
       // person = new Person("崔崔崔");



    }
}
