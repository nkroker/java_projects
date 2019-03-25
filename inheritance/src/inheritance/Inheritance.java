/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Nikhil
 */
public class Inheritance extends Second {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Inheritance obj = new Inheritance();
        
        int c = obj.get();
        System.out.println("Your answer is: "+c);
        
    }
    
}
