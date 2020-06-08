package com.demo3;

/***
 *
 */
public class Demo3 {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.methodFu();
        zi.methodZi();

        zi.method();//创建的对象是谁，就优先用谁，如果没有则向上找
    }
}
