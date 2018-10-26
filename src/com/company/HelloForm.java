package com.company;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2018/10/23.
 */
//@WebService
@WebServlet(name = "HelloForm", urlPatterns = "/helloForm")
public class HelloForm extends HttpServlet {

    public HelloForm() {
        super();
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        String title = "使用 GET 方法读取表单数据";

        //String name = new String(req.getParameter("name").getBytes("ISO8859-1"),"utf-8");
        String docType = "<!DOCTYPE html>\n";

        out.println(
            docType + "<html> \n" +
                "<head><title>"+ title +"</title></head> \n"+
                "<body bgcolor=\"#f0f0f0\"> \n" +
                    "<h1 align=\"center\">"+title+"</h1> \n" +
                    "<ul> \n" +
                        "<li><b>站点名</b>:" + req.getParameter("name") + "</li>" +
                        "<li><b>网址</b>:" + req.getParameter("url") + "</li>" +
                    "</ul> \n" +
                "</body> \n" +
            "</html>"
        );
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
