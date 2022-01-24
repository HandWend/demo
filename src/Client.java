import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 클라이언트 소켓 코드
 * @author smart02
 *
 */
public class Client {
	// 상수의 문자명은 전부 다 대문자.
	// 단어와 단어 사이의 만날 때는 (_, 언더바 추가)
	final static String SERVER_IP = "127.0.0.1";
	//  주소, 자기자신 가르킴.
	final static int SERVER_PORT = 1225;
	final static String MASSAGE_TO_SERVER = "Hi, Server";
	// final = 수정 불가.
	public static void main(String[] args) {
		Socket socket = null;
		// 첫 글자가 대문자는 클래스. 기본값 null로 설정.
		try {
			socket = new Socket(SERVER_IP, SERVER_PORT);
			// try - catch 클릭해 주기.
			System.out.println("socket 연결");
			
			InputStream is = socket.getInputStream();
			OutputStream os = socket.getOutputStream();
			
			// buffer를 통해 데이터 읽어들이기
			
			// byte로 받겠다.
			os.write(MASSAGE_TO_SERVER.getBytes());
			os.flush();
			
			byte[] data = new byte[16];
			int n = is.read(data);
			// 겁나 길게 와도 처음부터 16글자까지만 받아들이겠다.
			final String messageFromClient = new String(data,0,n);
			// client의 메시지 출력.
			System.out.println(messageFromClient);
			
			is.close();
			os.close();
			
			socket.close();
			// socket은 꼭 쓰고 닫아줄 것.
		}  catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
