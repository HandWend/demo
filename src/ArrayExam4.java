/**
 * 국영수 성적처리프로그램
 * 국영수 각각, 총합, 평균
 * @author smart02
 *
 */
public class ArrayExam4 {

	public static void main(String[] args) {
		int kor = 0;
		int eng = 0;
		int math = 0;
		int total = 0;
		double avg = 0;
		kor = 80;
		eng = 100;
		math = 70;
		total = kor + eng + math;
		avg = total / 3;
		System.out.printf("국어:%d, 영어:%d, 수학:%d\n", kor, eng, math );
		System.out.printf("총합: %d, 평균: %.1f", total, avg);
		double [] grade = {kor, eng, math, total, avg};
		
	}

}
