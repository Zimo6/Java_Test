package com.demo03;

/***
 *  从java 8 开始 ，接口当中允许定义静态方法
 *  格式：
 *      public static 返回值类型 方法名称（参数名称）{
 *          方法体
 *      }
 */
public interface MyInterFaceStatic {
    //接口当中的静态方法
    public static void staticmethod(){
        System.out.println("我是接口的静态方法");
    }
}
