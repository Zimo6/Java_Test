package web.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
/*
* 		* 拦截路径配置：
			1. 具体资源路径： /index.jsp   只有访问index.jsp资源时，过滤器才会被执行
			2. 拦截目录： /user/*	访问/user下的所有资源时，过滤器都会被执行
			3. 后缀名拦截： *.jsp		访问所有后缀名为jsp资源时，过滤器都会被执行
			4. 拦截所有资源：/*		访问所有资源时，过滤器都会被执行
* */
//@WebFilter("/index.jsp") //1.具体路径：  /index.jsp 只有访问index.jsp资源时，过滤器才会被执行
//@WebFilter("/user/*")     //
//@WebFilter("*.jsp") //后缀拦截
public class FilterDemo4 implements Filter {
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("FilterDemo4...");
        chain.doFilter(req, resp);
        System.out.println("我又被放行啦！");
    }

    public void init(FilterConfig config) throws ServletException {

    }

    public void destroy() {

    }


}
