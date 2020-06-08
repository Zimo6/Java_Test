package com.cui;

import java.util.Arrays;
import java.util.Random;

/***
 * 将一个随机字符串中所有字符升序排列，并倒序打印
 */
public class Demo2ArraysTest {
    public static void main(String[] args) {
     String str = "dnaindwianduiagfugihef";
        char[] chars = str.toCharArray();//将字符串转换为字符数组
        Arrays.sort(chars);//默认升序排序
        System.out.println(chars);



        for (int i = chars.length-1; i >= 0; i--) { //倒序遍历
            System.out.print(chars[i]);
        }
    }
}
