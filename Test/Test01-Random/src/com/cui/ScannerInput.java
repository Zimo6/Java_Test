package com.cui;

import java.util.Scanner;

/***
 * Scanner类的功能  实现键盘输入
 */
public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(); //键盘输入一个int
        String String = scanner.next();//键盘输入一个String

        System.out.println("输入的int数据为"+num);
        System.out.println("输入的String数据为"+String);
    }

}
