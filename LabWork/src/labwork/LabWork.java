/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labwork;

import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

public class LabWork {

    private int marks[] = new int[5],count=0;
    private String name, rollNo;
    private double percentage=0;
   
    
   LabWork()
   {
       out.println("Please Enter the details asked: ");
   }
   
   public void set()
   {
       Scanner inp = new Scanner(in);
       
      out.print("Please Enter Your name: ");
      name = inp.nextLine();
      
      
      out.print("\nPlease Enter your rollno: ");
      rollNo = inp.next();
      
      
      out.println("\nNow please enter the marrks of the subjects one by one");
      
      for(int i=0;i<5;i++)
      {
          out.print("\nSubject: "+(i+1)+": ");
           marks[i] = inp.nextInt();
           if(marks[i]<33)
           {
               count++;
           }
           percentage = percentage+marks[i];
      }
      
      
      
   }
   
   
   
   public void get()
   {
       out.println("Name: "+name);
       out.println("Roll no: "+rollNo);
       percentage = percentage/5;       
       out.println("Percentage: "+percentage); 
       
       if(count!=0)
       {
           out.println("status: FAIL");
       }
       else
       {
           out.println("status: PASS");
       }
              
   }
   
   
    
}
