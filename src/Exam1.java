package fibonacci;

public class Exam1 {

	private void fibonacci() {
		int firstNum = 0;		// 앞의 숫자
		int secNum = 1;	// 뒷 숫자
		int repeat = 1;	// 반복횟수
		int bowl = 0;	// 받는 수
		
		while (repeat<=6) {
			if (bowl > 0 ) {
				System.out.print(bowl + " ");
			}
			
			firstNum = secNum;
			secNum = bowl;
			bowl = firstNum + secNum;
			repeat++;
		}
	}
	public static void main(String[] args) {
		new Exam1().fibonacci();
	}
}
