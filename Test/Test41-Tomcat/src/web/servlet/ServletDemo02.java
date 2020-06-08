package web.servlet;

import javax.servlet.*;
import java.io.IOException;

/***
 * Servlet的方法
 *
 */
public class ServletDemo02 implements Servlet {
    /***
     * 初始化方法
     * 在servlet被创建时，执行，只会执行一次
     * @param servletConfig
     * @throws ServletException
     */
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init。。。");
    }

    /***
     *获取getServletConfig对象
     * getServletConfig：Servlet的配置对象
     * @return
     */
    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /***
     * 提供服务的方法
     * 每一次Servlet被访问时，执行，执行多次
     * @param servletRequest
     * @param servletResponse
     * @throws ServletException
     * @throws IOException
     */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service。。。");
    }

    /***
     * 获取servlet的一些信息，版本，作者
     * @return
     */
    @Override
    public String getServletInfo() {
        return null;
    }

    /***
     * 销毁方法
     * 在服务器正常关闭时，执行，执行一次
     * 类似临终遗言，在Servlet销毁前执行
     */
    @Override
    public void destroy() {
        System.out.println("destroy。。。");
    }
}
