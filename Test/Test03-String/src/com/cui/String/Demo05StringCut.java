package com.cui.String;

/**
 * 字符串的截取
 *  public String substring(int index): 截取从参数位置一直到字符串末尾，返回新字符串
 *  public String substring(int begin,inend):截取从begin开始，一直到end结束 中间的字符串
 *  备注：[begin,end),包含左边，不包含右边
 *
 *
 *
 */
public class Demo05StringCut {
    public static void main(String[] args) {
        String str1 = "HelloWorld";

        String str2 = str1.substring(5);//截取后面的World
        System.out.println(str2);

        String str3 = str1.substring(0,5); //截取前面的Hello
        String str4 = str1.substring(2,5); //截取前面的llo
        System.out.println(str3);
        System.out.println(str4);

        String a = "bbb";
        System.out.println(a);
        a = "aaa";
        System.out.println(a);
    }
}
