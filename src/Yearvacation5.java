public class Yearvacation5 {

	public static void main(String[] args) {
		// 연차 날짜 알려주기
		int i = 2*12-1;// (단위: 월)
		// 2년마다 연차 1일 증가, 20년차부터는 무조건 25일
		switch (i/12) {
		case 0: System.out.println("입사 한달 후 하나의 연차가 생깁니다."); break;
		case 1: System.out.println("입사 후 한 달간 사용하지 않았으면 11일"); break;
		case 2: System.out.println("15일"); break;
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

