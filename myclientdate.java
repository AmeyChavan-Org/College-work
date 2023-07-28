import java.net.*;
import java.io.*;


class myclientdate
{
	public static void main(String args[]) throws UnknownHostException,IOException
	{
		Socket s = new Socket("localhost",50710);
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));	
		System.out.println("\n Server date and time is : "+br.readLine());
		System.out.println("\n Client Closed !!");
		s.close();
	
	}
}
