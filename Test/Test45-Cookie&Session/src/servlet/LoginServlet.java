package servlet;

import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1.设置request编码
        request.setCharacterEncoding("utf-8");

        //2.获取请求参数
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");
        //3.封装User对象
        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);
        UserDao dao = new UserDao();
        User user = dao.login(loginUser);

        HttpSession session = request.getSession();

        //3.获取生成的验证码
        String checkCode_session = (String) request.getSession().getAttribute("checkCode_session");
        //删除session存贮的验证码(验证码只有一次有效)
        session.removeAttribute("checkCode_session");
        //4.先判断验证码是否正确
        if (checkCode_session!=null && checkCode_session.equalsIgnoreCase(checkCode)){
            //验证码正确,则判断用户名密码是否正确
            if (user != null){
                //登录成功，存储用户信息
                session.setAttribute("user",user.getUsername());

                //重定向到登录成功
                response.sendRedirect(request.getContextPath()+"/success.jsp");
            }else{
                //存储提示信息
                request.setAttribute("login_error","用户名或密码错误");
                //转发到登录页面
                request.getRequestDispatcher("/login.jsp").forward(request,response);
            }

        }else{
            //存储提示信息
            request.setAttribute("cc_error","验证码错误");
            //转发到登录页面
            request.getRequestDispatcher("/login.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
