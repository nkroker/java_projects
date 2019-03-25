/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sodapop;

import java.util.*;

/**
 *
 * @author Nikhil
 */


public class Sodapop 
{


public static void main(String[] args)
{

Scanner inp =  new Scanner(System.in);


String choice;

System.out.println("Hii There\n");
System.out.println("Menue is\n");
System.out.println("\n* Mango juice\n* Orange juice\n* Pinaple juice\n* Masala Soda\n* Blueberry\n* Lemonsoda\n");
System.out.println("Please Enter Your choice\n");
System.out.println("Only Enter the first word of your choice\n");

choice = inp.nextLine();


switch(choice)
{

	case "Mango":
	
		System.out.println("Please Enjoy your "+choice+" drink");
	 break;


	case "Orange":
	
		System.out.println("Please Enjoy your "+choice+" drink");
	 break;


	case "Pinaple":
	
		System.out.println("Please Enjoy your "+choice+" drink");
	 break;


	case "Masala":
	
		System.out.println("Please Enjoy your "+choice+" drink");
	 break;


	case "Blueberry":
	
		System.out.println("Please Enjoy your "+choice+" drink");
	 break;


	case "Lemonsoda":
	
		System.out.println("Please Enjoy your "+choice+" drink");
	 break;

	case "default":
	
		System.out.println("Please Enter the correct choice");
	

}   //closing of switch




}  //closing main

}  //Closing of class

