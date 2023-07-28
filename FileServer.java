import java.io.*;
import java.net.*;
public class FileServer
{
    public static void main(String args[])
    {
        try
        {
            ServerSocket ss=new ServerSocket(5656);
					//port number
            System.out.println("Server waiting for client");
            Socket client=ss.accept();
            System.out.println("Client Connected");
		//we created serversocket object 
            BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
		//input from client
            PrintStream ps=new PrintStream(client.getOutputStream());
		
            String fname=br.readLine();
		
        
	if(fname.endsWith(".txt"))    
	   {	
		File ferr=new File(fname);
           
	   if(ferr.exists())
            {
		    FileReader fr=new FileReader(fname);
		    BufferedReader br1=new BufferedReader(fr);
		    String s, rs="";
		 
		    while ((s=br1.readLine())!=null)
		    {   
		        ps.println(s);
		        System.out.println(s);
		    }
		    fr.close();
		    br1.close();
            }
            else
                ps.println("File Not Found, Please enter the file which is there is folder...");
             
            br.close();
            ps.close();
            client.close();
        }else
	{	DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF("Not a text File !!");
	}
	}
        catch(IOException ie){
				System.out.println("IO Exception has occured!");
	}
    }
}
