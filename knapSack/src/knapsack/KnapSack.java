/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package knapsack;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.max;

/**
 *
 * @author Nikhil
 */
public class KnapSack {

    /**
     * @param args the command line arguments
     */
    
    
    
    
//     static int max(int a, int b) 
//     {
//         return (a > b) ? a : b;
//     }

    
    
   static void knapSack(int W, int wt[], int val[], int n)
    {
        int i, w;
        int K[][] = new int[n + 1][W + 1];
	
	// Build table K[][] in bottom up manner
	for (i = 0; i <= n; i++)
	{
		for (w = 0; w <= W; w++)
		{
                    if (i==0 || w==0)
				K[i][w] = 0;
			
			else if (wt[i-1] <= w)
				K[i][w] = max( K[i - 1][w], val[i - 1] + K[i - 1][w - wt[i - 1]]);
			else
				K[i][w] = K[i - 1][w];
		}
	}
	
	//return K[n][W];
	
	for(i=0;i<=n;i++)
	{
	    for(w=0;w<=W;w++)
	    {
	        System.out.print(K[n][w]+"\t");
	    }
	    System.out.println("\n");
	}
	
    }
    
    
    
    
    
    
    
    
    public static void main(String[] args) {
       
        Scanner inp = new Scanner(in);
        
         int n,W;
        
        
        out.print("Please enter the total no of items in your knapsack: ");     
        n = inp.nextInt();
        
        out.print("\nPlease Enter the heighest weight capacity of your knapsack: ");
        W = inp.nextInt();
        
        
        
        
        
    int val[] = new int[n];
    int wt[] = new int[n];
    
     out.println("\nNow let's enter the each item's weight and profit");
        
        for(int i =0; i<n;i++)
        {
            out.println("Please enter the weight and profit of "+ i+1 +"th item");
            out.print("weight: ");
            wt[i] = inp.nextInt();
            
            
            out.print("profit: ");
            val[i] = inp.nextInt();            
        }
    
    
    knapSack(W, wt, val, n);
        
        
        
        
    }
    
}
