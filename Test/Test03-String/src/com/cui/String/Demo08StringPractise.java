package com.cui.String;

import java.util.ArrayList;

/***
 * 题目： 定义一个方法，把数组{1,2,3}按照格式拼接成一个字符串
 * 参照各式： [word1#word#word3]
 */
public class Demo08StringPractise {
    public static void main(String[] args) {
        //通过数组
        int[] nums = {1,2,3};
        String Result = fromNumsToString(nums);
        System.out.println(Result);

        //通多ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        String string = fromNumsToString(list);
        System.out.println(string);
    }
    //参数为数组
    public static String fromNumsToString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i==array.length-1) {
                str += "word" + array[i] + "]";
            }else {
                str += "word" + array[i] + "#";
            }
        }
        return str;
    }

    //参数为ArrayList
    public static String fromNumsToString(ArrayList<Integer> list){
        String str = "[";
        for (int i = 0; i < list.size(); i++) {
            if (i==list.size()-1) {
                str += "word" + list.get(i) + "]";
            }else {
                str += "word" + list.get(i) + "#";
            }
        }
        return str;
    }
}
