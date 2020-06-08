package com.cui.String;


/***
 * java程序中所有双引号字符串 "abc"  都是String类的对象（就算没有new，也照样是）
 * 字符串的内容永不可变
 *
 * 创建字符串的常见3+1中方式
 * 三种构造方法：
 * public String() 创建一个空白字符串，不含任何内容
 * public String(char[] array)  根据字符数组的内容，来创建对应的字符串
 * public String(byte[] array)  根据字节数组的内容，来创建对应的字符串
 * 一种直接创建：
 *
 */
public class Demo01String {
    public static void main(String[] args) {
        //使用参数构造
        String string = new String("参数");
        System.out.println(string);


        //使用空参构造
        String str1= new String(); //小括号留空
        System.out.println("第一个字符串："+str1);

        //根据字符数组创建字符串
        char[] chars = {'A','B','C'};
        String str2 = new String(chars);
        System.out.println("第二个字符串："+str2);

        //根据字节数组创建字符串
        byte[] bytes = {97,98,99};
        String str3 = new String(bytes);
        System.out.println("第三个字符串："+str3);

        //直接创建
        String str = "hello"; //此时str也是对象
        char charAt = str.charAt(1);
        System.out.println(charAt);
        System.out.println("第四个字符串："+str);

    }
}
