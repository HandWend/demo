/**
 * ������ ����ó�����α׷�
 * ������ ����, ����, ���
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
		System.out.printf("����:%d, ����:%d, ����:%d\n", kor, eng, math );
		System.out.printf("����: %d, ���: %.1f", total, avg);
		double [] grade = {kor, eng, math, total, avg};
		
	}

}
