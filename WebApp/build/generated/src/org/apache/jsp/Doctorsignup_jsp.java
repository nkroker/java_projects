package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.awt.Component;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public final class Doctorsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title>Donor</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("                background:url('doctorbackgg.jpg');\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("           \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("    function  validate()\n");
      out.write("    {\n");
      out.write("        if(frm.upName.value===0)\n");
      out.write("            alert('Name is required');\n");
      out.write("        \n");
      out.write("        if(frm.upEmail.value===0)\n");
      out.write("            alert('Email is required');\n");
      out.write("        if(frm.upContact.value===0)\n");
      out.write("            alert('contact is required');\n");
      out.write("        if(frm.upUsername.value===0)\n");
      out.write("            alert('Username is required');\n");
      out.write("        if(frm.upAge.value===0)\n");
      out.write("            alert('Age is required');\n");
      out.write("        if(frm.upAddress.value===0)\n");
      out.write("            alert('Address is required');\n");
      out.write("        if(frm.upGovid.value===0)\n");
      out.write("            alert('Gov ID is required');\n");
      out.write("        if(frm.upPname.value===0)\n");
      out.write("            alert('Patirnts name are required');\n");
      out.write("        if(frm.upSalary.value===0)\n");
      out.write("            alert('Salary is required');\n");
      out.write("        if(frm.upPass1.value===0)\n");
      out.write("            alert('Password is required');\n");
      out.write("        if(frm.upPass2.value===0)\n");
      out.write("            alert('Confirmation Password is required');\n");
      out.write("        if(frm.upWork.value===0)\n");
      out.write("            alert('Work time is required');\n");
      out.write("        if(frm.upDOJ.value===0)\n");
      out.write("            alert('Date Of Joining is required');\n");
      out.write("        if(upPass1!==upPass2)\n");
      out.write("        {\n");
      out.write("        alert('Password and confirmation Password is not matched');\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <form>\n");
      out.write("<center>\n");
      out.write("    <table action=\"Signup.jsp\">\n");
      out.write("        <h1>Doctor's SignUp</h1>\n");
      out.write("    <tr>\n");
      out.write("        <td>Name: </td>\n");
      out.write("        <td><input type=\"text\" name=\"name\" name=\"upName\"></td>\n");
      out.write("        ");

          String name=request.getParameter("upName");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>Email: </td>\n");
      out.write("        <td><input type=\"text\" name=\"upEmail\"></td>\n");
      out.write("        ");

          String email=request.getParameter("upEmail");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>Contact: </td>\n");
      out.write("        <td><input type=\"text\" name=\"upContact\"></td>\n");
      out.write("        ");

          String contact=request.getParameter("upContact");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>Username: </td>\n");
      out.write("        <td><input type=\"text\" name=\"upUsername\"></td>\n");
      out.write("        ");

          String username=request.getParameter("upUsername");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>age: </td>\n");
      out.write("        <td><input type=\"text\" name=\"upAge\"></td>\n");
      out.write("        ");

          String age=request.getParameter("upAge");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>address: </td>\n");
      out.write("        <td><input type=\"text\" name=\"upAddress\"></td>\n");
      out.write("        ");

          String address=request.getParameter("upAddress");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>Government ID no: </td>\n");
      out.write("        <td><input type=\"text\" name=\"upGovid\"></td>\n");
      out.write("        ");

          String govid=request.getParameter("upGovid");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>Patient you are handling: </td>\n");
      out.write("        <td><input type=\"text\" name=\"upPname\"></td>\n");
      out.write("        ");

          String patient = request.getParameter("upPname");

        
      out.write("\n");
      out.write("        \n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>Salary: </td>\n");
      out.write("        <td><input type=\"text\" name=\"upSalary\"></td>\n");
      out.write("        ");

          String salary = request.getParameter("upSalary");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>Password: </td>\n");
      out.write("        <td><input type=\"password\" name=\"upPass1\"></td>\n");
      out.write("        ");

          String pass1 = request.getParameter("upPass1");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>Confirm Password: </td>\n");
      out.write("        <td><input type=\"password\" name=\"upPass2\"></td>\n");
      out.write("        ");

          String pass2 = request.getParameter("upPass2");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>Work Time: </td>\n");
      out.write("        <td><input type=\"text\" name=\"upWork\"></td>\n");
      out.write("        ");

          String work = request.getParameter("upWork");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("        <tr>\n");
      out.write("        <td>Date of Joining: </td>\n");
      out.write("        <td><input type=\"date\" name=\"upDOJ\"></td>\n");
      out.write("        ");

          String doj = request.getParameter("upDOJ");

        
      out.write("\n");
      out.write("    </tr>\n");
      out.write("    \n");
      out.write("    <tr>\n");
      out.write("        \n");
      out.write("        <td><input type=\"submit\" value=\"SignUp\" name=\"submit\" onclick=\"validate()\"></td>\n");
      out.write("        <td><input type=\"reset\" value=\"Reset\"></td>\n");
      out.write("        <td><input type=\"button\" value=\"Cancel\" name=\"cancel\"></td>    \n");
      out.write("    </tr>\n");
      out.write("    ");

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
        

      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("</table>\n");
      out.write("</center>\n");
      out.write("</form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
