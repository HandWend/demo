import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
* ��� ���� ��ǻ�� �ð� ����ϱ�
* @author smart02
* 2022�� �޷��� ����Ͻÿ�. 
*/
public class Loop7 {

	public static void main(String[] args) {
		for(;;) {
			
			LocalDateTime ldt = LocalDateTime.now();
			System.out.print(ldt.getHour()+":");
			System.out.print(ldt.getMinute()+":");
			System.out.println(ldt.getSecond());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	}
	


	



