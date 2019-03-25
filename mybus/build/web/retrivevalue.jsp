<%-- 
    Document   : retrivevalue
    Created on : 7 Jun, 2017, 9:31:11 AM
    Author     : Payal Panchal
--%>

<%@page import="java.lang.String"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.io.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <body>
        <form action="studentviewroutes.jsp" method="post">
            <%

                try {

                    Class.forName("com.mysql.jdbc.Driver");  // MySQL database connection
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mybusloc", "root", "");
                    PreparedStatement pst = conn.prepareStatement("select route from manageroute;");
                    ResultSet rs = pst.executeQuery();

                    while (rs.next()) {
                          
      
   
                        String r1 = rs.getString(1);
                        int a = Integer.parseInt(r1);
                        String r2 = rs.getString(2);
                        String r3 = rs.getString(3);
                        String r4 = rs.getString(4);
                        String r5 = rs.getString(5);
                        String r6 = rs.getString(6);
                        String r7 = rs.getString(7);
                        String r8 = rs.getString(8);
                        String r9 = rs.getString(9);
                        String r10 = rs.getString(10);
       
   
                        out.println(" " + r1);
                        out.println(" " + r2);
                        out.println(" " + r3);
                        out.println(" " + r4);
                        out.println("" + r5);
                        out.println("" + r6);
                        out.println("" + r7);
                        out.println("" + r8);
                        out.println("" + r9);
                        out.println("" + r10);
                    }
                } catch (Exception e) {
                    out.println("Something went wrong !! Please try again");
                }

            %>
        </form>
    </body>
</html>

