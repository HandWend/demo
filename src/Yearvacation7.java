import java.util.Scanner;

/**
 * 연차계산프로그램(년별)
 * 연차계산프로그램(월별)
 * @author smart02
 *
 */
public class Yearvacation7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 스캐너 클래스
		System.out.println("년차를 입력하세요.");
		
		int longevity = scan.nextInt(); // 
		
		while (longevity < 1) { // 
			System.out.println("usage: 양수값을 입력하세요");
			longevity = scan.nextInt(); // 
		}
		switch (longevity) {
		case 1: System.out.println("11개"); break;
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



