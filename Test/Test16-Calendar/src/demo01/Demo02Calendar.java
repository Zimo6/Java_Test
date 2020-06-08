package demo01;

import java.util.Calendar;
import java.util.Date;

/*
*
*   Calendar类的成员方法：
*   public int get(int field)                           返回日历字段的值
*   public void set(int field,int value)                将给定的日历字段设置为定值
*   public abstract void add(int field,int amount)   根据日历的规则，为给定的日历字段添加或减去指定的时间量
*   public Date getTime()                            返回一个表示此Calendar时间值（从历元年到现在的毫秒偏移量）的Date对象  即把日历对象转换为日期对象
 * */
public class Demo02Calendar {
    public static void main(String[] args) {
      demo01();
      demo02();
      demo03();
      demo04();
    }




    //  public int get(int field)     返回日历字段的值
    private static void demo01() {
        Calendar c = Calendar.getInstance();

        int i = c.get(Calendar.YEAR);
        System.out.println(i);

        int i1 = c.get(Calendar.MONTH);
        System.out.println(i1);

        int i2 = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(i2);
        System.out.println("===============");

    }

    //  public void set(int field,int value)    将给定的日历字段设置为定值
    private static void demo02(){
        Calendar c = Calendar.getInstance();
        c.set(Calendar.YEAR,2088);//将YEAR字段设置为2088
        System.out.println(c.get(Calendar.YEAR));
        System.out.println("===============");
    }

    // public abstract void add(int field,int amount)   根据日历的规则，为给定的日历字段添加或减去指定的时间量
    private static void demo03() {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.YEAR,-1);
        System.out.println(c.get(Calendar.YEAR));
        System.out.println("===============");
    }

    // public Date getTime() 返回一个表示此Calendar时间值（从历元年到现在的毫秒偏移量）的Date对象
    // 即把日历对象转换为日期对象
    private static void demo04() {
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);
    }
}
