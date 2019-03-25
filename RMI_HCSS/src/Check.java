

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class Check extends UnicastRemoteObject implements LoginInterface
{

    @Override
    public boolean checkLogin(String userId, String password) throws RemoteException 
    {
     
        if(userId.equals("Admin")&&password.equals("admin123"))
        {
                     
                return true;   
        }
        else
        {
            return false;
        }
        
        
        
    }

    
}