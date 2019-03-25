/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputp;
import java.util.*;
/**
 *
 * @author Nikhil
 */
public class InputP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,d;
        System.out.println("Please enter two numbers for addition\n");
        Scanner inp=new Scanner(System.in);
        
        a=inp.nextInt();
        b=inp.nextInt();
        
        c=a+b;
        
        System.out.println("Your answer is: "+c);
        
        System.out.println("\nNow let's check if the outcome is even or odd\n");
        
        
        
        if(c%2==0)
        {
            System.out.println("The given input number is EVEN");
        }
        else
        {
            if(c%3==0)
            {
            System.out.println("The given input number is ODD");
            }
            
            
        }
                
        
        
        
    }
    
}
