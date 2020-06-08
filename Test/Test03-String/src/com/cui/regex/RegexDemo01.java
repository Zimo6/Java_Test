package com.cui.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo01 {
    public static void main(String[] args) {
        /*
        *   验证手机号格式是否正确
        */
        // "[1]"代表第1位为数字1，
        // "[358]"代表第二位可以为3、5、8中的一个，
        // "\\d{9}"代表后面是可以是0～9的数字，有9位。
        Scanner sc = new Scanner(System.in);
        final String phone = sc.nextLine();
//      /^1(?:3\d|4[4-9]|5[0-35-9]|6[67]|7[013-8]|8\d|9\d)\d{8}$/
        String regex = "^((13[0-9])|(14[5,7])|(15[0-3,5-9])|(17[0,3,5-8])|(18[0-9])|166|198|199|(147))\\d{8}$";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(phone);
        final boolean b = m.matches();
        System.out.println(b);

    }
}
