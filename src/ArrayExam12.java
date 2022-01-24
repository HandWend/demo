import java.util.Scanner;
/**
 * @author smart02
 * n * n 마방진 
*/
public class ArrayExam12 {
	// 파일명과 클래스명은 동일해야 한다.
	// 참조형의 기본값: null
	public static void main(String[] args) {
		int [] i = new int[2];
		i[0] = 1; // i의 첫번째 인덱스값에 1을 넣겠다.
		System.out.println(i[0]);
		int [] j = null; 
		// int [] j: j라는 배열을 선언하겠다.
		j=i;	// j의 배열의 주소지와 i의 배열의 주소지는 같다.
		System.out.println(i[0]);
		j[0] = 2;
		 i = null; // 20번 라인 오류남. 칸이 없는데 뭘 빼오라는 거냐 같은 느낌.
		System.gc();
		System.out.println(i);
		//System.out.println(i[0]); // i 배열의 첫번째 값을 프린트하겠다.
		System.out.println(j); // 보면 안다.
		System.out.println(j[0]);
	}
}
