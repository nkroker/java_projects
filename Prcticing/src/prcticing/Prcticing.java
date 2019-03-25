
package prcticing;

import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;
import static java.lang.Math.max;



public class Prcticing {
    
    
    
    static
    {
        out.println("Hello Nikhil");
    }
    
    
    
    public static void main(String[] args) 
    {
    try
    {
        Scanner inp = new Scanner(in);
        
        out.println("Are you want to calculate max values between two values\n If yes then press 'y' if no then press 'n'");
        
        out.println("Please Enter a character");
        char choice = inp.next().charAt(0);
        
                if(choice=='y')
                {
                    out.println("Please enter the values");
                    out.print("First: ");
                    int first = inp.nextInt();
                    
                    out.print("Second: ");
                    int second = inp.nextInt();
                    
                    out.println(max(first,second));
                }
                else if(choice=='n')
                {
                    Runtime ref = Runtime.getRuntime();
            
                            ref.exec("shutdown -l");
                }
    }catch(Exception ex)
    {
        
    }
        
    }
    
}
