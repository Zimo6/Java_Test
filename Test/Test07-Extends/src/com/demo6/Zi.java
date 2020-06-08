package com.demo6;

public class Zi extends Fu{
    public Zi(){
        super(10);//在调用父类无参构造方法，可以不写
                        //且必须写在最前面
        System.out.println("子类构造方法执行");
    }
    public void method(){
//        super();  //错误写法，只有子类构造方法，才能调用父类构造方法
    }
}
