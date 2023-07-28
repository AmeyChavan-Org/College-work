import java.net.*;
import java.io.*;
import java.util.*;

class myserverdate
{
	public static void main(String args[]) throws UnknownHostException,IOException
	{
		ServerSocket ss = new ServerSocket(50710);
		System.out.println("\n Server Started ,Waiting for client to connect.");
		Socket s = ss.accept();
		System.out.println("\n Client connected !");
				
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		dos.writeUTF("Server date = "+(new Date()).toString()+"");

		System.out.println("\n Server closed");
		dos.close();		
		s.close();
	
	}
}
