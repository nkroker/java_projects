
package basicrevision;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.max;

public class BasicRevision {

    static
    {
        out.println("Please Enter Yout name");
     
    }
    
    public static void main(String[] args) 
    {
        
        Scanner inp = new Scanner(in);
        String name = inp.nextLine();
        
        out.println("Hello "+name);
        
    }
    
}
