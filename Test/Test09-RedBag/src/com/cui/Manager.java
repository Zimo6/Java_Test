package com.cui;

import java.util.ArrayList;

//群主类
public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }
    //发红包   参数：红包金额 份数
    public ArrayList<Integer> send(int totalMoney,int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList = new ArrayList<>();

        //首先看下群主多少钱
        int leftMoney = getMoney(); //群主当前余额
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList; //返回空集合
        }else {
            //扣钱,就是重新设置金额
            setMoney(leftMoney-totalMoney);
            //发红包需要拆分成为count份
            int avg = totalMoney / count;
            int mod = totalMoney % count; //余数，也就是剩下的零头

            //除不开的零头，放到最后一个红包中
            //下面把红包一个个放到集合中
            for (int i = 0; i < count-1; i++) {
                redList.add(avg);
            }
            //最后一个红包
            int last = avg +mod ;
            redList.add(last);
        }
        return redList;
    }
}
