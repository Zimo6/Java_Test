package com.cui.String;

/**
 *String 当中与转换相关的常用方法
 *
 * public char[] toCharArray(); 将当前字符串拆分成为字符数组作为返回值
 *
 * public byte[] getBytes(): 获得当前字符串底层的字节数组作为返回值
 *
 * public String replace(CharSequence oldString,CharSequence newString)
 * 将所有出现的老字符串替换成为新的字符串,返回替换之后的结果新字符串
 * 备注：CharSequence 意思就是可以接受字符串类型
 *
 */
public class Demo06StringConvert {
    public static void main(String[] args) {
        String str1 = "HelloWorld";

        char[] chars = str1.toCharArray();//将当前字符串拆分成为字符数组作为返回值
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        byte[] bytes = str1.getBytes();//获得当前字符串底层的字节数组作为返回值
        System.out.println(bytes[0]);


        System.out.println("====================");


        String str2 = "How do you do"; //要求把字母o换成*
        String ReplaceResult = str2.replace("o", "*");
        System.out.println(str2);
        System.out.println(ReplaceResult);

        System.out.println("====================");
        //游戏骂人
        String lang = "你他吗会不会玩啊？？？曹尼玛！";
        String lang1 = lang.replace("尼玛", "***");
        System.out.println(lang);
        System.out.println(lang1);


    }
}
