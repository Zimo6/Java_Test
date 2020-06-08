package demo01;

import java.util.Date;

/***
 * Date类 表示特定的瞬间，精确到毫秒
 *
 * 1000ms = 1s
 *
 *
 */
public class Demo01Date {
    public static void main(String[] args) {
        //获取当前系统时间到1970年1月1日00:00:00经历了多少毫秒
        System.out.println(System.currentTimeMillis());
        demo01();
        demo02();
        demo03();
    }

    //空参构造方法
    public static void demo01(){
        Date date = new Date();
        System.out.println(date);
    }

    //long类型（毫秒值）构造方法
    public static void demo02(){
        Date date = new Date(0L);//1970.1.1 08:00:00
        System.out.println(date);

        boolean after = date.after(new Date());
        System.out.println(after);
    }

    //getTime()方法  把日期转换为毫秒值
    public static void demo03(){
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
}
