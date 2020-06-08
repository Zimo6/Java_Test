package web.servlet;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //response.setContentType("text/html;charset=utf-8");

        //设置响应的数据格式为json（ $.get()就不需要加"json" ）
        response.setContentType("application/json;charset=utf-8");

        //1.获取用户名
        String username = request.getParameter("username");
        //2.调用service层判断用户名是否存在
        Map<String,Object> map = new HashMap<>();
        if ("cui".equals(username)){
            //存在
            //                       {"userExsit":true,"msg","此用户名太受欢迎，请更换一个"}
            //                       {"userExsit":flase,"msg","用户名可用"}
            map.put("userExsit",true);
            map.put("msg","用户名可用");
        }else{
            map.put("userExsit",false);
            map.put("msg","此用户名太受欢迎，请更换一个");
        }

        //【两种方式都可以】
        //将map转换为json,并且传递给客户端
//        ObjectMapper mapper = new ObjectMapper();
//        mapper.writeValue(response.getWriter(),map);


        //将map转换为json,通过字符输出流传出
        ObjectMapper mapper1 = new ObjectMapper();
        String string = mapper1.writeValueAsString(map);
        response.getWriter().write(string);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
