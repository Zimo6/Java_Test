package com.cui;

import java.util.ArrayList;
import java.util.Random;

/***
 * 用一个大集合存入20个随机数字 然后筛选其中的偶数元素  放到小集合中
 */
public class ArrayListReturn {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            nums.add(random.nextInt(100)+1);  //1~100数字
        }
        System.out.println("20个随机数字为"+nums);

        System.out.println("20个随机数中的偶数为"+oushu(nums));;
    };

    //此时 返回值类型和参数类型都为ArrayList
    public static ArrayList<Integer> oushu(ArrayList<Integer> list){
        ArrayList<Integer> oushu = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i)%2==0){
                oushu.add(list.get(i));
            }
        }
        return oushu;
    }
}
