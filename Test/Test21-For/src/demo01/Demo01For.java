package demo01;

import java.util.ArrayList;

/*
* 增强for循环(也称for each循环)是JDK1.5以后出来的一个高级for循环
* 专门用来遍历【数组】和【集合】的。它的内部原理其实是个Iterator迭代器，
* 所以在遍历的过程中，不能对集合中的元素进行增删操作。
*
* 格式：
*   for(集合/数组的数据类型 变量名: 集合名/数组名){
*           sout（变量名）;
*   }
*
* */
public class Demo01For {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    //增强for循环   遍历集合
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("一号");
        list.add("二号");
        list.add("三号");
        list.add("四号");
        for (String l : list) {
            System.out.println(l);
        }
    }

    //增强for循环   遍历数组
    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
