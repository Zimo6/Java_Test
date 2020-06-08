package com.cui;

/***
 * 子类就是一个父类     也就是说，子类可以被当做父类看待
 */
public class Demo1Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher teacher = new Teacher();
        teacher.method();

        //创建另一个子类助教的对象
        Assistant assistant = new Assistant();
        assistant.method();
    }
}
