/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_demo;

/**
 *
 * @author Nikhil
 */
public class Test_demo {

    private int date,month,year;

public void gDate(){

date = 9;
month = 4;
year = 2017;

} //closing the get date

public void putdate(){

	System.out.println("the date is:->  "+date+"/"+month+"/"+year);
}


public static void main(String[] args){

Test_demo obj = new Test_demo();

System.out.println("The output of the program is = \n");
obj.gDate();
obj.putdate();


}


    
}
