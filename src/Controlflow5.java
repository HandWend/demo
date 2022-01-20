
public class Controlflow5 {

	public static void main(String[] args) {
		// if문
		int i = 60;
		
		switch (i)  {
		
		case 90:
			// 값을 알고 있을 때 switch문 작성.
			if (i >= 90) { // if는 범위 지정.
				System.out.println("A");
			System.out.println("A");}
			break;
		case 80:
			if (i >= 80) {
				System.out.println("B");}
			System.out.println("B");
			break;
		case 70:
			if (i >= 70) {
				System.out.println("C");
			System.out.println("C");}
			break;
		case 59:
			if (i < 70) {
				System.out.println("F");
			System.out.println("F");
			break;
		
		}

		if (i >= 90) { // if는 범위 지정.
			System.out.println("A");
		} else if (i >= 80) {
			System.out.println("B");
		} else if (i >= 70) {
			System.out.println("C");
		} else if (i < 70) {
			System.out.println("F");

		}
	}
}
}