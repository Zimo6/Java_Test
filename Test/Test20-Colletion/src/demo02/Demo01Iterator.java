package demo02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
*  java.util.Iterator接口：迭代器，（对集合进行遍历）
*   两个常用方法：
-       public E next():返回迭代的下一个元素。
-       public boolean hasNext():如果仍有元素可以迭代，则返回 true。

*   因为该迭代器是一个接口，需要使用Iterator接口的实现类对象，获取实现类的方式比较特殊
*   Collection接口中有一个方法，叫iterator(),这个方法返回的就是迭代器的实现类对象
*
*   迭代器使用步骤：
*       1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
*       2.使用Iterator接口中的方法hasNext判断还有没有下一个元素
*       3.使用Iterator接口中的方法next取出集合中的下一个元素
*
* */
public class Demo01Iterator {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> collection = new ArrayList();//多态
        collection.add("我是一号");
        collection.add("我是二号");
        collection.add("我是三号");
        collection.add("我是四号");
        System.out.println(collection);
        /*
        *   Iterator<E>接口也是有泛型的，迭代器的泛型跟着集合走，集合是什么泛型，迭代器就什么泛型
        * */

        //多态    接口          实现类对象
        Iterator<String> iterator = collection.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }





        /*
        boolean b = iterator.hasNext();
        System.out.println(b);
        String next =  iterator.next();
        System.out.println(next);//我是一号

        b = iterator.hasNext();
        System.out.println(b);
        next =  iterator.next();
        System.out.println(next);

        b = iterator.hasNext();
        System.out.println(b);
        next =  iterator.next();
        System.out.println(next);

        b = iterator.hasNext();
        System.out.println(b);
        next =  iterator.next();
        System.out.println(next);
        */


    }
}
