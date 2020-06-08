package com.cui;

import java.util.ArrayList;

/***
 * 题目要求 输出格式为  {一一一@二二二@三三三}
 */
public class ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("一一一");
        list.add("二二二");
        list.add("三三三");
        System.out.println(list);

        PrintArrayList(list);
    }
    public static void PrintArrayList(ArrayList<String> arrayList){
        //{10@20@30}
        System.out.print("{");
        for (int i = 0; i < arrayList.size(); i++) {
            String  name = arrayList.get(i);
            if (i==arrayList.size()-1)
            {
                System.out.print(name+"}");
            }
            else
            {

                System.out.print(name+"@");
            }
        }
    }
}
