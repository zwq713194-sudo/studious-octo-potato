package com.yjx.testResponse;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/red1")
public class ServletResponse03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取前台传过来的数据:
        String uname = req.getParameter("uname");
        System.out.println("前台传过来的数据uname :"+uname);
        //重定向
        resp.sendRedirect("/red2?uname="+uname);
        //
        System.out.println("重定向打印内容");
    }
}
