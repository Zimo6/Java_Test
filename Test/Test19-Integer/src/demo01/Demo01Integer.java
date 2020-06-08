package demo01;

/***
 *  【装箱】：把基本数据类型包装到包装类中
 *    构造方法：
 *      Integer(int value) 构造一个新分配的Integer对象，它表示指定的int值
 *      Integer(String s) 构造一个新分配的Integer对象，它表示String参数指定的int值
 *                          传递字符串必须是基本类型的字符换，否则会抛出异常    “100”正确 “a”抛异常
 *    静态方法：
 *      static Integer valueOf(int i) 返回一个表示指定int值Integer实例
 *      static Integer valueOf(String s) 返回一个表示指定String值Integer实例
 *
 *   【拆箱】：在包装类中取出基本数据类型
 *      成员方法：
 *          int inValue() 以int类型返回该Integer的值
 */
public class Demo01Integer {
    public static void main(String[] args) {
        //装箱
        //构造方法
        Integer in1 = new Integer(1);
        Integer in2 = new Integer("100");
        System.out.println(in1);
        System.out.println(in2);
        //静态方法
        Integer integer = Integer.valueOf(1);
        Integer integer1 = Integer.valueOf("100");

        //拆箱
        int i = in1.intValue();
        System.out.println(i);
    }
}
