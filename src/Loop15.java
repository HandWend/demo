/**
 * 369 3의 배수일 땐 짝! 
 * System.out.println("짝");
 * @author smart02 ★
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
