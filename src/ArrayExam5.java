import java.util.Scanner;

/**
 * ������ ����ó�����α׷�
 * ������ ����, ����, ���
 * @author smart02
 *
 */
public class ArrayExam5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		
		int [] grade = new int [5];
		System.out.println(grade.length); // �迭�� ����
		System.out.println("������� �Է��Ͻÿ�");
		grade[0] = scan.nextInt();
		System.out.println("���м����� �Է��Ͻÿ�");
		grade[1] = scan.nextInt();
		System.out.println("������� �Է��Ͻÿ�");
		grade[2] = scan.nextInt();
		grade[3] = grade[0] + grade[1] + grade[2];
		grade[4] = grade[3] / 3;
		System.out.printf("����:%d, ����:%d, ����:%d\n", grade[0], grade[1], grade[2] );
		System.out.printf("����: %d, ���: %d", grade[3], grade[4]);
		System.out.println();
	}

}
