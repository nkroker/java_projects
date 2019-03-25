package lab2;

/**
 *
 * @author Nikhil
 */

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import java.util.Date;


public class Lab2 {

    
            static
            {
                out.println("Today's date is: "+ new Date());
            }
    
    
    public static void main(String...args) 
    {
        
        
        Scanner inp = new Scanner(in);
        
        int marks[] = new int[5];
        int i,j,sum=0;
        
        /*out.println("Please Enter the marks of 5 subjects one by one: ");
        for(i=0;i< marks.length;i++)
        {
            out.print("subject "+ i+1 +": ");
            marks[i]=inp.nextInt();
            sum = sum + marks[i];
        }
        
        double percent = sum/5;
        
        out.print("Your percentage is: "+percent);
        out.println("\nThankyou\n");*/
        
        
        out.println("Please enter 9 values: ");
        
        
        int matrix[][] = new int[3][3];
        
        for(i=0;i<3;i++)
        {
        for(j=0;j<3;j++)
        {
            matrix[i][j]= inp.nextInt();
        }
        }
        
        
        out.println("\n\nthe output is: \n");
        /*Output is done below*/
        
        for(i=0;i<3;i++)
        {
        for(j=0;j<3;j++)
        {
            out.print(matrix[i][j] + "\t");
            
        }
        out.print("\n");
        }
        
        
        
        
        
        
        
    }
    
}
