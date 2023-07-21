package com.calapp;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
//servlet is a peice of java code without main
public class CalServlet extends HttpServlet {

    public CalServlet(){
        System.out.println("ctr is called");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("init is called");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter out=resp.getWriter();
        out.print("hello all UKG champs!");
        System.out.println("doGet is called");
    }

    //call back
    @Override
    public void destroy() {
        //u can do some clean up
        System.out.println("destory is called");
    }

}

