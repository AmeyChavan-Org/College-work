import java.io.*;
import java.net.*;
public class FileClient
{
    public static void main(String args[])
    {
        try
{
            Socket server=new Socket("127.0.0.1",5656);
            System.out.println("Client Connected");
            BufferedReader br=new BufferedReader(new InputStreamReader(server.getInputStream()));
            BufferedReader br1=new BufferedReader(new InputStreamReader(System.in));
            PrintStream ps=new PrintStream(server.getOutputStream());
            System.out.print("Enter File Name:");
            String fname=br1.readLine();
            ps.println(fname);
            String s;
            s=br.readLine();
            while (s!=null)
            {
                System.out.println(s);
                s=br.readLine();
            }
            br1.close();
            br.close();
            ps.close();
            server.close();
        }
        catch(IOException ie){}
    }
}