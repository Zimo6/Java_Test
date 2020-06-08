package com.dome04;

/***
 * 对于成员变量，如果使用final关键字修饰，那么这个变量也照样是不可变
 *
 * 1.由于成员变量有默认值，所以用了final之后必须手动赋值，不会再给默认值了
 * 2.对于final的成员变量，要么直接赋值，要么通过构造方法赋值
 */
public class Person {

    private final int NUM = 1000; //直接赋值

    private final String name;

    public Person() {
        name = "崔双麒"; //这里是通过构造赋值
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
