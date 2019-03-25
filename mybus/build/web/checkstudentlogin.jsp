<%-- 
    Document   : tempo
    Created on : 27 april, 2017, 5:32:53 PM
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
  
      Class.forName("com.mysql.jdbc.Driver"); 
 // MySQL database connection
     
   Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybusloc","root","");    
     
   PreparedStatement pst = conn.prepareStatement("select username,password from studentlog where username=? and password=?");
        
pst.setString(1,username);
     
pst.setString(2,password);
      
  ResultSet rs = pst.executeQuery();                      
      
  if(rs.next()) 
        {
        response.sendRedirect("student.jsp");  
        }
        else
        
   out.println("Invalid login credentials");            
               }
 
  catch(Exception e){ 
      
   
    out.println("Something went wrong !! Please try again");       
   }     
 
%>


