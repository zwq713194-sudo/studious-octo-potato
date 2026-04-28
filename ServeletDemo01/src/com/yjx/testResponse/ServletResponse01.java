package com.yjx.testResponse;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/yjx/sr01")
public class ServletResponse01 extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //响应数据
        //字符输出流
        resp.getWriter().write("hi..servletResponse");
        resp.getWriter().println("hello");
        //字节输出流
        //resp.getOutputStream().write("hi".getBytes());
        //设置响应头
        resp.setHeader("a","lili");
        resp.setHeader("b","lulu");
        resp.setHeader("a","feifei");
        //设置响应头
        resp.addHeader("c","小明");
    }
}
