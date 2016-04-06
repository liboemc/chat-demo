package demo.chat.chat_demo.socket;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SocketClientMain {

	
	void mySocketClient() throws UnknownHostException, IOException{
		int sum=0;
		while (sum<10) {
			Socket socket=new Socket("127.0.0.1",7788);
			OutputStream oStream=socket.getOutputStream();
			BufferedWriter bWriter=new BufferedWriter(new OutputStreamWriter(oStream));
			bWriter.write("hello world   "+(++sum));
			bWriter.close();
			oStream.close();
			socket.close();	
			
		}
		
		
		
	}
	public static void main(String[] args) throws UnknownHostException, IOException {
		SocketClientMain scm=new SocketClientMain();
		scm.mySocketClient();
	}

}
