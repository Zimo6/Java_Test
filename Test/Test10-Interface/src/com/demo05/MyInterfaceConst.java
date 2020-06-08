package com.demo05;

/***
 * 接口当中也可以当以“成员变量”，但是必须使用 public static final 三个关键字进行修饰
 * 从效果上看，这其实就是接口的【常量】
 *
 *  格式：
 *      public static final 数据类型 常量名称 = 数据值
 *
 *  final关键字进行修饰，说明不可改变
 *  1.接口当中的常量可以省略 public static final
 *  2.接口常量必须要赋值，最好大写
 *  3.通过接口名称.常量名调用
 */
public interface MyInterfaceConst {
    //这其实就是一个常量，一旦赋值，不可以修改
    public static final int NUM = 8;

}
