package com.cui.String;


import java.util.Scanner;

/***
 *
 *  题目：键盘输入一个字符串，并统计各种字符出现的次数
 *  种类有： 大写字母，小写字母，数字，其他
 *
 */
public class Demo09StringPractiseTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Dword = 0;
        int Xword = 0;
        int Nums = 0;
        int Other = 0;
        System.out.println("请输入一个字符串");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('A'<= c && c <='Z'){    //判断是否为大写字母
                Dword++;
            }
            if ('a'<= c && c <='z'){    //判断是否为小写字母
                Xword++;
            }
            if ('0'<= c && c <='9'){    //判断是否为数字
                Nums++;
            }
            else {
                Other++;
            }
        }

        System.out.println("大写字母个数："+Dword);
        System.out.println("小写字母个数："+Xword);
        System.out.println("数字个数："+Nums);
        System.out.println("其他个数："+Other);



    }
}
