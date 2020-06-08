package com.demo5;
//老款手机
public class OldPhone {
    public int phone = 1234567;
    public String message = "早上好";

    public void showphone(){
        System.out.println("手机号为："+phone);
    }

    public  void send(){
        System.out.println("发送消息："+message);
    }

    public void call(){
        System.out.println("拨打电话："+phone);
    }

}
