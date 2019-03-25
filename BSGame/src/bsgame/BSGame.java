package bsgame;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class BSGame {

    
    static
    {
        out.println("Welcome To Binary Search game :)");
    }
    
    
    public static void main(String[] args) {
        Scanner inp = new Scanner(in);
        
        int high=100,low=0,mid,count=0;
        String ans="no";
        
        out.println("Guess a number between 'o' to '100'\n \t and I'm gonna tell you that number");
        out.println("Enter your suggestions as 'high'  or  'low' and 'correct'");
        
        
        while(count!=1)
        {
            mid=((high+low)/2);
            out.println("Is this correct: "+ mid);
            ans = inp.nextLine();
            ans = ans.toLowerCase();
            
            switch(ans)
            {
                
                case "high":
                {
                    low=mid-1;
                } break;
                
                case "low":
                {
                    high=mid + 1;
                } break;
                
                case "correct":
                {
                    count=1;
                } break;
                
                default:
                {
                    out.println("Please Enter the correct choice :(");
                } break;
            }
           
           
        }
        if(count==1)
            {
                out.println("Hurrey we did it!!! :)");
            }
        
        
    }
    
}
