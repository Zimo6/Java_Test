package cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/CookieDemo2")
public class CookieDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //3.获取Cookie
        final Cookie[] cookies = request.getCookies();
        //4.遍历cookie
        if (cookies != null){
            for (Cookie cookie : cookies) {
                final String name = cookie.getName();
                final String value = cookie.getValue();
                System.out.println(name +"="+value);
            }
            /*
            【谷歌浏览器多三个cookie 】
            msg=hellocookie
            JSESSIONID=00112E9B1ECA88589265A35D622494B4
            bdshare_firstime=1562208399892
            Idea-f60c4641=342e6d5b-63f6-403e-9cb8-f2675a35bf2b
            */
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
