package dhamakedaar;


import static java.lang.System.in;
import java.util.Scanner;    //Importing all the functions of " java.util "



class Dhamakedaar
{

	Scanner inp = new Scanner(System.in);  //Creating the object of the Scanner method





public static void main(String...args)
{
Scanner inp = new Scanner(in);
String name;
System.out.println("Good morning\n");
System.out.println("Please Enter Your name: ");
name = inp.nextLine();
System.out.println("Is your name is: "+name);

}


}  //closing class Dhamakedaar