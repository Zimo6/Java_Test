package demo02DateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/***
 * java.text.DateFormat 是日期格式化抽象类
 *
 * 作用：
 *      格式化（也就是日期->文本）、解析(文本->日期)
 * 成员方法：
 *      String format(Date date) 按照指定的模式，把Date日期，格式化为符合模式的字符串
 *      Date parse(String source) 把符合模式的字符串，解析为Date日期
 *
 * 使用子类SimpleDateFormat创建对象
 *      构造方法：
 *      SimpleDateFormat(String pattern)
 *
 */
public class Demo01DateFormat {

    public static void main(String[] args) throws ParseException {

        demo01();

        demo02();
    }

    //格式化日期

    private static void demo01(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日,HH时mm分ss秒");
        Date date = new Date();
        String format = simpleDateFormat.format(date);
        System.out.println(date);
        System.out.println(format);

    }
    //解析字符串 为 日期
    private static void demo02() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日,HH时mm分ss秒");
        Date parse = simpleDateFormat.parse("2019年09月16日,21时11分55秒");
//        Date parse1 = simpleDateFormat.parse("2019年09月16日");  会抛出异常
        System.out.println(parse);
    }
}
