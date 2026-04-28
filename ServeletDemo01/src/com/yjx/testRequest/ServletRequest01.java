package com.yjx.testRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

@WebServlet("/sr01")
public class ServletRequest01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");

        StringBuffer url = req.getRequestURL();
        System.out.println("客户端请求时的完整URL路径："+url);
        String uri = req.getRequestURI();
        System.out.println("客户端请求行的资源名："+uri);
        String queryString = req.getQueryString();
        System.out.println("客户端的请求行参数:"+queryString);
        String Method = req.getMethod();
        System.out.println("客户端的请求方式:"+Method);
        String protocol = req.getProtocol();
        System.out.println("http版本号:"+protocol);
        String contextPath = req.getContextPath();
        System.out.println("webapp的名字:"+contextPath);

        System.out.println("--------------------");
        String uname = req.getParameter("uname");
        System.out.println("指定uname参数为:"+uname);
        String pwd = req.getParameter("pwd");
        System.out.println("指定pwd参数为:"+pwd);
        String hobbies[] = req.getParameterValues("hobby");
        System.out.println("指定的hobby参数为:"+ Arrays.toString(hobbies));
    }
}
