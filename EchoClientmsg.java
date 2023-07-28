import java.net.*;
import java.io.*;
 
public class EchoClientmsg
{
    public static void main(String args[])
    {
        Socket server;
        try
        {
            server=new Socket("127.0.0.1",6666);
            System.out.println("ClientConnected");
            
            BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
            PrintStream ps=new PrintStream(server.getOutputStream());
            String str;
 
 
            System.out.println("Enter any string :");
            while (!(str=br1.readLine()).equalsIgnoreCase("END"));
            {
                ps.println(str);                
                System.out.println("Enter any string :");
            }
            
            br1.close();
            server.close();
            ps.close();
        }
        catch(IOException ie){
			
		System.out.println("IO Exception has occured!");
		}
    }
}
