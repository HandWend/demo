import java.util.Scanner;

/**
 * 계산기 프로그램 작성
 * 임의 두수 입력 받아  + - * / % 수행하시오 
 * @author smart02
 *
 */
public class Method6 {
	
	public static void main(String[] args) { // main method
		int i = 4;
		int j = 2;
		int k = 0;
		add(i,j);		// 더하기
		minus(i,j);		// 빼기
		multiple(i,j);	// 곱하기
		divide(i,j);	// 나누기
		remainder(i,j); // 나머지
		
	}
	public static void add(int i, int j) {
		int add = i + j;
		System.out.println(i +"+" + j +"=" + add);
	}
	public static void minus(int i, int j) {
		int minus = i - j;
		System.out.println(i +"-" + j +"=" + minus);
	}
	public static void multiple(int i, int j) {
		int multiple = i * j;
		System.out.println(i +"*" + j +"=" + multiple);
	}
	public static void divide(int i, int j) {
		int divide = i / j;
		System.out.println(i +"/" + j +"=" + divide);
	}
	public static void remainder(int i, int j) {
		int remainder = i % j;
		System.out.println(i +"%" + j +"=" + remainder);
	}

}
