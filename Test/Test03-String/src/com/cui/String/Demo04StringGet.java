package com.cui.String;

/**
 * public int length():获取字符串长度
 * public String concat(String str):将当前字符串和参数字符串  拼接
 * public char charAt(int index):获取索引位置的字符  （索引从0开始）
 * public int indexOf(String str):查找参数字符串在本字符串中第一次出现的索引位置，如果没有返回-1值
 *
 */
public class Demo04StringGet {
    public static void main(String[] args) {
        String str = "adwdwadadadsdafwdadasd";
        System.out.println(str.length());//获取长度
        System.out.println(str.concat("pppppppppp"));//拼接
        System.out.println(str.charAt(1));//下标为1的字符值
        System.out.println(str.indexOf("dasd"));//字符串"dasd"第一次出现的索引位置

    }
}
