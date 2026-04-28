package com.yjx.TestServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/s05")
public class Servlet05 extends HttpServlet {
    public Servlet05(){
        System.out.println("构造器被调用了");
    }
    public void init() throws ServletException{
        System.out.println("Servlet-init");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理业务");
    }

    @Override
    public void destroy() {
        System.out.println("销毁");
    }
}
