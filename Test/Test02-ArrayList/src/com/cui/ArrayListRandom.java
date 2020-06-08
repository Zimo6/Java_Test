package com.cui;

import java.util.ArrayList;
import java.util.Random;

/***
 * 题目：生成6个1~33之间的随机整数，添加到集合，并遍历集合
 */
public class ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //添加数字
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            list.add(random.nextInt(33)+1);
        }

        //打印数字
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        
    }
}
