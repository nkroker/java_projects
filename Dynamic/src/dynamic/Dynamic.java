/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamic;



import java.util.Scanner;
//import java.util.Arrays;
import static java.lang.System.in;
import static java.lang.System.out;



public class Dynamic {

    static
	{
		out.println("Welcome to the Dynamic array :) ");
	}

	static public void main(String...arg)
		{
		
			Scanner inp = new Scanner(in);
			ArrayList<String> name = new ArrayList<String>();
			out.println("Please enter the number of names in list");
			int i,n = inp.nextInt();
			String naam;

			for(i=0;i<n;i++)
			{
				naam = inp.nextLine();
				name.add(naam);				
			}   //closing of input loop


			out.println("Are these names are correct: ");
			
				out.println(name);
			
			
		}
    
}
