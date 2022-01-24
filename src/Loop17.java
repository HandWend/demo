/**
 * 1부터 10까지 정수 중 3의 배수의 총합을 구하시오.
 * 
 * @author smart02 ★
 */
public class Loop17 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if (i % 3 == 0) {
			// System.out.printf("3의 배수:%d ", i); (X), 3의 배수 나오는 위치 파악용
			sum+=i; 							// 3의 배수값인 i를 담을 그릇 준비.
			//System.out.printf("총합: %d\n", sum); (X), SUM 찍히는 위치 파악용
			}
		}
		System.out.printf("총합: %d\n", sum); // 한 줄만 나오게하기
	}

}
