package com.calapp.controller;

import com.calapp.model.Calculator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        int a=Integer.parseInt(req.getParameter("numberA"));
        int b=Integer.parseInt(req.getParameter("numberB"));

        int sum= Calculator.add(a, b);

        //We should take the help of jsp to render the data

        RequestDispatcher rd=req.getRequestDispatcher("show.jsp");
        req.setAttribute("result", sum);
        rd.forward(req, resp);
    }
}
