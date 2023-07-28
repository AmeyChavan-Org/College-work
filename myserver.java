import java.net.*;
import java.io.*;


class myserver
{
	public static void main(String args[]) throws UnknownHostException,IOException
	{
		ServerSocket ss = new ServerSocket(50710);
		System.out.println("\n Server Started ,Waiting for client to connect.");
		Socket s = ss.accept();
		System.out.println("\n Client connected !");
		System.out.println("\n Server closed");
		s.close();
	
	}
}
