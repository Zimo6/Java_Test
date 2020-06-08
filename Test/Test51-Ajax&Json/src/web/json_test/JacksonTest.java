package web.json_test;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import web.domain.Person;

import java.util.*;

public class JacksonTest {

    //java对象转换为json字符串
    @Test
    public void test1() throws Exception {
        //1.创建Person对象
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        //2.创建Jackson的核心对象
        ObjectMapper mapper = new ObjectMapper();
        //3.调用方法转换
            /*
                转换方法：
                    writeValue(参数1,obj)
                    参数1:
                        File：将obj对象转换为JSON字符串，并保存到指定的文件中
                        Writer：将obj对象转换为JSON字符串，并将json数据填充到字符输出流中
                        OutputStream：将obj对象转换为JSON字符串，并将json数据填充到字节输出流中
                    writeValueAsString(obj):将对象转换为json对象
            */
        String json = mapper.writeValueAsString(p);
        System.out.println(json);//{"name":"张三","age":23,"gender":"男"}

        //writeValue,将数据写到d://a.txt文件中
        //mapper.writeValue(new File("d://a.txt"),p);

        //writeValue，将数据关联到字符输出流Writer中
        //mapper.writeValue(new FileWriter("d://b.txt"),p);

        //OutputStream,并将json数据填充到字节输出流中
        //mapper.writeValue(new FileOutputStream("d://c.txt"),p);

    }


    @Test
    public void test2() throws Exception {
        //1.创建Person对象
        Person p = new Person();
        p.setName("张三");
        p.setAge(23);
        p.setGender("男");
        p.setBirthday(new Date());
        //2.转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(p);
        System.out.println(json);//{"name":"张三","age":23,"gender":"男","birthday":1573445180819}
    }

    @Test
    public void test3() throws Exception {
        //1.创建Person对象
        Person p1 = new Person();
        p1.setName("张三");
        p1.setAge(23);
        p1.setGender("男");
        p1.setBirthday(new Date());

        Person p2 = new Person();
        p2.setName("李四");
        p2.setAge(24);
        p2.setGender("男");
        p2.setBirthday(new Date());

        Person p3 = new Person();
        p3.setName("王五");
        p3.setAge(25);
        p3.setGender("女");
        p3.setBirthday(new Date());
        //创建List集合
        List<Person> list = new ArrayList<Person>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        //2.转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(list);
        System.out.println(json);// [{"name":"张三","age":23,"gender":"男","birthday":"2019-11-11 04:21:11"},{"name":"李四","age":24,"gender":"男","birthday":"2019-11-11 04:21:11"},{"name":"王五","age":25,"gender":"女","birthday":"2019-11-11 04:21:11"}]
    }

    @Test
    public void test4() throws Exception {
        //1.创建map集合
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("name", "张三");
        map.put("age", 23);
        map.put("gender", "男");


        //2.转换
        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(map);
        System.out.println(json);//{"gender":"男","name":"张三","age":23}


    }


    @Test   //json字符串转换为java对象
    public void test5() throws Exception {

        String json = "{\"gender\":\"男\",\"name\":\"张三\",\"age\":23}";

        //创建ObjectMapper对象
        ObjectMapper mapper = new ObjectMapper();

        Person person = mapper.readValue(json, Person.class);
        System.out.println(person);
    }
}
