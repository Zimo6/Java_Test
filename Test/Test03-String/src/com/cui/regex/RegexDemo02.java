package com.cui.regex;

import java.util.Scanner;

public class RegexDemo02 {
    public static void main(String[] args) {
        /*
        *   验证手机号格式是否正确
        */
        String regex = "[1][3579][0-9]{9}";
        Scanner sc = new Scanner(System.in);
        System.out.print("亲输入手机号：");
        String phone = sc.nextLine();
        final boolean b = phone.matches(regex);
        System.out.println(b?"手机号格式正确":"手机号格式错误");

    }
}
