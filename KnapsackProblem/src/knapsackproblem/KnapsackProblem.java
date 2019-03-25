
package knapsackproblem;


import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.max;



public class KnapsackProblem {

    int i,w;
    
    static
    {
        out.println("Welcome to the Knapsack Solver");
    }
    
    
    
    public void knapS(int W1,int w1[],int p1[],int n)
    {
        
           // here we are declaring the integer variables for running the operational loops
        int[][] K = new int[n+1][W1+1];  //here we are declaring the 2D array for storing the answer values
        
        for(i=0;i<=n;i++)
        {
            
            for(w=0;w<=W1;w++)
            {
                
                if(w==0||i==0)//We are putting the '0' in the first row and the first column of our output 2D matrix here 
                {
                    K[i][w] = 0;
                } //filling '0' close here
                else
                {
                    if(w1[i-1]<=W1)  //Here the current weight is greater or equals to the weight of the item
                    {
                        K[i][w] = max(K[i-1][w],p1[i-1]+K[i-1][w-w1[i-1]]);  //comparing the previous and the weight back + profit value
                    }  // closing true knapsack condition
                    else
                    {
                           K[i][w] = K[i-1][w]; // copying the previous value of that place 
                    } // closing false knapsack condition
                    
                } //closing the bigger else
                
            }   //closing the second operational loop which runs for checking the different weight capacity
            
        }// closing of first operational loop which runs for the items in Knapsak
        
        
        // return K[n][W1];
        
        
        //Now let's print our answer 
        for(int i=0;i<=n;i++)
        {
            
            for(int w =0;w <=W1;w++)
            {
                out.println(K[i][w]+"\t");
            }
            
        }
      
        
    }  //closing of knapSack method
    
    
    
    public static void main(String[] args) 
    {
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
        

        
//        int[][] K1 = new int[item+1][W+1];
//        //knapSack(int W1,int w1[],int p1[],int n)



                        knapS(W,w[],p[],item);
          
          
          
        }  // closing of main method
        
        
        
        
        
    }  //closing of class 
    

