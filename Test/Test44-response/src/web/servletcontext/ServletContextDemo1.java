package web.servletcontext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/servletContextDemo1")
public class ServletContextDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //ServletContex 对象的获取
        /*
          1. 通过request对象获取
		request.getServletContext();
	      2. 通过HttpServlet获取
		this.getServletContext();
        */
        //1. 通过request对象获取
        final ServletContext sc1 = request.getServletContext();

        //2. 通过HttpServlet获取
        final ServletContext sc2 = this.getServletContext();

        System.out.println(sc1);//org.apache.catalina.core.ApplicationContextFacade@47af5be7
        System.out.println(sc2);//org.apache.catalina.core.ApplicationContextFacade@47af5be7
        System.out.println(sc1==sc2);//true



    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }
}
