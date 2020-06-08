package com.demo4;

/***
 * 方法重写注意事项：
 *
 * 1.必须保证父子类之间方法的名称相同，参数列表也相同
 *
 * @Override：写在方法前面，用来检测是不是有效的正确重写
 *
 * 2.子类方法的返回值必须【小于等于】父类方法得到返回值范围
 * java.lang.Object类是所有类的公共最高父类(祖宗类)
 *
 * 3.子类方法的权限修饰符必须【大于等于】父类方法的权限修饰符
 * public > protect > (default) > private
 */
public class Demo04Override {
    public static void main(String[] args) {
        Zi zi = new Zi();
        String str= zi.method();
        System.out.println(str);
    }
}
