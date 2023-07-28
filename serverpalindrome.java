import java.net.*;
import java.io.*;
public class serverpalindrome
{
    public static void main(String args[])
    {
        ServerSocket ss;
        Socket client;
	
        try
        {
            ss=new ServerSocket(6666);
            System.out.println("Activated!!!Waiting for client");
            client=ss.accept();
            System.out.println("Client is Connected");
            BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream()));
            PrintStream ps=new PrintStream(client.getOutputStream());
            String str=br.readLine();
	    
           
		String rev="";
		for(int i=str.length()-1;i>=0;--i)
		{
			rev= rev + str.charAt(i);		//reversing the string 
		}
		if(str.equals(rev))//if the string provided is is requal to the reversing string then 		
		  {
			ps.println(str+"  is palindrome");//its palindrome
	          }		
		else
		  {
			ps.println(str+"  is not palindrome");
            	  }	
	    //closing the resources
            br.close();
            client.close();
            ps.close();
        }
        catch(IOException ie){}
    }
}
