import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.net.Socket;
import java.net.ServerSocket;

class Server
{
	public static void main(String...arg)throws Exception
	{
		ServerSocket ss=new ServerSocket(2000);
		System.out.println("Server is ready and waiting for connection");
		//Socket socket=ss.accept();
                Socket socket = ss.accept();
                System.out.println("Hello");
		InputStreamReader isr=new InputStreamReader(socket.getInputStream());
		BufferedReader br=new BufferedReader(isr);
		while(true)
		{
			String data=br.readLine();
			if(data.length()==0)
			break;
			System.out.println(data);
		}
	}
}