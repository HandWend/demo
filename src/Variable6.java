
public class Variable6 { // class block

	public static void main(String[] args) { // method block


		
			int i = 10;
			int j = 20;
			// start
			int k = j; 
			j = i; 
			i = k;
			// end
			/* �׸��� �� �Űܴ��� �����ϱ�
			 * 1. 1���� 2���� ���� ����� �ִ�.
			 * 2. 3�� �׸��� �ϳ� ��� �´�.
			 * 3. 1�� �Ǵ� 2�� �׸��� ���� 3������ �ű��.
			 * ex 1.) 1���� 3������ �Ű��� ���, 2���� 1������, �ٽ� 3���� 2������ �ű��.
			 * ex 2.) 2���� 3������ �Ű��� ���, 1���� 2������, �ٽ� 3���� 1������ �ű��.*/
			System.out.println("i����" + i);
			System.out.println("j����" + j);
			
		
	}
}
