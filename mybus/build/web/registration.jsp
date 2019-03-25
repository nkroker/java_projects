<%-- 
    Document   : selectroute
    Created on : 22 april, 2017, 10:33:26 PM
    Author     : Payal Panchal
--%>
<%@page import="java.lang.String"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>

<%
    try{
        String username = request.getParameter("username");   
        String password = request.getParameter("password");
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybusloc","root","");    
        PreparedStatement pst = conn.prepareStatement("insert into studentlog values(?,?)");
 
        pst.setString(1,username);
        pst.setString(2,password);
         int i=pst.executeUpdate();              
        if(i>0) 
        {
         out.println("registered succefully...."); 
         response.sendRedirect("addstudent.jsp");  
        }
        else
           out.println("no registered....!try again");            
               }
   catch(Exception e){ 
      
       out.println("Something went wrong !! Please try again");       
   }      
%>