package com.cui;

import java.util.ArrayList;
import java.util.Scanner;

public class MainRedBag {
    public static void main(String[] args) {
        Manager manager = new Manager("群主",100);
        Member one = new Member("成员A",0);
        Member two = new Member("成员B",0);
        Member three = new Member("成员C",0);
        manager.show();
        one.show();
        two.show();
        three.show();


        //群主发红包
        System.out.print("请输入红包金额：");
        int bag = new Scanner(System.in).nextInt();
        ArrayList<Integer> send = manager.send(bag,3);

        //三个成员收红包
        one.receive(send);
        two.receive(send);
        three.receive(send);

        manager.show();
        one.show();
        two.show();
        three.show();

    }
}
