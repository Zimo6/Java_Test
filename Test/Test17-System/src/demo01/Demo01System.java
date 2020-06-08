package demo01;

import java.util.Arrays;

/***
 *      java.lang.System类中提供了大量的静态方法，可以获取与系统相关的信息或系统级操作，
 *      在System类的API文档中，常用的方法有：
 *
 *      public static long currentTimeMillis()：返回以毫秒为单位的当前时间。
 *      public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：将数组中指定的数据拷贝到另一个数组中。
 */
public class Demo01System {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    // public static long currentTimeMillis()：返回以毫秒为单位的当前时间
    // 一般测试程序效率
    private static void demo01() {
        //执行前
        long l = System.currentTimeMillis();
        for (int i = 0; i < 9999; i++) {

        }
        //执行后
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
    }

    //public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)：
/*  src          源数组
    srcPos       源数组索引起始位置
    dest         目标数组
    destPos      目标数组索引起始位置
    length       复制元素个数
 */

//    将src数组中前3个元素，复制到dest数组的前3个位置上
//    复制元素前：
//        src数组元素[1,2,3,4,5]，dest数组元素[6,7,8,9,10]
//    复制元素后：
//        src数组元素[1,2,3,4,5]，dest数组元素[1,2,3,9,10]
    private static void demo02() {
        //定义源数组
        int[] src = {1,2,3,4,5};
        int[] dest = {6,7,8,9,10};
        //复制前
        System.out.println(Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        //复制后
        System.out.println(Arrays.toString(dest));
    }
}
