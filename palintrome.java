import java.util.Scanner;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;

class Testt
{

private String inputString="";


public static void main(String...arg)
{

	Scanner inp = new Scanner(in);
	out.print("Please Enter a String: ");
	inputString=inp.nextLine();
	
	out.println(checkPalindrome(inputString));
	

}



boolean checkPalindrome(String inputString) {
        String reverse=""; 
        int length = inputString.length();
        for(int i=length-1;i>=0;i--)
                reverse += inputString.charAt(i);
        if(inputString.equals(reverse))
                return true;
        else
                return false;
}


}