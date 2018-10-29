package com.example.controller;

import com.example.model.BeerExpert;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Administrator on 2018/10/29.
 */
@WebServlet(name="beerSelect", urlPatterns = "/beerSelect")
public class BeerSelect extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*resp.setContentType("text/html;charset=utf-8");
        PrintWriter out = resp.getWriter();

        out.println("Beer Selection Advice<br>");
        String c = req.getParameter("color");
        // out.println("<br>Got beer color" + c);

        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);
        Iterator it =  result.iterator();
        while(it.hasNext()) {
            out.println("<br>try: " + it.next());
        }*/

        String c = req.getParameter("color");

        BeerExpert be = new BeerExpert();
        List result = be.getBrands(c);

        req.setAttribute("styles", result);

        // 转发
        RequestDispatcher view = req.getRequestDispatcher("beerResult.jsp");
        view.forward(req, resp);
    }
}

