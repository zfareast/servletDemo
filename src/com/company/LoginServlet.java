package com.company;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2018/10/26.
 */
//@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置字符编码
        req.setCharacterEncoding("utf8");

        // 从 request 对象中获取 username, password
        String username = req.getParameter("username");
        String password = req.getParameter("password");

        HttpSession session = req.getSession();

        // 判断是否为管理员
        if ("administrator".equals(username) && "123456".equals(password)) {
            // 登录成功，设置 session
            session.setAttribute("user", "管理员，欢迎你！");
        } else {
            session.setAttribute("user", "登录信息错误，请检查用户名或密码");
            // TODO 添加5秒后返回登录页面的逻辑
        }

        // 将页面转发到欢迎页面
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/welcome.jsp");
        requestDispatcher.forward(req, resp);
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        out.write("login get method");
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
