package com.cui;

/***
 * 如果一个成员变量使用了static关键字
 * 变量不再属于对象自己
 * 而是属于所在的类
 * 所有对象共享一份数据
 */
public class Demo01Static {
    public static void main(String[] args) {

        Student one = new Student("崔崔崔",20);
        one.room = "一号教室"; ////数据共享
        System.out.println("姓名："+one.getName()+
                         "，年龄："+one.getAge()+
                         "，教室："+one.room+
                         "，学号："+one.getId());

        Student two = new Student("双双双",30);
        System.out.println("姓名："+two.getName()+
                         "，年龄："+two.getAge()+
                         "，教室："+two.room +
                         "，学号："+two.getId());
    }


}
