package com.Huwenjie.week4.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
@WebServlet(
        urlPatterns = {"/jdbc"},
        initParams = {
                @WebInitParam(name="driver",value="com.mysql.cj.jdbc.Driver"),
                @WebInitParam(name="url",value="jdbc:mysql://localhost:3306/user_info"),
                @WebInitParam(name="username",value="root"),
                @WebInitParam(name="password",value="111111"),
},loadOnStartup = 1
//        static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
//        static final String DB_URL = "jdbc:mysql://localhost:3306/student_mark_db?useSSL=false&serverTimezone=UTC";
//        public static final String URL = "jdbc:mysql://localhost:3306/student_mark_db";
//        public static final String USER = "root";
//        public static final String PASSWORD = "111111";
)
public class JDBCDemoServlet extends HttpServlet {


    Connection con = null;
    @Override
    public void init() throws ServletException{
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/user_info";
        String username = "root";
        String password = "111111";

        try{
            Class.forName(driver);
            con = DriverManager.getConnection(url,username,password);
            System.out.println("--> " + con);
        }catch(ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("I am in doGet()");
        String sql = "SELECT * FROM usertable";
        try{
            ResultSet rs = con.createStatement().executeQuery(sql);
            while(rs.next()){

            }
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        System.out.println("I am in doPost()");
    }

    @Override
    public void destroy(){
        super.destroy();
        try{
            con.close();
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
    }
}
