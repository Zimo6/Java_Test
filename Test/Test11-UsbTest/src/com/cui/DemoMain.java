package com.cui;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个笔记本电脑
        Computer computer = new Computer();
        computer.powerOn();

        //准备一个鼠标
        USB usb  = new Mouse(); //向上转型  多态
        //参数是USB类型，我正好传递进去的就是USB鼠标
        computer.useDevice(usb);

        //创建一个USB键盘
        Keyboard keyboard = new Keyboard();
        computer.useDevice(keyboard);

        computer.powerOff();
    }
}
