import java.util.Scanner;

/**
* �Ǻ���ġ ���� (for, scanner)
* @author smart02
* 
*/
public class Loop9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�Ʒ��� �ݺ��� Ƚ���� �Է��ϼ���");
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
	


	



