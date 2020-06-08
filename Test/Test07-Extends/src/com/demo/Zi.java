package com.demo;

public class Zi extends Fu{
    int numZi = 20;
    int num = 200;

    public void methodZi(){
        //因为本类有num，所以这里是本类的num，没有则向上找
        System.out.println(num);
    }
}
