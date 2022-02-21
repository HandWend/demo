package sum;

public class Exam2 {

	private void onTo100() {
		
		int sum = 0;	// 총합 받기
		int odd = 0;	// 홀수합 받기
		int even = 0;	// 짝수합 받기
		
		for (int m=1; m<=100; m++ ) {
			sum+=m;
			if (m%2==0) {
				even+=m;
			} else {
				odd+=m;
			}
		}
		System.out.print("결과값[출력값] ");
		System.out.print(" 홀수합: " + odd);
		System.out.print(" 짝수합: " + even);
		System.out.println(" 총합: " + sum);
	}
	public static void main(String[] args) {
		new Exam2().onTo100();
	}
}
