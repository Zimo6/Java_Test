package com.cui.String;

/***
 * 字符串常量池：程序中直接写上的双引号字符串   就在字符串常量池中
 *
 * 对于基本类型来说 ==是进行数值的比较
 * 对于引用类型来说 ==是进行地址值的比较
 */
public class Demo02StringPool {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1==str2);


        //char数组进行创建
        char[] chars = {'a','b','c'};
        String str3 = new String(chars);


        System.out.println(str3);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

    }


}
