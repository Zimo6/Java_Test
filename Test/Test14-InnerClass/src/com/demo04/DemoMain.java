package com.demo04;

/***
 * 如果接口的实现类（或者是父类的子类）只需要使用唯一的一次
 * 那么这种情况下就可以省略该类的定义，耳改为使用【匿名内部类】
 *
 * 匿名内部类定义格式：
 *  接口名称 对象名 = new 接口名称(){
 *    //重写所有抽象方法
 *  };
 *
 *  匿名内部类是省略了---【实现类/子类】
 *  匿名对象是省略了----【对象名称】
 */
public class DemoMain {
    public static void main(String[] args) {
        //多态
//        MyInterface myInterface = new MyInterfaceImpl();
//        myInterface.method();

        //使用匿名内部类
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法！111");
            }
        };

        obj.method();

        //匿名对象+匿名内部类
        new MyInterface(){
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法！222");
            }
        }.method();
    }
}
