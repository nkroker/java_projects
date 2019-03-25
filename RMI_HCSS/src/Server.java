
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.registry.Registry;

public class Server 
{
    
   public static void main(String...arg) throws Exception
   {
       Registry reg = LocateRegistry.createRegistry(2001);
       System.out.println("Server is ready");
       
       
       Check1 check=new Check1();
       reg.bind("AUTH", check);
   }
    
    
}
