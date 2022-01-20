/**
 * 홀짝 확인 프로그램 작성하시오
 * @author smart02
 *
 */
public class Controlflow8 {

	public static void main(String[] args) {
		/*int i=59;
		// System.out.println("[DEG]"+(i%2==0));
		if (i % 2 == 0) {
			System.out.println("i는 짝수입니다.");
		} else { 
			System.out.println("i는 홀수입니다."); 
		}*/

		/*int i=1;
		if (i % 3 == 1 ) {
			System.out.println("손님의 승리입니다.");
		}
		else if (i % 3==2) {
			System.out.println("손님의 승리입니다.");
		}else {
			System.out.println("나의 승리입니다.");
		}*/
	
		//가위바위보 프로그램을 작성하시오
		int user1 = (int)(Math.random()*3)+1; //본인
		int user2 = (int)(Math.random()*3)+1; //상대방
		
		if (user1==1) {
			System.out.println("나는 가위");
		} else if (user1==2) {
			System.out.println("나는 바위");
		} else { 
			System.out.println("나는 보");
		}
		
		if (user2==1) {
			System.out.println("상대방은 가위");
		} else if (user2==2) {
			System.out.println("상대방은 바위");
		} else { 
			System.out.println("상대방은 보");
		}
		if (user1 == 1 && user2==1) {
			System.out.println("비겼습니다.");
		} else if (user1==1 && user2 ==2) {
			System.out.println("ㅠㅠ");
		} else if (user1==1 && user2==3) {
			System.out.println("ㅎㅎ");
		} else if(user1 == 2 && user2==1) {
			System.out.println("ㅎㅎ");
		} else if (user1==2 && user2==2) {
			System.out.println("비김");
		} else if (user1==2 && user2==3) {
			System.out.println("ㅠㅠ");
		} else if(user1 ==3 && user2==1) {
			System.out.println("ㅠㅠ");
		} else if (user1==3 && user2==2) {
			System.out.println("ㅎㅎ");
		} else if (user1==3 && user2==3) {
			System.out.println("비김.");
		} 
		
	}
}
	