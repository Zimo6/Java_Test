package com.demo01;

/***
 * 【内部类】
 *  如果一个事务的内部包含另一个事务，那么这就是一个内部类包含另一个类
 *  例如：身体和心脏的关系，又如：汽车和发动机的关系
 *
 *  分类：
 *  1. 成员内部类
 *  2.局部内部类（包含匿名内部类）
 *
 *  【成员内部类】定义格式：
 *
 *  修饰符  class 外部类名称 {
 *      修饰符 class 内部类名称 {
 *          //...
 *      }
 *      //...
 *  }
 *注意：内用外，随意使用； 外用类。需要内部类对象。
 * ==============================
 * 如何使用内部类？
 * 1.间接方式：在外部类的方法中，使用内部类；然后main只是调用外部类的方法
 *
 * 2.直接方式，公式：
 *  类名称 对象名 = new 类名称（）；
 *  【外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();】
 */
public class Demo01InnerClass {
    public static void main(String[] args) {
        //外部类对象
        Body body = new Body();
        //通过外部类对象，调用外部类的方法，间接使用内部类的Heart
        body.methodBody();

        System.out.println("====================");
        //内部类公式：
        Body.Heart heart = new Body().new Heart();
        heart.beat();
    }

}
