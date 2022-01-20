/**
 * 369 3ÀÇ ¹è¼öÀÏ ¶© Â¦! System.out.println("Â¦");
 * 
 * @author smart02 ¡Ú
 */
public class Loop16 {

	public static void main(String[] args) {

		// for (int i = 1; i <= 50; i++)
		int i = 0;
		while (i <= 50) {
			i++;
			if (i % 3 == 0) {
				System.out.printf("Â¦\n");
				
				continue;
			}
			System.out.printf("%d\t", i);

		}
	}

}
