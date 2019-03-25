/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack2;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.max;


/**
 *
 * @author mr.Nikhil
 */
public class Knapsack2 {

    
//    static int max(int a, int b) { return (a > b)? a : b; }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
        
        
    {
        out.println("Welcome to the Knapsack Solver");
    }
        
        
        
        
        
        Scanner inp = new Scanner(in);
        
        int item,W;
        
        
        out.print("Please enter the total no of items in your knapsack: ");     
        item = inp.nextInt();
        
        out.print("\nPlease Enter the heighest weight capacity of your knapsack: ");
        W = inp.nextInt();
        
        
        int[] w = new int[item];
        int[] p = new int[item];
        
        
        out.println("\nNow let's enter the each item's weight and profit");
        
        for(int i =0; i<item;i++)
        {
            out.println("Please enter the weight and profit of "+ i+1 +"th item");
            out.print("weight: ");
            w[i] = inp.nextInt();
            
            
            out.print("profit: ");
            p[i] = inp.nextInt();            
        }
        
        
        
        
        
        int i,j;
        int[][] K = new int[item+1][W+1];  //here we are declaring the 2D array for storing the answer values
        
        for(i=0;i<=item;i++)
        {
            
            for(j=0;j<=W;j++)
            {
                
                if(j==0||i==0)//We are putting the '0' in the first row and the first column of our output 2D matrix here 
                {
                    K[i][j] = 0;
                } //filling '0' close here
                else if(w[i-1]<=j)  
                    {
                        
                        K[i][j]=max(K[i-1][j], p[i-1] + K[i-1][j-w[i-1]]);
                        
                    }  // closing true knapsack condition
                    else
                    {
                           K[i][j] = K[i-1][j]; // copying the previous value of that place 
                    } // closing false knapsack condition
                    
                
            }   //closing the second operational loop which runs for checking the different weight capacity
            
        }// closing of first operational loop which runs for the items in Knapsak
        
        
       
        
        
        //Now let's print our answer 
        
        
        out.println("\n\n**********The answer is**********");
        
        
        for(i=0;i<=item;i++)
        {
            
            for(j =0;j <=W;j++)
            {
                out.print(K[i][j]+"\t");
            }
            out.println("\n");
        }
       
    }
    
}
