/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jdbc.demo;

import static java.lang.System.out;
import static java.lang.System.in;
import java.sql.*;
import java.util.Scanner;

public class JDBCDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
        //insert into Demo.Student(name,email)values('xyz', 'abc@gmail.com');
       
        
        Scanner inp = new Scanner(in);
        
        out.println("Please select an operation");
        out.println("  ->add");
        out.println("  ->fetch");
        out.print("Please enter your choice: ");
        
        String choice = inp.next();
        
        choice = choice.toLowerCase();
        
        
        
        switch(choice)
        {    
            
            
            
            
            case "add":
            {
                out.println("\n let's add some details: \n   Please Enter the details: \n");
                        
                        
                 out.println("Name: ");
                 String name = inp.nextLine();
                 
                 out.print("\nEmail: ");
                 String email = inp.nextLine();
                        
                 
                 try
                 {
                     String Quiry1 = "insert into Demo.Student(name, email)values('"+name+"' , '"+email+"')";
                     
                     
                     
                     
                     
                     Class.forName("com.mysql.jdbc.Driver");
                            //3rd step
        
                            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Demo", "root", "root");
        
                            Statement st = con.createStatement();
        
                            ResultSet rs = st.executeQuery(Quiry1);
                            /*rs.next();
                            String dNm = rs.getString(Quiry1);
        
                            out.println(dNm);*/
                            
                            out.println(Quiry1);
        
                            con.close();
                     
                     
                 }// closing of Try block
                 
                 
                 catch(Exception e){}
                        
                        
            } break;  //closing of case ADD
            
            
            
            
            
            
        
        /*******************Here the fetching operation takes place***********************/
            case "fetch" : 
        {
        String name;
        
        out.println("Please enter the name whose data you want to see");
        name = inp.next();
        
        try
        {
            
            String Quiry2 = "select *from where name = "+name;
            
            //2nd step
        Class.forName("com.mysql.jdbc.Driver");
        //3rd step
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/Demo", "root", "0 ");
        
        Statement st = con.createStatement();
        
        ResultSet rs = st.executeQuery(Quiry2);
        rs.next();
        String dNm = rs.getString(Quiry2);
        
        out.println(dNm);
        
        con.close();
        
                
        }
        catch(Exception ex)
        {
            
        }
    }  break;//closing of case fetch
        
        
        
        
            default: 
            {
                out.println("Please enter the correct choice:( ");
            }
        
    }  //closing of switch   
        
        
    }
    
}
