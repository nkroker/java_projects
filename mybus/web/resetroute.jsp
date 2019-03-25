<%-- 
    Document   : resetroute
    Created on : 5 Jun, 2017, 5:06:21 PM
    Author     : Payal Panchal
--%>

<%@page import="java.lang.String"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%
    try{
       
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybusloc","root","");    
        PreparedStatement pst = conn.prepareStatement("truncate table manageroute;");
  int i=pst.executeUpdate();                      
        if(i>0) 
        {
        response.sendRedirect("manageroutes.jsp");  
        }
        else
           out.println("Not Reset please try again....!");            
               }
   catch(Exception e){ 
      
       out.println("Something went wrong !! Please try again");       
   }      
%>
