package com.cui.String;

/***
 *  == 是进行对象地址值的比较  equals()是字符串内容的比较
 */
public class Demo03StringEquals {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        //char数组进行创建
        char[] chars = {'H','e','l','l','o'};
        String str3 = new String(chars);


        /***
         * public boolean equals(Object obj)
         */
        System.out.println("Hello".equals(str1));//推荐  常量写在前面
        System.out.println(str1.equals("Hello"));//不推荐

        /***
         * public boolean equalsIgnoreCase(Object obj)      忽略大小写比较
         */

        System.out.println("HELLO".equalsIgnoreCase(str1));// true

    }
}
