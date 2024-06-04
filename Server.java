import java.net.*;
import java.io.*;
import java.util.Scanner;
class MyServer
{
	ServerSocket ss;  //remove for client
	Socket s;
	BufferedReader brkey;
	BufferedReader br;
	PrintWriter out;
	String msg,data;
				MyServer()
				{
					brkey = new BufferedReader(new InputStreamReader(System.in));
					try {
						//Socket s = new Socket(new inetAddress.getLocatin
						ss = new ServerSocket(9998);
						System.out.println("Listening on Port 9998");
						s = ss.accept();
						if(s!=null)
						{
							System.out.println("Connected with client on port 9999");
							br = new BufferedReader(new InputStreamReader(s.getInputStream()));
							out = new PrintWriter(s.getOutputStream(),true);
							
							boolean check = true;
							while(check)
							{
								data = br.readLine();
								System.out.println("Client:" +data);
								if(data.equalsIgnoreCase("Bye"))
								{
									check = false;
								}
								System.out.println("<<");
								msg = brkey.readLine()	;
								out.println(msg);
								
							}
						}
						}catch(IOException e) {
							e.printStackTrace();
						}
					}
				}

public class Server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyServer();

	}

}
