package controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

public class ServletDemo extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
//      1、  请求行中的参数部分，只能显示以get方式发出的参数，post方式的看不到
        String queryString=req.getQueryString();
        System.out.println(queryString);
//       2、 用于遍历所有的参数，并返回Map类型。(编写框架时常用)
        Map<String, String[]> map=req.getParameterMap();
        System.out.println(map);
//       3、 浏览器发出请求的资源名部分，去掉了协议和主机名"
        String requestURI=req.getRequestURI();
        System.out.println(requestURI);
//      4、  浏览器发出请求时的完整URL，包括协议 主机名 端口(如果有)"
        StringBuffer sb=req.getRequestURL();
        System.out.println(sb);
//      5、 获取请求路径
        String servletPath=req.getServletPath();
        System.out.println(servletPath);
        String contextPath=req.getContextPath();
        System.out.println(contextPath);
//       6、获取请求方式
        String method=req.getMethod();
        System.out.println(method);

    }
}
