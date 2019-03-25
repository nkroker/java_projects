<%-- 
    Document   : Doctorsignup
    Created on : 25 May, 2017, 2:19:26 PM
    Author     : Nikhil
--%>


<%@page import="java.awt.Component"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>





<html>
    <head>
        
        <title>Donor</title>
        
        <style>
            
            body
            {
                background:url('doctorbackgg.jpg');
            }
            
            
            
            
        </style>
        
        
        
        
    </head>
    <body>
           
        
        
        
        
        
        
        <form>
<center>
    <table action="Signup.jsp">
        <h1>Doctor's SignUp</h1>
    <tr>
        <td>Name: </td>
        <td><input type="text" name="name" name="upName"></td>
        <%
          String name=request.getParameter("upName");

        %>
    </tr>
        <tr>
        <td>Email: </td>
        <td><input type="text" name="upEmail"></td>
        <%
          String email=request.getParameter("upEmail");

        %>
    </tr>
        <tr>
        <td>Contact: </td>
        <td><input type="text" name="upContact"></td>
        <%
          String contact=request.getParameter("upContact");

        %>
    </tr>
        <tr>
        <td>Username: </td>
        <td><input type="text" name="upUsername"></td>
        <%
          String username=request.getParameter("upUsername");

        %>
    </tr>
        <tr>
        <td>age: </td>
        <td><input type="text" name="upAge"></td>
        <%
          String age=request.getParameter("upAge");

        %>
    </tr>
        <tr>
        <td>address: </td>
        <td><input type="text" name="upAddress"></td>
        <%
          String address=request.getParameter("upAddress");

        %>
    </tr>
        <tr>
        <td>Government ID no: </td>
        <td><input type="text" name="upGovid"></td>
        <%
          String govid=request.getParameter("upGovid");

        %>
    </tr>
        <tr>
        <td>Patient you are handling: </td>
        <td><input type="text" name="upPname"></td>
        <%
          String patient = request.getParameter("upPname");

        %>
        
    </tr>
        <tr>
        <td>Salary: </td>
        <td><input type="text" name="upSalary"></td>
        <%
          String salary = request.getParameter("upSalary");

        %>
    </tr>
        <tr>
        <td>Password: </td>
        <td><input type="password" name="upPass1"></td>
        <%
          String pass1 = request.getParameter("upPass1");

        %>
    </tr>
        <tr>
        <td>Confirm Password: </td>
        <td><input type="password" name="upPass2"></td>
        <%
          String pass2 = request.getParameter("upPass2");

        %>
    </tr>
        <tr>
        <td>Work Time: </td>
        <td><input type="text" name="upWork"></td>
        <%
          String work = request.getParameter("upWork");

        %>
    </tr>
        <tr>
        <td>Date of Joining: </td>
        <td><input type="date" name="upDOJ"></td>
        <%
          String doj = request.getParameter("upDOJ");

        %>
    </tr>
    
    <tr>
        
        <td><input type="submit" value="SignUp" name="submit" onclick="validate()"></td>
        <td><input type="reset" value="Reset"></td>
        <td><input type="button" value="Cancel" name="cancel"></td>    
    </tr>
    
    
    
    <script>
    function validate()
    {
        if(frm.upName.value===0)
            alert('Name is required');
        
        if(frm.upEmail.value===0)
            alert('Email is required');
        if(frm.upContact.value===0)
            alert('contact is required');
        if(frm.upUsername.value===0)
            alert('Username is required');
        if(frm.upAge.value===0)
            alert('Age is required');
        if(frm.upAddress.value===0)
            alert('Address is required');
        if(frm.upGovid.value===0)
            alert('Gov ID is required');
        if(frm.upPname.value===0)
            alert('Patirnts name are required');
        if(frm.upSalary.value===0)
            alert('Salary is required');
        if(frm.upPass1.value===0)
            alert('Password is required');
        if(frm.upPass2.value===0)
            alert('Confirmation Password is required');
        if(frm.upWork.value===0)
            alert('Work time is required');
        if(frm.upDOJ.value===0)
            alert('Date Of Joining is required');
        if(upPass1!==upPass2)
        {
        alert('Password and confirmation Password is not matched');
        }
        
        submit();
    }
    </script>
    
    
    <script>
    function submit()
    {
    <%
        try
        {
            
             Class.forName("com.mysql.jdbc.Driver");
             Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/surrogate","root","root");
             PreparedStatement st=con.prepareStatement("insert into doctors values(?,?,?,?,?,?,?,?,?,?,?,?)");
             st.setString(1,name);
             st.setString(2,email);
             st.setString(3,contact);
             st.setString(4,username);
             st.setString(5,age);
             st.setString(6,address);
             st.setString(7,govid);
             st.setString(8,patient);
             st.setString(9,salary);
             st.setString(10,pass1);
             st.setString(11,work);
             st.setString(12,doj);
             
             st.executeUpdate();             
        }
        catch(Exception ex)
        {
            
        }
        
%>
        alert("Record is saved!!!");
}
    </script>
    
    
    
    
    
    
    
    
    
    
</table>
</center>
</form>
    </body>
</html>


