package com.demo4;

public class Zi extends Fu {

    @Override                   //起到作用检测是否正确重写
    public String method(){     //这里是重写父类方法
        return "子类";
    }
}
