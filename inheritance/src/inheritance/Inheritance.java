/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author HP
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      A superOb=  new A();
        B subOb=new B();
                superOb.i=10;
                superOb.j=20;
                System.out.println("contents of superob");
                subOb.i=10;
                subOb.j=8;
                subOb.k=9;
               System.out.println("cobntents of ");
               subOb.showij();
               subOb.k();
              System.out.println();
              System.out.println("sum of  i,j nd k in subob");
              subOb.sum();
    }
    
}
