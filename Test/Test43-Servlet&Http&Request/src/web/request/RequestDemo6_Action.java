package web.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Map;
import java.util.Set;

@WebServlet("/requestDemo6")    /*regist2.html  */
public class RequestDemo6_Action extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //POST获取请求参数
        System.out.println("getParameter==========================================”");
        final String name = request.getParameter("username");
        System.out.println("post");
        System.out.println(name);

        //根据参数名称获取参数值的数组
        System.out.println("getParameterValues==========================================”");
        String[] hobbies = request.getParameterValues("hobby");
        for (String hobby : hobbies) {
            System.out.println(hobby);
        }

        //获取所有请求的参数名称
        System.out.println("getParameterNames==========================================”");
        Enumeration<String> parameterNames = request.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String name1 = parameterNames.nextElement();
            System.out.println(name1);
            String value = request.getParameter(name1);//只能获取一个，复选框不能获取
            System.out.println(value);
            System.out.println("----------------");
        }


        System.out.println("getParameterMap==========================================”");

        // 获取所有参数的map集合
        Map<String, String[]> parameterMap = request.getParameterMap();
        //遍历
        Set<String> keyset = parameterMap.keySet();//把键存到Set集合中
        for (String name2 : keyset) {
            //获取键获取值
            String[] values = parameterMap.get(name2);
            System.out.println(name2);
            for (String value : values) {
                System.out.println(value);
            }
            System.out.println("-----------------");
        }
    }




    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //GET获取请求参数
        /*final String name = request.getParameter("username");
        System.out.println("get");
        System.out.println(name);*/
        this.doPost(request,response);
    }
}
