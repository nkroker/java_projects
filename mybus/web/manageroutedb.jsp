<%-- 
    Document   : manageroutedb
    Created on : 5 Jun, 2017, 5:16:21 PM
    Author     : Payal Panchal
--%>

<%@page import="java.lang.String"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>

<%
    try{
String r1=request.getParameter("route1");
String r2=request.getParameter("route2");
String r3=request.getParameter("route3");
String r4=request.getParameter("route4");
String r5=request.getParameter("route5");
String r6=request.getParameter("route6");
String r7=request.getParameter("route7");
String r8=request.getParameter("route8");
String r9=request.getParameter("route9");
String r10=request.getParameter("route10");
        Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybusloc","root","");    
 PreparedStatement pst1 = conn.prepareStatement("insert into manageroute values(?)");
 PreparedStatement pst2 = conn.prepareStatement("insert into manageroute values(?)");
 PreparedStatement pst3 = conn.prepareStatement("insert into manageroute values(?)");
 PreparedStatement pst4 = conn.prepareStatement("insert into manageroute values(?)");
 PreparedStatement pst5 = conn.prepareStatement("insert into manageroute values(?)");
 PreparedStatement pst6 = conn.prepareStatement("insert into manageroute values(?)");
 PreparedStatement pst7 = conn.prepareStatement("insert into manageroute values(?)");
 PreparedStatement pst8 = conn.prepareStatement("insert into manageroute values(?)");
 PreparedStatement pst9 = conn.prepareStatement("insert into manageroute values(?)");
 PreparedStatement pst10 = conn.prepareStatement("insert into manageroute values(?)");
 
        pst1.setString(1,r1);
        int a=pst1.executeUpdate(); 
         pst2.setString(1,r1);
        int b=pst2.executeUpdate();  
         pst3.setString(1,r3);
        int c=pst3.executeUpdate(); 
        pst4.setString(1,r4);
        int d=pst4.executeUpdate();  
         pst5.setString(1,r5);
        int e=pst5.executeUpdate();  
         pst6.setString(1,r6);
        int f=pst6.executeUpdate();  
         pst7.setString(1,r7);
        int g=pst7.executeUpdate();  
         pst8.setString(1,r8);
        int h=pst8.executeUpdate();  
         pst9.setString(1,r9);
        int i=pst9.executeUpdate();  
         pst10.setString(1,r10);
        int j=pst10.executeUpdate();  
       
        if(j>0) 
        { 
         response.sendRedirect("viewroute.jsp");  
        }
        else
           out.println("Not submitted plz try again...");            
               }
   catch(Exception e){ 
      
       out.println("Something went wrong !! Please try again");       
   }      
%>
