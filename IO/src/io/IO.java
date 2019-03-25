/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io;

import java.io.InputStreamReader;
import static java.lang.System.in;
import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.InputStreamReader;
/**
 *
 * @author Nikhil
 */
public class IO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        /*static public void main(String...arg)
		{*/
			out.println("Enter data");
                        try{
		InputStreamReader isr = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(isr);
		String data = br.readLine();



                            try ( FileWriter fw = new FileWriter("File.txt", true) //true to append the file
                            ) {
                                fw.write(" "+data);
                            }



			/*Now let's read or fetch the data from file that we have created*/

		FileReader fr = new FileReader("File.txt");

		BufferedReader br1 = new BufferedReader(fr);
		String dData = br1.readLine();
                out.println(dData);
                        }
                        catch(IOException e)
                        {
                            
                        }
		

		//}   //closing of the main body
        
        
        // TODO code application logic here
    }
    
}
