import java.util.Scanner;
/**
* 
* @author smart02
* �Ǻ���ġ ���� (while)
* scanner�� �ݺ� Ƚ�� �Է¹޾Ƽ� ����ϱ�
*/
public class Loop8_1 {

	public static void main(String[] args) {
		int m = 0; // �� ����
		int n = 1; // �� ����
		int r = 1; // �ݺ��ϴ� ��
		int o = m + n; // �޴� ��
		while (r <= 7 ) {
			System.out.printf("%d %d %d \n", m,n,o);
			m = n;
			n = o;
			o = m+n;
			r ++;
			
			
		}
	}
}
	


	



