/**
 *
 * @author Nikhil
 */

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import static java.lang.System.out;
import static java.lang.System.in;


public class Client 
{
 
    
    public static void main(String...arg) throws Exception
    {
        Scanner inp = new Scanner(in);
        out.print("Enter Server name: ");
        String serverName = inp.next();
        
        
        out.print("Enter the UserId: ");
        String userId = inp.nextLine();
        
        
        out.print("Enter the Password: ");
        String password = inp.nextLine();
        
        out.println(userId+"________________________"+password);
        
        Registry reg = LocateRegistry.getRegistry(serverName,2001);
        LoginInterface li = (LoginInterface)reg.lookup("AUTH");   //It search bind method
        
        boolean bool = li.checkLogin(userId, password);
        if(bool)
        {
            out.println("Welcome");
        }
        else
        {
            out.println("Invalid ID/Password");
        }
        
        
        
    }
    
    
    
    
    
}
