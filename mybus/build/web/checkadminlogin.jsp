<%-- 
    Document   : checkadminlogin.jsp
    Created on : 19 april, 2017, 7:41:33 PM
    Author     : Payal Panchal
--%>


<html>
<body>
<%
String u=request.getParameter("username");
String p=request.getParameter("password");
if ((u.equals("ellink"))&&(p.equals("ellink123"))) {
response.sendRedirect("admin.jsp");  
}else{
out.println("Sorry, invalid login");
}
%>
</body>
</html>