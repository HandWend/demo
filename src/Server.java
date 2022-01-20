import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import javax.print.DocFlavor.INPUT_STREAM;

/**
 * ������� Server ����
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
				System.out.println("socket ���� ���");
				Socket socket = serverSocket.accept();
				System.out.println("host: "+ socket.getInetAddress()+"��� ���Ἲ��");
				// input, output
				InputStream is = socket.getInputStream();
				OutputStream os = socket.getOutputStream();
				
				// buffer�� ���� ������ �о���̱�
				byte[] data = new byte[16];
				int n = is.read(data);
				// �̳� ��� �͵� ó������ 16���ڱ����� �޾Ƶ��̰ڴ�.
				final String messageFromClient = new String(data,0,n);
				// client�� �޽��� ���.
				System.out.println(messageFromClient);
				// byte�� �ްڴ�.
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
