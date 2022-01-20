import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
* 사용 중인 컴퓨터 시간 출력하기
* @author smart02
* 2022년 달력을 출력하시오. 
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
	


	



