package com.example.demo.Filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @program: demo
 * @description:
 * @author: DBC
 * @create: 2020-02-24 23:19
 **/
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter process...");
        chain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
