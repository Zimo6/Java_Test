package web.servletcontext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContextDemo2")
public class ServletContextDemo2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ServletContex 对象的获取
       /* 1. 获取MIME类型：
		* MIME类型:在互联网通信过程中定义的一种文件数据类型
		* 格式： 大类型/小类型   text/html		image/jpeg
		* 获取：String getMimeType(String file)
		**/
       //2.通过HttpServle获取
        final ServletContext sc = this.getServletContext();
        //3.定义文件名称
        String filename = "a.jpg";
        final String mimeType = sc.getMimeType(filename);
        System.out.println(mimeType);//image/jpeg
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
