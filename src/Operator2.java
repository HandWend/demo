
public class Operator2 {

	public static void main(String[] args) { // country
		// 산술연산자 [+ - * / %]
		double i = 10;
		int j = 3;
		// double과 int의 연산은 double처럼 나옴.
		
		System.out.printf("%2.2f + %d = %2.2f\n", i, j, i+j); // 더하기
		System.out.println(i-j); // 빼기
		System.out.println(i*j); // 곱하기
		System.out.println(i/j); // 나누기
		System.out.printf("%.1f\n",i%j);
		System.out.printf("%.2f\n",i%j);
		System.out.printf("%.3f\n",i%j);
		
		System.out.println(i%j); // 나머지
		
		
	}

}
