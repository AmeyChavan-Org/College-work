import java.net.*;
import java.io.*;
 
public class clientpalindrome
{
    public static void main(String args[])
    {
        Socket server;
        try
        {
            server=new Socket("127.0.0.1",6666);
            System.out.println("ClientConnected");
            BufferedReader br=new BufferedReader(new InputStreamReader(server.getInputStream()));
            BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
            PrintStream ps=new PrintStream(server.getOutputStream());
            String str="";
 
 
            System.out.println("Enter any string :");
            str = br1.readLine();
            ps.println(str);                
            System.out.println(br.readLine());
           
            br.close();
            br1.close();
            server.close();
            ps.close();
        }
        catch(IOException ie){}
    }
}
