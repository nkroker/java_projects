
package inheritance;

import static java.lang.System.out;
import static java.lang.System.in;
import java.util.Scanner;


public class Parent {
    
    int a,c,b;
    
    public int get()
    {
        Scanner inp = new Scanner(in);
        out.println("Please Enter two numbers\n\n");
        out.print("Please enter the first no: ");
        a=inp.nextInt();
        out.print("\nPlease enter the first no: ");
        b= inp.nextInt();
        
        c=a+b;
        
        
        
        new Second().get2();
        return c;
    }
    
    
    
}
