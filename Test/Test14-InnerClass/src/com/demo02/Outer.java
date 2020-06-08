package com.demo02;

public class Outer {

    int num = 10;

    public class Inner{

        int num = 20;

        public void methodInner(){
            int num = 30;
            System.out.println(num);//30

            System.out.println(this.num);//20
            System.out.println(new Inner().num);//20

//          System.out.println(super.num);  错误写法

            System.out.println(Outer.this.num);//10
            System.out.println(new Outer().num);//10
        }
    }
}
