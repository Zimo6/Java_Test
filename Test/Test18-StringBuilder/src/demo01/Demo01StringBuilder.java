package demo01;

/***
 * java.lang.String类：字符缓冲区，可以提高字符串的效率
 * 构造方法：
 *      StringBuilder() 构造一个没有字符的字符串构建器，初始容量为16个字符。
 *      StringBuilder(String str) 构造一个初始化为指定字符串内容的字符串构建器。
 *
 *
 */
public class Demo01StringBuilder {
    public static void main(String[] args) {
        //空参构造
        StringBuilder bu1 = new StringBuilder();
        System.out.println(bu1);

        //带字符串的构造方法
        StringBuilder bu2 = new StringBuilder("cui");
        System.out.println(bu2);
    }

}
