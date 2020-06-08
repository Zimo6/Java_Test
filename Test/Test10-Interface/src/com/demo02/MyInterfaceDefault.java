package com.demo02;

/***
 * 从java 8 开始，接口里允许定义默认方法
 *
 * 格式：
 *      public default 返回值类型 方法名称（参数列表）{
 *          方法体
 *      }
 * 备注：接口当中的默认方法，可以解决接口升级的问题
 */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void method();

    //假如有增加了新的方法，下面的实现类必须又要实现这个方法
    //此时方法应该为defaul     默认方法也可以被重写
    public default void defaultmrthod() {
        System.out.println("我是接口的默认方法");
    }
}
