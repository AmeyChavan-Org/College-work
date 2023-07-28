import java.net.*;
import java.io.*;
public class EchoServermsg
{
    public static void main(String args[])
    {
        ServerSocket ss;
        Socket client;
        try
        {
            ss=new ServerSocket(6666);
            System.out.println("Server has srated waiting for client connection");
            client=ss.accept();
            System.out.println("ClientConnected");
            BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            String str;
            while ((str=br.readLine())!=null)
            {
                System.out.println(str);
            }
            br.close();
            client.close();
        }
        catch(IOException ie){
	System.out.println("IO Exception has occured!");		
	}
    }
}
