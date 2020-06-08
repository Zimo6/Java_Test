package com.cui;

import java.util.Arrays;

/***
 * java.util.Arrays是一个与数组相关的工具类   里面提供了大量静态方法 用来实现数组常见的操作
 *
 * punlic static String toString(数组)    将参数数组变成字符串（按照默认格式 [元素1,元素2,...]）
 *                                        返回指定数组的内容的字符串表示形式。
 *
 * public static void sort(数组)          按照默认升序对数组的元素进行排序（从小到大）
 */

public class Demo1Arrays {



    public static void main(String[] args) {
        //toString()
        int[] intArray = {10,20,30};
        System.out.println(intArray); //直接打印数组名会是地址
        String string = Arrays.toString(intArray); //这里toString为静态方法
        System.out.println(string);

        //sort()
        int[] array1 = {1,5,5,9,5,7,48,55};
        //此时不用写for循环遍历
        Arrays.sort(array1); //此时已经排序完成

        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]);
        }

        System.out.println(Arrays.toString(array1));

        String[] strings = {"aaa","ccc","bbb"};
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings);
        System.out.println(Arrays.toString(strings));


    }
}
