

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;



public class Check1 extends UnicastRemoteObject implements LoginInterface
{

    @Override
    public boolean checkLogin(String userId, String password) throws RemoteException 
    {
     
        if(userId.equals("aye raju"))
        {
            if(password.equals("ni re baba"))
            {
                return true;
            }
        }
        else
        {
            return false;
        }
        
        
        
    }

    
}