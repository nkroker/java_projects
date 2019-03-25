
package inheritance2;

public class B extends A {
    
    int k;
	
	void showk()
	{
		System.out.print("\nk: "+k+"\n");
		
	}
	
	
	
	void sum()
	{
		int d = i+j+k;
		
		System.out.println("i+j+k = "+ d );
	}
    
}
