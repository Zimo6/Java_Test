package demo01;

/***
 * 成员方法：
 *  append() 添加
 *  toString()  StringBuilder和String相互转换
 *
 */
public class Demo02StringBuilder {
    public static void main(String[] args) {
        demo01();
        demo02();

    }

//    append() 方法
    private static void demo01(){
        //空参构造
        StringBuilder bu1 = new StringBuilder();
        bu1.append(1);
        bu1.append("aaa");
        bu1.append(false);
        bu1.append(0.55);
        bu1.append('中');
        System.out.println(bu1);
    }

//     toString() 方法
    private static void demo02(){

        //String->StringBuilder
        String str = "Hello";
        StringBuilder bu = new StringBuilder(str);

        bu.append("wolrd");
        System.out.println(bu);

        //StringBuilder->String
        String string = bu.toString();
        System.out.println(string);
    }

}
