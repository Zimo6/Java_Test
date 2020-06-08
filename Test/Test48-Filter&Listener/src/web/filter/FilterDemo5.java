package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
/*
* * 拦截方式配置：资源被访问的方式
			* 注解配置：
				* 设置dispatcherTypes属性
					1. REQUEST：默认值。浏览器直接请求资源
					2. FORWARD：转发访问资源
					3. INCLUDE：包含访问资源
					4. ERROR：错误跳转资源
					5. ASYNC：异步访问资源
			* web.xml配置
				* 设置<dispatcher></dispatcher>标签即可
*
*/
//浏览器直接请求资源时，该过滤器会被执行
//(这里直接访问index.jsp会被拦截，通过UpdateServlet转发则不会被拦截)
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.REQUEST)

//转发会被拦截
//@WebFilter(value = "/index.jsp",dispatcherTypes = DispatcherType.FORWARD)

//直接或者转发都会被拦截
//@WebFilter(value = "/index.jsp",dispatcherTypes = {DispatcherType.FORWARD,DispatcherType.REQUEST})
public class FilterDemo5 implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo5...");
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {

    }


}
