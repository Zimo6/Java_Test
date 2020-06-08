package com.cui;

import java.util.Random;
import java.util.Scanner;

/***
 * 随机数游戏    假如只有十次机会呢？见RandomGameTen
 */
public class RandomGame {
    public static void main(String[] args) {
        System.out.println("请输入被猜数字范围0~n：");
        int num = new Scanner(System.in).nextInt();
        int random = new Random().nextInt(num)+1;//生成一个随机数
     while(true){
         System.out.println("请输入你猜测的数字：");
         int guessNum = new Scanner(System.in).nextInt();

         if (guessNum>random){
             System.out.println("太大了，请重试");
         }
         else if (guessNum<random){
             System.out.println("太小了，请重试 ");
         }
         else {
             System.out.println("恭喜你猜对了，答案为："+random);
             System.out.println("游戏结束");
             break;

         }
      }
    }
}
