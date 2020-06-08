package com.demo5;

public class NewPhone extends OldPhone{
    @Override
    public void showphone() {
        super.showphone(); //把父类的showphone方法拿过来重复利用
        //自己子类再来添加更多内容

        System.out.println("打我的电话："+phone);

    }


}
