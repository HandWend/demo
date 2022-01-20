
public class Controlflow {

	public static void main(String[] args) {
		// if문
		int i = 4;
		{	// 지역
			if (i > 5) {
				System.out.println("5보다 큽니다.");
			}
		}

		{	// 지역
			if (i == 5) {
				System.out.println("5랑 같습니다.");
			}
		}
		{	// 지역
			if (i < 5) {
				System.out.println("5보다 작습니다.");
			}
		}

	}
}
