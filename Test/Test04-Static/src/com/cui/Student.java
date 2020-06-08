package com.cui;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    private static int idCounter = 0; //学号计数器，每当new一个对象，计数器++

    //第一次使用本类时 静态代码块执行唯一的一次
    //静态内容优先执行
    //静态代码块典型用途： 用来一次性地对静态成员变量进行赋值
    static {
        System.out.println("我是静态代码块");
    }



    //默认构造
    public Student(){
        this.id = ++idCounter;
    };

    public Student(String name, int age) {
        this.id = ++idCounter;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        Student.idCounter = idCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
