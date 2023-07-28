import java.net.*;
import java.io.*;


class myclient
{
	public static void main(String args[]) throws UnknownHostException,IOException
	{
		Socket s = new Socket("192.168.28.82",6666);
				//here we have added ipv4 address of server pc and
				//the port number of server and client should be same
		System.out.println("\n Inetaddress associated with the socket : "+s.getInetAddress());
		System.out.println("\n Port to which socket is connected : "+s.getPort());
		System.out.println("\n Local Port to which socket is connected : "+s.getLocalPort());
		s.close();
	
	}
}
