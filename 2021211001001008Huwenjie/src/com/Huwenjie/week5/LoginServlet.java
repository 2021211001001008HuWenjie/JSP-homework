package com.Huwenjie.week5;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

@WebServlet(name = "LoginServlet", value = "/Login")
public class LoginServlet extends HttpServlet {
    Connection con=null;
    @Override
    public void init() throws ServletException{
        //TODO 1:GET 4 CONTEXT PARAM - DRIVER,URL,USERNAME,PASSWORD
        //TODO 2:GET JDBC connection
        super.init();
        con=(Connection) getServletContext().getAttribute("com");
    }

    /*public void doPost(HttpServletRequest request,HttpServletResponse.setContentType("text/html"));
    PrintWriter out=response.getWriter();
    out.println("<HTML>");
    out.println("<HEAD><TITLE>Usingervlets</TITLE></HEAD>");
    out.println("<BODY BGCOLOR=#123123>");*/

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        //TODO 3:GET REQUEST PARAMETER - USERNAME AND PASSWORD
        String username=request.getParameter("username");
        String password=request.getParameter("username");
        //TODO 4:VALIDATE USER - SELECT * FROM USER TABLE WHERE USERNAME='XXX'
        // AND PASSWORD='YYY'
        String sql="select id,username,password,email,gender,birthdate from user_info where username";
        try{
            ResultSet rs=con.createStatement().executeQuery(sql);
            if(rs.next){
                request.setAttribute("id",rs.getInt("id"));
                request.setAttribute("username",rs.getInt("username"));
                request.setAttribute("password",rs.getInt("password"));
                request.setAttribute("email",rs.getInt("email"));
                request.setAttribute("gender",rs.getInt("gender"));
                request.setAttribute("birthdate",rs.getInt("birthdate"));
                request.getRequestDispatcher("userInfo.jsp").forward(request,response);
            }else{
                request.setAttribute("message","username or password error!");
                request.getRequestDispatcher("login.jsp").forward(request,response);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
