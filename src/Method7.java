import java.util.Scanner;

/**
 * 계산기 프로그램 작성
 * 임의 두수 입력 받아  + - * / % 수행하시오 
 * @author smart02
 *
 */
public class Method7 {
	
	public static void main(String[] args) { // main method
		int i = 5;
		int j = 2;
		int res = 0;
		double res2 =0.;
		res = add(i,j);		// 더하기
		System.out.println(i +"+" + j +"=" + res);
		
		res = minus(i,j);		// 빼기
		System.out.println(i +"-" + j +"=" + res );
		
		res = multiple(i,j);
		System.out.println(i +"*" + j +"=" + res);
		
		res2 = divide(i,j);
		System.out.println(i +"/" + j +"=" + res2);
		
		res = remainder(i,j);
		System.out.println(i +"%" + j +"=" + res);
		// 함수 안에 함수 넣는 것은 없다.
		// main이 위에 있던 밑에 있던 상관없음.
	}
	private static int add(int i, int j) {
		return i + j;
	}
	public static int minus(int i, int j) {
		return i - j;
	}
	public static int multiple(int i, int j) {
		return i * j;
	}
	public static double divide(int i, int j) {
		return (double)i / j;
	}
	public static int remainder(int i, int j) {
		return i % j;
	}

}
