import java.net.*;
import java.io.*;
import java.util.Scanner;
class MyClient
{
	//ServerSocket ss;  //remove for client
	Socket s;
	BufferedReader brkey;
	BufferedReader br;
	PrintWriter out;
	String msg,data;
	MyClient()
				{
					brkey = new BufferedReader(new InputStreamReader(System.in));
					try {
						Socket s = new Socket(InetAddress.getLocalHost(),9998);
						//ss = new ServerSocket(9998);
						System.out.println("Connected on Port 9999");
						//s = ss.accept();
						if(s!=null)
						{
							System.out.println("Connected with client on port 9999");
							br = new BufferedReader(new InputStreamReader(s.getInputStream()));
							out = new PrintWriter(s.getOutputStream(),true);
							
							boolean check = true;
							while(check)
							{
								
//								data = br.readLine();
//								System.out.println("Client:" +data);
//								if(data.equalsIgnoreCase("Bye"))
//								{
//									check = false;
//								}
								System.out.println("<<");
								msg = brkey.readLine()	;
								out.println(msg);
								data = br.readLine();
								System.out.println("Server:" +data);
								if(data.equalsIgnoreCase("Bye"))
								{
									check = false;
								}
								
							}
						}
						}catch(IOException e) {
							e.printStackTrace();
						}
					}
				}

public class client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyClient();

	}

}


