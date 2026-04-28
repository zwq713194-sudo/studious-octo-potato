package com.yjx.testRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/sr04")
public class ServletRequest04 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取请求数据
        String uname = req.getParameter("uname");
        System.out.println("sr04获取uname的数值是: "+uname);
        //获取域对象中数据
        String age = (String)req.getAttribute("age");
        System.out.println("servlet04中的年龄数据是: "+age);
    }
}
