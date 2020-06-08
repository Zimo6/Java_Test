package com.cui;

import java.util.Random;
import java.util.Scanner;

public class RandomGameTen {
    public static void main(String[] args) {
        System.out.println("【猜数字】游戏，总共十次机会。");
        System.out.println("请输入被猜数字范围0~n：");
        int num = new Scanner(System.in).nextInt();
        int random = new Random().nextInt(num)+1;//生成一个随机数
        for (int i = 1; i <= 10 ; i++) {
            System.out.println("请输入你猜测的数字：");
            int guessNum = new Scanner(System.in).nextInt();
            if (guessNum>random){
                System.out.println("太大了，请重试。");
            }
            else if (guessNum<random){
                System.out.println("太小了，请重试。");
            }
            else {
                System.out.println("恭喜你猜对了，答案为："+random);
                System.out.println("游戏结束");
            }
            if (i==10){
                System.out.println("十次机会用完，游戏结束");
            }
        }

    }
}
