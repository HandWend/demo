import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * Ŭ���̾�Ʈ ���� �ڵ�
 * @author smart02
 *
 */
public class Client {
	// ����� ���ڸ��� ���� �� �빮��.
	// �ܾ�� �ܾ� ������ ���� ���� (_, ����� �߰�)
	final static String SERVER_IP = "127.0.0.1";
	//  �ּ�, �ڱ��ڽ� ����Ŵ.
	final static int SERVER_PORT = 1225;
	final static String MASSAGE_TO_SERVER = "Hi, Server";
	// final = ���� �Ұ�.
	public static void main(String[] args) {
		Socket socket = null;
		// ù ���ڰ� �빮�ڴ� Ŭ����. �⺻�� null�� ����.
		try {
			socket = new Socket(SERVER_IP, SERVER_PORT);
			// try - catch Ŭ���� �ֱ�.
			System.out.println("socket ����");
			
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// buffer�� ���� ������ �о���̱�
			
			// byte�� �ްڴ�.
			os.write(MASSAGE_TO_SERVER.getBytes());
			os.flush();
			
			byte[] data = new byte[16];
			int n = is.read(data);
			// �̳� ��� �͵� ó������ 16���ڱ����� �޾Ƶ��̰ڴ�.
			final String messageFromClient = new String(data,0,n);
			// client�� �޽��� ���.
			System.out.println(messageFromClient);
			
			is.close();
			os.close();
			
			socket.close();
			// socket�� �� ���� �ݾ��� ��.
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
