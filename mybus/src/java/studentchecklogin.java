/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import javax.servlet.http.*;
import javax.servlet.*;
import java.sql.*;
public class studentchecklogin extends HttpServlet {
 
    private static final long serialVersionUID = 1L;
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection conn= (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/mybusloc" + "username=root&password=");    
        PreparedStatement pst= (PreparedStatement) conn.prepareStatement("Select username,password from login where username=? and password=?");
            pst.setString(1, username);
            pst.setString(2, password);
           ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                out.println("Correct login credentials");
                request.getRequestDispatcher("/WEB-INF/student.jsp").forward(request, response);
            } 
            else {
                out.println("Incorrect login credentials");
            }
        } 
        catch (ClassNotFoundException | SQLException e) {
        }
    }
}
