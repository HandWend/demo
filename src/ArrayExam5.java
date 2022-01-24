import java.util.Scanner;

/**
 * 국영수 성적처리프로그램
 * 국영수 각각, 총합, 평균
 * @author smart02
 *
 */
public class ArrayExam5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int [] grade = new int [5];
		System.out.println(grade.length); // 배열의 길이
		System.out.println("국어성적을 입력하시오");
		grade[0] = scan.nextInt();
		System.out.println("수학성적을 입력하시오");
		grade[1] = scan.nextInt();
		System.out.println("영어성적을 입력하시오");
		grade[2] = scan.nextInt();
		grade[3] = grade[0] + grade[1] + grade[2];
		grade[4] = grade[3] / 3;
		System.out.printf("국어:%d, 영어:%d, 수학:%d\n", grade[0], grade[1], grade[2] );
		System.out.printf("총합: %d, 평균: %d", grade[3], grade[4]);
		System.out.println();
	}

}
