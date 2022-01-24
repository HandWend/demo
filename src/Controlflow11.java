import java.util.Scanner;

/**
 * 월별 프로그램 작성하시오
 * @author smart02
 *
 */
public class Controlflow11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); // 스캐너 클래스
		System.out.println("년차를 입력하세요."); 
		
		
		int longevity = 0; // 1년차
		
		do {
			System.out.println("usage: 양숫값을 입력하세요");
			longevity = scan.nextInt();
		} while (longevity<1);
		
		int longevityYear = longevity / 12;  // 년을 월로 계산.
		if (longevity %12 >0 ) { 			 
			longevityYear ++;				 // 나머지가 생기면 +1
		}
		// 입사 후 신입사원의 값은 11개로 통합계산.
		switch (longevityYear) {
		case 1: System.out.println("연차갯수가 "+(longevity - 1)+"개"); break; 
		// 2개월 1개, 3개월 2개, 4개월 3개, 5개월 4개 등 하나씩 빼주기.
		case 2: System.out.println("15개"); break;
		case 3: case 4: System.out.println("16개"); break;
		case 5: case 6: System.out.println("17개"); break;
		case 7: case 8: System.out.println("18개"); break;
		case 9: case 10: System.out.println("19개"); break;
		case 11: case 12: System.out.println("20개"); break;
		case 13: case 14: System.out.println("21개"); break;
		case 15: case 16: System.out.println("22개"); break;
		case 17: case 18: System.out.println("23개"); break;
		case 19: case 20: System.out.println("24개"); break;
		default: System.out.println("25개"); break;
		}
		
	}
}
	