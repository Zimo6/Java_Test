package cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 在服务器中的Servlet判断是否有一个名为lastTime的cookie
 1. 有：不是第一次访问
 1. 响应数据：欢迎回来，您上次访问时间为:2018年6月10日11:50:20
 2. 写回Cookie：lastTime=2018年6月10日11:50:01
 2. 没有：是第一次访问
 1. 响应数据：您好，欢迎您首次访问
 2. 写回Cookie：lastTime=2018年6月10日11:50:01
 */
@WebServlet("/CookieDemoTest")
public class CookieDemoTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置响应的消息体的数据格式以及编码
        response.setContentType("text/html;charset=utf-8");

        //1.获取所有的Cookie
        final Cookie[] cookies = request.getCookies();
        //2.遍历cookie数组
        if (cookies != null && cookies.length > 0 ){
            for (Cookie c : cookies) {
                //3.获取cookie名称
                 String name = c.getName();
                //4.判断名称是否为lastTime
                if("lastTime".equals(name)){
                    //有cookie，不是第一次访问
                    //响应数据，获取cookie的value，时间
                     String value = c.getValue();
                     //解码
                    String decode = URLDecoder.decode(value, "utf-8");
                    c.setValue(decode);
                    response.getWriter().write("<h1>欢迎回来，您上次访问时间为:"+decode+"<h1>");

                    //再次记录一次cookie，获取当前时间的字符串，重新发送
                    Date date = new Date();
                    SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
                    String time = sdf.format(date);
                    //由于Tomcat8不支持特殊字符 空格   这里将time编码
                    String encode= URLEncoder.encode(time, "utf-8");
                    c.setValue(encode);
                    //设置cookie的存活时间
                    c.setMaxAge(60*60*24*30);//一个月
                    response.addCookie(c);

                    break;
                }
            }
        }else{
            //如果是第一次访问
            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
            String time = sdf.format(date);
            //编码
            String time_encode = URLEncoder.encode(time, "utf-8");
            Cookie c = new Cookie("lastTime",time_encode);
            c.setMaxAge(60*60*24*30);
            response.addCookie(c);
            response.getWriter().write("<h1>您好，欢迎您首次访问!<h1>");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
