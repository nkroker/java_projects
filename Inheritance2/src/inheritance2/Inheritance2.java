
package inheritance2;


public class Inheritance2 {

    public static void main(String[] args) {
      
        
        A superOb = new A();
		B subOb = new B();
		
		superOb.i=10;
		superOb.j=20;
		
		System.out.println("Contents of superOb");
		
		subOb.i=11;
		subOb.j=22;
		subOb.k=33;
		
		System.out.println("Contents of subOb");
		
		superOb.showij();
		subOb.showk();
		
		System.out.println();
		System.out.println("Sum of i,j and k in subOb is");
		subOb.sum();
	       
    }
    
}
