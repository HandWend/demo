
public class Controlflow4 {

	public static void main(String[] args) {
		// if문
		int i = 1;
		switch (++i) {
		case 1: // 값을 알고 있을 때 switch문 작성. 
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3:
			System.out.println("3입니다.");
			break;
		case 4:
			System.out.println("4입니다.");
			break;
		case 5:
			System.out.println("5입니다.");
			break;
		default:
			System.out.println("1~5안에 값이 아닙니다.");
			break;
		}
		if (i > 5) { // if는 범위 지정.
				System.out.println("5보다 큽니다.");
		} else if (i == 5) {  
				System.out.println("5랑 같습니다.");
		} else  {
			System.out.println("5보다 작습니다.");
			
		}
}
}