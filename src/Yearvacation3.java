import java.util.*;
public class Yearvacation3 {

	public static void main(String[] args) {
		
		
		
		int i=1; // 개월 차
		int j=0;
		int k=3;
		
		while (i<=12) {
			System.out.printf("당신은 %d개월 간 일하였습니다.\n", i);
			System.out.printf("당신의 연차는 %d일이 되었습니다.\n", j);
			System.out.println("===");
			i++;
			j++;
			
		}
		System.out.println("1년차 때 휴가를 사용하지 않으면 다음 해로 이월됩니다.");
		switch (k) {
		case 2:System.out.println("당신의 연차는 15일입니다."); break;
		case 3: case 4: System.out.println("16일"); break;
		case 5: case 6: System.out.println("17일"); break;
		case 7: case 8: System.out.println("18일"); break;
		case 9: case 10: System.out.println("19일"); break;
		case 11: case 12: System.out.println("20일"); break;
		case 13: case 14: System.out.println("21일"); break;
		case 15: case 16: System.out.println("22일"); break;
		case 17: case 18: System.out.println("23일"); break;
		case 19: case 20: System.out.println("24일"); break; 
		default : System.out.println("25일");
			
		
		}
	}
	

	}



