/**
* for�� / while��
* @author smart02
* 1���� 10���� ���
*/
public class Loop1 {

	public static void main(String[] args) {
		{for (int i=1; i<=10; i++) {
			System.out.printf("i�� ���� %d�Դϴ�.\n", i);
			}
		}
		System.out.println("====== for ======");
		{for (int k=1; k<=10; ++k) {
			System.out.printf("k�� ���� %d�Դϴ�.\n", k);
		}
		}
		System.out.println("====== for ======");
		{
			int j=1;
			while (j<=10) {
			System.out.printf("j�� ���� %d�Դϴ�.\n", j);
			j++;
			}
		}
		System.out.println("====== while ======");
		{
			int l=1;
			while (l<=10) {
			System.out.printf("l�� ���� %d�Դϴ�.\n", l);
			++l;
			}
		}
		System.out.println("============");
		{
			// do ~ while: �ʱⰪ�� �ְ� ������ ��.
			int i = 1;
			do {
				System.out.println(i + ". joker");
				i++;
			} while (i<=5);
				
		}
		System.out.println("===== for =======");
		{
			// 1���� 10���� ���� �������� ����Ͻÿ�.
			int sum=0;
			for (int m = 1; m <= 100; m++) {
				 System.out.println(sum); 
				sum+=m;
			}
			System.out.println("============");
			System.out.println(sum); // ������� ���.
		}	
	}
}



