package com.cui;

import java.util.ArrayList;

/***
 * ArrayList常用方法
 *
 * public boolean add(E e) 向集合中添加元素
 * public E get(int index) 从集合中获取元素，参数是索引编号，0开始
 * public E remove(int index) 从集合中删除元素，参数是索引编号，返回值为被删除元素
 * public int size() 获得集合的长度
 *
 */
public class ArrayListMethodDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        boolean add = list.add("一一一");
         list.add("二二二");
         list.add("三三三");
         list.add("四四四");
        System.out.println("是否添加成功:"+add); //add方法的返回值 是否成功 add一般成功，对于其他方法不一定成功

        //get方法
        String name = list.get(1);
        System.out.println("得到0号元素的名字："+list.get(0));
        System.out.println("得到1号元素的名字："+name);

        //remove方法
        String whoremve = list.remove(3);
        System.out.println("谁被删除了："+whoremve);
        System.out.println(list);//删除结果

        //size方法
        int size = list.size();
        System.out.println("集合长度"+size);


        System.out.println("================");
        //遍历ArrayList集合
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }


    }
}
