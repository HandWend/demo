/**
 * �� ���
 * 
 * @author smart02 ��
 */
public class Loop11 {

	public static void main(String[] args) {
		// �� ��� (star�� s, �ݺ��� r)
		for (int s = 1; s <= 5; s++) {
			System.out.println("");
			for (int r = 1; r <= s; r++) {
				System.out.print('*');
			}
		}
		System.out.println();
		System.out.println("=========");

		for (int s = 5; s >= 1; s--) {
			System.out.println("");
			for (int r = 1; r <= s; r++) {
				System.out.print("*");
			}
		}
		System.out.println();
		System.out.println("==========");
		
		for (int s = 1; s<=5; s++ ) {
			System.out.print("\t ");
			for (int r = 1; r<=5; r++ ) {
				System.out.println("*");
			}
		}
	}
}
