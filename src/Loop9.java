import java.util.Scanner;

/**
* 피보나치 수열 (for, scanner)
* @author smart02
* 
*/
public class Loop9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("아래에 반복할 횟수를 입력하세요");
		int m = 0;
		int n = 1;
		int o = m + n;
		for (int r=scan.nextInt(); 0<r; r--) {
			//System.out.printf("%d %d %d \n", m,n,o);
			m = n;
			n = o;
			o = m + n;
			System.out.printf("%d + %d = %d \n", m,n,o);
		}
	}
}
	


	



