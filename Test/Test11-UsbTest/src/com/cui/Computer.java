package com.cui;

public class Computer {

    public void powerOn(){
        System.out.println("笔记本开机");
    }

    public void powerOff(){
        System.out.println("笔记本关机");
    }

    //使用USB设备的方法
    public void useDevice(USB usb){
        usb.open(); //打开设备

        usb.close();//关闭设备
    }
}
