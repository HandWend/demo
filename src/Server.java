import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.DocFlavor.INPUT_STREAM;

/**
 * 소켓통신 Server 구축
 * @author smart02
 *
 */
public class Server extends Thread {

	final static int SERVER_PORT = 1225;
	final static String MASSAGE_TO_CLIENT = "Hi, Client";
	
	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		try {
			serverSocket = new ServerSocket(SERVER_PORT);
			

			while(true) {
				System.out.println("socket 연결 대기");
				Socket socket = serverSocket.accept();
				System.out.println("host: "+ socket.getInetAddress()+"통신 연결성공");
				// input, output
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				// buffer를 통해 데이터 읽어들이기
				byte[] data = new byte[16];
				int n = is.read(data);
				// 겁나 길게 와도 처음부터 16글자까지만 받아들이겠다.
				final String messageFromClient = new String(data,0,n);
				// client의 메시지 출력.
				System.out.println(messageFromClient);
				// byte로 받겠다.
				os.write(MASSAGE_TO_CLIENT.getBytes());
				os.flush();
				
				is.close();
				os.close();
				
				socket.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
