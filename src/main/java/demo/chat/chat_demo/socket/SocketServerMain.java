package demo.chat.chat_demo.socket;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerMain {

	void  mySocketServer() throws IOException{
		ServerSocket ssoSocket=new ServerSocket(7788);
		System.out.println("socketServer is start...");
		while (true) {
			Socket sk=ssoSocket.accept();
			InputStream iStream=sk.getInputStream();
			BufferedReader bReader=new BufferedReader(new InputStreamReader(iStream));
			String string=bReader.readLine();
			System.out.println("this is server ，client say："+string);
			bReader.close();
			iStream.close();
			sk.close();
			
		}
		
	} 
	
	
	public static void main(String[] args) throws IOException {
		SocketServerMain sMain=new SocketServerMain();
		sMain.mySocketServer();
	}

}
