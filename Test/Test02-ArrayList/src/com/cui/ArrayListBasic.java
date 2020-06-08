package com.cui;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/***
 * ArrayList存储基本数据类型
 *
 * 如果希望向集合中ArrayList中存储基本类型，必须使用基本数据类型对应的 包装类
 * 基本类型     包装类（引用类型，包装类都位于java.lang包下）
 * byte         Byte
 * short        Short
 * int          Integer       【特殊】
 * float        Float
 * long         Long
 * double       Double
 * char         Character   【特殊】
 * boolean      Boolean
 */
public class ArrayListBasic {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);

        //从jdk1.5+开始 支持自动装箱，自动拆箱
        //自动装箱： 基本类型-->包装类型
        //自动拆箱   包装类型-->基本类型
        int integer = list.get(0);
        System.out.println(integer);

        Map<Object,String> map = new HashMap<>();

    }
}

