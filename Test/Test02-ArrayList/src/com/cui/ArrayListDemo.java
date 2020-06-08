package com.cui;

import java.util.ArrayList;

/***
 * 数组的长度不可发生改变
 * 但是ArrayList集合的长度不可改变
 *
 * 对于ArrayList有一个尖括号<E>代表泛型
 *
 * 泛型只能是引用类型,不能是基本数据类型
 *
 * 注意事项： 对于ArrayList集合，直接打印对象不是地址，而是内容
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("啊哈哈哈");
        person.setAge(20);

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(person);
        System.out.println(list1);
        System.out.println(list1.get(0).getName());//下标从0开始



        //泛型为String
        ArrayList<String> list2 = new ArrayList<>();

        //System.out.println(list2);//打印结果为[]
        //注意事项： 对于ArrayList集合，直接打印对象不是地址，而是内容
        list2.add("巴啦啦能量");
        list2.add("瓦达瓦大");
        list2.add("打我大无多");
        System.out.println(list2);
    }


}
