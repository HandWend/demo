/**
 * 1���� 10���� ���� �� 3�� ����� ������ ���Ͻÿ�.
 * 
 * @author smart02 ��
 */
public class Loop17 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i<=100; i++) {
			if (i % 3 == 0) {
			// System.out.printf("3�� ���:%d ", i); (X), 3�� ��� ������ ��ġ �ľǿ�
			sum+=i; 							// 3�� ������� i�� ���� �׸� �غ�.
			//System.out.printf("����: %d\n", sum); (X), SUM ������ ��ġ �ľǿ�
			}
		}
		System.out.printf("����: %d\n", sum); // �� �ٸ� �������ϱ�
	}

}
