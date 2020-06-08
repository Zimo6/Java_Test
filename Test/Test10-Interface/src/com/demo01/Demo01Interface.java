package com.demo01;

/***
 * 接口就是多个类的公共规范
 * 接口是一种引用数据类型，最重要的内容就是其中的：抽象方法
 *
 * 接口格式：
 * public interface 接口名称{
 *
 * }
 *
 * 备注：变换了关键字interface后仍然是  .java -> .class
 *
 * 如果是java7，那么接口中可以包含内容：
 * 1.常量
 * 2.抽象方法
 *
 * 如果是java8，还可以额外包含：
 * 3.默认方法
 * 4.静态方法
 *
 * 如果是java9，还可以包含：
 * 5.私有方法
 *
 * 接口使用步骤：
 *
 *  1. 接口不能直接使用，必须有一个“实现类”来“实现”该接口
 *   格式：
 *      public class 实现类名称 implments 接口名称{
 *          //
 *      }
 *  2. 接口的实现类比逊重写（实现）接口中所有的抽象方法。
 *
 *  3. 创建实现类的对象，进行使用。
 */

public class Demo01Interface {
    public static void main(String[] args) {
        //创建实现类使用接口方法
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
        impl.methodAbs1();
        impl.methodAbs2();
        impl.methodAbs3();
        impl.methodAbs4();

    }
}
