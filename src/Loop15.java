/**
 * 369 3ÀÇ ¹è¼öÀÏ ¶© Â¦! 
 * System.out.println("Â¦");
 * @author smart02 ¡Ú
 */
public class Loop15 {

	public static void main(String[] args) {
		int j = 10;
		int sum = 0;
		int max = 30;
		for (int i = 1; i <= max; i++) {
			if (i % 3 == 0) {
				sum += i;
				System.out.print(i);
				if (i != (max-(max%3)))  {
					System.out.print("+");
				}
			}
		}

		System.out.println("=" + sum);

	}

}
