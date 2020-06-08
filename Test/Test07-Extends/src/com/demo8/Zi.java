package com.demo8;

/***
 * super用来访问父类内容
 * this用来访问本类内容
 * 用法三种：
 * 1.在本类的成员方法中，访问本类的成员变量
 * 2.在本类的成员方法中，访问本类的另一个成员方法
 * 3.在本类的构造方法中，访问本类的另一个构造方法
 */
public class Zi extends Fu {

    int num = 20;
    public void showNum(){
        int num = 10;
        System.out.println(num); //局部变量，数值为10
        System.out.println(this.num); //访问数值为20的num
        System.out.println(super.num);//父类的成员变量
    }

    public void methodA(){
        System.out.println("AAA");
    }
    public void methodB(){
//        methodA();
        this.methodA(); //与上面相同
        System.out.println("BBB");
    }

}
