/**
 * ������
 * @author smart02
 *
 */
public class Controlflow9 {

	public static void main(String[] args) {
		// ���� ä�� ���� �ϳ�, ���ϸ鼭 �ö� ���� �ϳ� (i, n)
		// ���μ��� �ö󰡾� �ϱ⿡ ��ø���� ������ ��.
		
		for (int i = 1; i<=9; i++) {
			System.out.println("====");
			System.out.printf("%d��\n", i );
			for (int n = 1; n<=9; n++) {
				System.out.printf("%d ", i*n);
				if (n==9) {
					System.out.println();
				}
			}
		}
	}
}
	