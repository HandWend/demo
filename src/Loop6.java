import java.text.SimpleDateFormat;
import java.util.Date;

/**
* 
* @author smart02
* 2022년 달력을 출력하시오. 
*/
public class Loop6 {

	public static void main(String[] args) {
		//int sec = (60*60*14)+(32*60);
		// System.out.println(sec); // 전체초
		//for (int i = 0; i < 10; i++)
		
		SimpleDateFormat format = new SimpleDateFormat("hh:mm:dd");
		
//		for (;;) {
			
//		Date cal = new Date();
//	System.out.println(format.format(cal));
			
			/*sec++;
			
			System.out.print((sec)/(60*60) + "시 "); // 시
			System.out.print(((sec)%(60*60))/60 + "분 "); // 분
			System.out.println(((sec)%(60*60))%60 + "초"); // 초
			*/
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	


	



