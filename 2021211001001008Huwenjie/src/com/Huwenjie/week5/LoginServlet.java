package com.Huwenjie.week5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,HttpServletResponse.setContentType("text/html"));
    PrintWriter out=response.getWriter();
    out.println("<HTML>");
    out.println("<HEAD><TITLE>Usingervlets</TITLE></HEAD>");
    out.println("<BODY BGCOLOR=#123123>");
    @Override
    public void init() throws ServletException{
        super.init();
        //TODO 1:GET 4 CONTEXT PARAM - DRIVER,URL,USERNAME,PASSWORD
        //TODO 2:GET JDBC connection
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
