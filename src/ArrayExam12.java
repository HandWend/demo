import java.util.Scanner;
/**
 * @author smart02
 * n * n ������ 
*/
public class ArrayExam12 {
	// ���ϸ�� Ŭ�������� �����ؾ� �Ѵ�.
	// �������� �⺻��: null
	public static void main(String[] args) {
		int [] i = new int[2];
		i[0] = 1; // i�� ù��° �ε������� 1�� �ְڴ�.
		System.out.println(i[0]);
		int [] j = null; 
		// int [] j: j��� �迭�� �����ϰڴ�.
		j=i;	// j�� �迭�� �ּ����� i�� �迭�� �ּ����� ����.
		System.out.println(i[0]);
		j[0] = 2;
		 i = null; // 20�� ���� ������. ĭ�� ���µ� �� ������� �ų� ���� ����.
		System.gc();
		System.out.println(i);
		//System.out.println(i[0]); // i �迭�� ù��° ���� ����Ʈ�ϰڴ�.
		System.out.println(j); // ���� �ȴ�.
		System.out.println(j[0]);
	}
}
