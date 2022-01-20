/**
 * 구구단
 * @author smart02
 *
 */
public class Controlflow9 {

	public static void main(String[] args) {
		// 단을 채울 변수 하나, 곱하면서 올라갈 변수 하나 (i, n)
		// 서로서로 올라가야 하기에 중첩문이 쓰여야 함.
		
		for (int i = 1; i<=9; i++) {
			System.out.println("====");
			System.out.printf("%d단\n", i );
			for (int n = 1; n<=9; n++) {
				System.out.printf("%d ", i*n);
				if (n==9) {
					System.out.println();
				}
			}
		}
	}
}
	