package com.yjx.testRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/sr03")
public class ServletRequest03 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String characterEncoding = req.getCharacterEncoding();
        System.out.println(characterEncoding);
        //获取前台数据
        String uname = req.getParameter("uname");
        System.out.println("frontend information name is: "+uname);
        //域对象数据的共享
        req.setAttribute("age","18");
        String age = (String)req.getAttribute("age");
        System.out.println("servlet03---age" + age);
        //请求转发
        req.getRequestDispatcher("sr04").forward(req,resp);
        //请求转发完成后输出一句话
        System.out.println("-----sr03");
    }
}
