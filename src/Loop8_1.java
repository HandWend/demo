import java.util.Scanner;
/**
* 
* @author smart02
* 피보나치 수열 (while)
* scanner로 반복 횟수 입력받아서 출력하기
*/
public class Loop8_1 {

	public static void main(String[] args) {
		int m = 0; // 앞 숫자
		int n = 1; // 뒤 숫자
		int r = 1; // 반복하는 수
		int o = m + n; // 받는 수
		while (r <= 7 ) {
			System.out.printf("%d %d %d \n", m,n,o);
			m = n;
			n = o;
			o = m+n;
			r ++;
			
			
		}
	}
}
	


	



