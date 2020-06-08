package com.cui;

import java.util.Random;

/***
 * Random用来生成随机数字
 */
public class RandomNum {
    public static void main(String[] args) {
        Random random = new Random();

        int num1 = random.nextInt(); //无参为int范围之内 有正有负
        System.out.println("随机数为"+num1);

        for (int i = 0; i < 20; i++) {
            int num2 = random.nextInt(10);//有参为随机数的范围 左闭右开 [0,10)  随机数为0 1 2 3 4 5 6 7 8 9
            System.out.println("参数为10的随机数："+num2);
        }

    }
}
