package demo03;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.Hashtable<K,V>集合 implements Map<K,V>接口

    Hashtable:底层也是一个哈希表,是一个【线程安全】的集合,是【单线程】集合,速度慢
    HashMap:底层是一个哈希表,是一个【线程不安全】的集合,是【多线程】的集合,速度快

    HashMap集合(之前学的所有的集合):可以存储null值,null键
    Hashtable集合,不能存储null值,null键                                                 同步—>单线程

    Hashtable和Vector集合一样,在jdk1.2版本之后被更先进的集合(HashMap,ArrayList)取代了
    Hashtable的子类Properties依然活跃在历史舞台
    Properties集合是一个唯一和IO流相结合的集合
 */
public class Demo02Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        map.put(null,null);
        System.out.println(map);//{null=null, b=null}

        Hashtable<String,String> table = new Hashtable<>();
        //table.put(null,"a");//NullPointerException
        //table.put("b",null);//NullPointerException
        table.put(null,null);//NullPointerException
    }
}
