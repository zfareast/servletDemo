package com.example.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Administrator on 2018/10/31.
 */
@WebServlet(name = "login", urlPatterns = "/login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 设置字符编码
        response.setCharacterEncoding("utf8");

        // 从 request 对象中获取 username, password
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        HttpSession session = request.getSession();

        // 判断是否为管理员
        if ("administrator".equals(username) && "123456".equals(password)) {
            // 登录成功，设置 session
            session.setAttribute("user", "管理员，欢迎你！");

            // 转发
            // RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
            // requestDispatcher.forward(request, response);

            response.sendRedirect("/HelloServlet/articles");
        } else {
            doGet(request, response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 转发
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
        requestDispatcher.forward(request, response);
    }
}
