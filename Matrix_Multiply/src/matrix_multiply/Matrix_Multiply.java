
package matrix_multiply;

import java.util.Scanner;
import static java.lang.System.in;
import static java.lang.System.out;

public class Matrix_Multiply {

   
    static 
    {
        out.println("Welcome to Matrix multiply: ");
    }
    
    
    public static void main(String[] args) {
        
        Scanner inp = new Scanner(in);
        
        int i,j,n,m;
        int matrix1[][];
        int matrix2[][];
        
        out.println("Please enter the row and column of first matrix:");
        out.print("Rows: ");
        m = inp.nextInt();
        
        out.print("Columns: ");
        n = inp.nextInt();
        
        
        out.println("Please enter the row and column of Second matrix:");
        out.print("Rows: ");
        i = inp.nextInt();
        
        out.print("Columns: ");
        j = inp.nextInt();
        
        
        if(i==m && j==n)
        {
            
            matrix1 = new int[i][j];
            matrix2 = new int[i][j];
            int sum=0;
            
            int output[][] = new int[i][j];
            
            
            
            
            /*input lena hai*/
            out.println("Please Enter the values in matrix 1: ");
            for(int r=0;r<i;r++)
            {
                for(int c=0;c<j;c++)
                {
                    matrix1[r][c] = inp.nextInt();
                }
            }
            
            
            out.println("Please Enter the values in matrix 2: ");
            for(int r=0;r<i;r++)
            {
                for(int c=0;c<j;c++)
                {
                    matrix1[r][c] = inp.nextInt();
                }
            }
            
            
            
            
            
            
            
            
            
            
            
            
            for(int r=0;r<i;r++)
            {
                for(int c=0;c<j;c++)
                {
                    for(int d=0;d<i;d++)
                    {
                    
                    sum = sum + matrix1[r][d] * matrix2[d][r];
                    
                    }
                    output[r][c] = sum;
                }
            }
                
            
            out.println("Your answer is \n");
            
            for(int r=0;r<i;r++)
            {
                for(int c=0;c<j;c++)
                {
                    out.print(output[r][c] + "\t");
                }
                out.print("\n");
            }
            
        }
        else
        {
            out.println("The matrix multiplication of given size is mot possible because of note simmilar martrix indexes");
        }
        
        
        
        
        
        
        
    }
    
    
}