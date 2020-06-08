package com.demo04;

/***
 * java 9 开始 允许定义私有方法
 *  1.普通私有方法    解决对个默认方法之间重复代码问题
 *  2.静态私有方法    解决多个静态方法之间重复代码问题
 *
 *  下面的实现类就不继承该方法
 *
 */
public interface MyInterfacePrivateA {

    public default void methodDeflult1(){
       //methodCommon();
        System.out.println("默认方法1");
    }

    public default void methodDeflult2(){
        //methodCommon();
        System.out.println("默认方法2");
    }

    //由于现在使用的java 8 ，无法使用private关键字
   /*
   private void methodCommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
    */
}
